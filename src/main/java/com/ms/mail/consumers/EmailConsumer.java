package com.ms.mail.consumers;

import com.ms.mail.dtos.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenerEmailQueue(@Payload EmailRecordDto emailRecordDto) {
        System.out.println(emailRecordDto.emailTo());
    }
}
