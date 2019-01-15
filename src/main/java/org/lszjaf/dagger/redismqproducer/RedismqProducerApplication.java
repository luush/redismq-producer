package org.lszjaf.dagger.redismqproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class RedismqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedismqProducerApplication.class, args);
    }

}

