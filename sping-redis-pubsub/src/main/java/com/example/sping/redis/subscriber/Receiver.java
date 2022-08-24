package com.example.sping.redis.subscriber;

import com.example.sping.redis.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
public class Receiver implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        log.info("Message processed: " +  message.toString());
    }
}
