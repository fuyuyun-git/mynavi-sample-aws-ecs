package com.example.mynavi.backendforfrontend.app.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "service")
public class ServiceProperties {
    private String dns;
}
