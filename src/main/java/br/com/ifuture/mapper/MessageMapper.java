package br.com.ifuture.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import br.com.ifuture.application.message.dto.request.PostMessageDto;
import br.com.ifuture.domain.message.Message;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MessageMapper {
    Message toMessage(PostMessageDto dto);
}
