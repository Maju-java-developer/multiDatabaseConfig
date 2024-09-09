package co.sapphire.multidatabaseconfig.MySQlDBResources.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SpringValidation {

    @NotNull(message = "Id is required!")
    @Positive(message = "Id must be positive")
    private Integer id;

    @Future(message = "Date is not future!")
    private LocalDate endDate;

    @Pattern(regexp = "", message = "Only Letters are allowed")
    private String name;
}
