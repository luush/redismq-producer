package org.lszjaf.dagger.redismqproducer.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.concurrent.CountDownLatch;

@RestController
public class Producer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    CountDownLatch countDownLatch;


    @PostConstruct
    public void produce() throws Exception {

        LOGGER.info("Sending message...");
        for(int i=0;i<100;i++){

            stringRedisTemplate.convertAndSend("chat", "Hello from Redis!"+i);
        }

        countDownLatch.await();

    }
}
