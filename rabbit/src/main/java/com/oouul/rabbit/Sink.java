package com.oouul.rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {
    String INPUT = "inupt";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}
