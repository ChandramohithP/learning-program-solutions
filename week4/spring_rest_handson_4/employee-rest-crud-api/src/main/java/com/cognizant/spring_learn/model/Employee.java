package com.cognizant.spring_learn.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
@Data
public class Employee {
    @NotNull
    private Integer id;
    @NotBlank
    @Size(min = 1, max = 30)
    private String name;
    @NotNull
    @Min(0)
    private Double salary;
    @NotNull
    private Boolean permanent;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    @Valid
    @NotNull
    private Department department;
    @Valid
    @NotEmpty
    private List<Skill> skillList;
}
