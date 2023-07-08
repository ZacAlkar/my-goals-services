package br.com.personal.metasprofissionais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}, scanBasePackages = "br.com.personal.metasprofissionais.*")
public class MetasProfissionaisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetasProfissionaisApplication.class, args);
    }

}
