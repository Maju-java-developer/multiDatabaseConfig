package co.sapphire.multidatabaseconfig.MySQlDBResources.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private String details;
    private String hint;
}
