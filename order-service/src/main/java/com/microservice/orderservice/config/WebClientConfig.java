package com.microservice.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

//    This bean is being used in Service with same variable name as this method name
    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder()
    {
        return WebClient.builder();
    }
}
