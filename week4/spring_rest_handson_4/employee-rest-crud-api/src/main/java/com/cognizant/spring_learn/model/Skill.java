package com.cognizant.spring_learn.model;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Skill {
    @NotNull
    private int id;

    @NotBlank
    @Size(min = 1, max = 30)
    private String name;
}
