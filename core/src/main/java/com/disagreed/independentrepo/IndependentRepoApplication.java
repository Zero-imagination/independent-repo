package com.disagreed.independentrepo;

import com.disagreed.independentrepo.aop.MonitoringTimedAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IndependentRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IndependentRepoApplication.class, args);
    }

    @Bean
    public MonitoringTimedAspect timedAspect() {
        return new MonitoringTimedAspect();
    }

}
