package co.sapphire.multidatabaseconfig.MySQlDBResources.exceptions;

import co.sapphire.multidatabaseconfig.MySQlDBResources.utils.ErrorResponse;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }


//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    public ResponseEntity<ErrorResponse> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex, WebRequest request) {
//        String message = "Malformed JSON request";
//        String details = ex.getMessage();
//        String hint = "";
//        Throwable cause = ex.getCause();
//        if (cause instanceof DateTimeParseException) {
//            hint = "Ensure the date is in the format dd-MM-yyyy";
//        }
//        ErrorResponse errorResponse = new ErrorResponse(message, details, hint);
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorResponse> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex, WebRequest request) {
        String message = "Malformed JSON request";
        String hint = "Check the JSON format and structure";

        Throwable cause = ex.getCause();
        if (cause instanceof JsonMappingException) {
            hint = handleJsonMappingException((JsonMappingException) cause);
        }

        ErrorResponse errorResponse = new ErrorResponse(message, ex.getMessage(), hint);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    private String handleJsonMappingException(JsonMappingException ex) {
        if (ex instanceof InvalidFormatException) {
            return "Invalid value format for field: " + getInvalidField(ex);
        } else if (ex instanceof UnrecognizedPropertyException) {
            return "Unrecognized property: " + getInvalidField(ex);
        }else if (ex instanceof MismatchedInputException) {
            return "Mismatched input: check the JSON structure";
        }
        return "JSON mapping error";
    }

    private String getInvalidField(JsonMappingException ex) {
        return ex.getPath().stream()
                .map(JsonMappingException.Reference::getFieldName)
                .reduce((first, second) -> second)
                .orElse("unknown");
    }

    // Other exception handlers can be added here
}
