package com.leokazu.minhasfinancas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Production")
public class MensagemService {

    @Value("${application.name}")
    private String appName;

}
