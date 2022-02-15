package com.spring.exercisebs4;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix="")
public class Properties {
    private String VAR1;
    private String VAR3;
}
