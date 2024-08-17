package com.disagreed.independentrepo;

import com.disagreed.independentrepo.aop.MonitoringTimedAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The IndependentRepoApplication.
 */
@SpringBootApplication
public class IndependentRepoApplication {

    /**
     * Точка входа в приложение.
     *
     * @param args входящие аргументы
     */
    public static void main(String[] args) {
        SpringApplication.run(IndependentRepoApplication.class, args);
    }

    /**
     * Конфигурация MonitoringTimedAspect.
     */
    @Bean
    public MonitoringTimedAspect timedAspect() {
        return new MonitoringTimedAspect();
    }

}
