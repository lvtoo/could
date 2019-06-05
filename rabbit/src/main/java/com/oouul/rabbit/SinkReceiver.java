package com.oouul.rabbit;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import java.util.logging.Logger;

@EnableBinding(Sink.class)
public class SinkReceiver {
    // TODO: JMS依然没有调试好 20190605
    private static Logger logger = Logger.getLogger(SinkReceiver.class.toString());

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        logger.info("Received:" + payload);
    }
}
