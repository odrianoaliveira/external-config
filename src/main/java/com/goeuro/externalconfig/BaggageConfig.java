package com.goeuro.externalconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@Configuration
@ConfigurationProperties
@PropertySource("carriers/baggage.yml")
public class BaggageConfig {
    private String color;
}
