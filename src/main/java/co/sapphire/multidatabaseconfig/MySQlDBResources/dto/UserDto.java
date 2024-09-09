package co.sapphire.multidatabaseconfig.MySQlDBResources.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;

//    @NotNull(message = "Password cannot be null")
//    @Size(min = 6, message = "Password should have at least 6 characters")
//    private String password;
//
//    @Valid
//    @NotNull(message = "Address cannot be null")
//    private AddressDto address;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @NotNull(message = "EndDate cannot be null")
    @Past(message = "EndDate should be future or present date!")
    private LocalDate endDate;
}