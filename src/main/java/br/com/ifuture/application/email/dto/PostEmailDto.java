package br.com.ifuture.application.email.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.ifuture.constants.ValidationMessages;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostEmailDto {
    
    @NotNull(message = ValidationMessages.REQUIRED)
    @NotBlank(message = ValidationMessages.REQUIRED)
    private String name;
    
    @NotNull(message = ValidationMessages.REQUIRED)
    @NotBlank(message = ValidationMessages.REQUIRED)
    @Email(message = ValidationMessages.VALID_EMAIL)
    private String email;
    
    @NotNull(message = ValidationMessages.REQUIRED)
    @NotBlank(message = ValidationMessages.REQUIRED)
    private String text;
    
    @NotNull(message = ValidationMessages.REQUIRED)
    @Future(message = ValidationMessages.VALID_DATE)
    private LocalDate sendAt;
}
