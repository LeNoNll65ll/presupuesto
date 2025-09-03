package com.saf.presupuesto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PresupuestoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresupuestoApplication.class, args);
    }
}
