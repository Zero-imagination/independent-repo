package com.disagreed.independentrepo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = {"mybatis"})
class IndependentRepoApplicationTests {

    @Test
    void contextLoads() {
    }

}
