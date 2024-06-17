package br.com.ifuture.application.message.usecases;

import org.springframework.stereotype.Service;

import br.com.ifuture.application.message.dto.request.PostMessageDto;
import br.com.ifuture.domain.message.MessageRepository;
import br.com.ifuture.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateMessageService {

    private final MessageMapper mapper;
    private final MessageRepository repository;

    public void execute(PostMessageDto dto) {
        var message = mapper.toMessage(dto);
        repository.save(message);
    }

}
