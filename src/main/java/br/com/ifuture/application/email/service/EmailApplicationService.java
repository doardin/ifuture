package br.com.ifuture.application.email.service;

import org.springframework.stereotype.Service;

import br.com.ifuture.application.email.dto.PostEmailDto;
import br.com.ifuture.core.email.entity.Email;
import br.com.ifuture.core.email.repository.EmailRepository;

@Service
public class EmailApplicationService {
    
    private EmailRepository repository;

    public void persistEmail(PostEmailDto dto){
        Email email = Email.builder()
            .recipientName(dto.getName())
            .recipientEmail(dto.getEmail())
            .text(dto.getText())
        .build();
        
        this.repository.save(email);
    }

}