package co.sapphire.multidatabaseconfig.MySQlDBResources.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddressDto {
    @NotNull(message = "Street cannot be null")
    private String street;

    @NotNull(message = "City cannot be null")
    private String city;
}