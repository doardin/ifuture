package br.com.ifuture.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifuture.application.email.dto.PostEmailDto;
import br.com.ifuture.application.email.service.EmailApplicationService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/email")
@RequiredArgsConstructor
public class EmailController {
    
    private final EmailApplicationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void persistEmail(@RequestBody @Valid PostEmailDto dto){
        this.service.persistEmail(dto);
    }

}
