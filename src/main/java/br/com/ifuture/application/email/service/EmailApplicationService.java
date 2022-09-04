package br.com.ifuture.application.email.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.ifuture.application.email.dto.PostEmailDto;
import br.com.ifuture.core.email.entity.Email;
import br.com.ifuture.core.email.repository.EmailRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailApplicationService {
    
    private final EmailRepository repository;

    public void persistEmail(PostEmailDto dto){
        Email email = Email.builder()
            .id(UUID.randomUUID().toString())
            .recipientName(dto.getName())
            .recipientEmail(dto.getEmail())
            .text(dto.getText())
        .build();
        
        this.repository.save(email);
    }

}