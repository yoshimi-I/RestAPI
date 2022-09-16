package com.example.RestAPI.domain.form;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
public class RegisterForm {
    @NonNull
    @Size(min=0, max= 100)
    private  String title;
    @NonNull
    @Size(min=0, max= 500)
    private  String description;
    @Size(min = 0,max = 10000000)
    private  Integer price;
    @NonNull
    private  String image_path;
}
