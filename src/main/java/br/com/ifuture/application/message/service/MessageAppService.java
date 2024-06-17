package br.com.ifuture.application.message.service;

import org.springframework.stereotype.Service;

import br.com.ifuture.application.message.dto.request.PostMessageDto;
import br.com.ifuture.application.message.usecases.CreateMessageService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageAppService {

    private final CreateMessageService createMessageService;

    public void sendMessage(PostMessageDto dto) {
        createMessageService.execute(dto);
    }

}
