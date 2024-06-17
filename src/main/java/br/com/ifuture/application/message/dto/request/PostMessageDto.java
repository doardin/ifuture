package br.com.ifuture.application.message.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

public record PostMessageDto(
        @NotBlank @Email String recipient,
        @NotBlank String subject,
        @NotBlank String content,
        @Future LocalDate sendAt) {
}
