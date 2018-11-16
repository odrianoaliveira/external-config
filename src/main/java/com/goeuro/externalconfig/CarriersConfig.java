package com.goeuro.externalconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Set;

@Getter
@Setter
@Configuration
@ConfigurationProperties
@PropertySource("carriers/main.yml")
public class CarriersConfig {
    private Set<String> supported;
}
