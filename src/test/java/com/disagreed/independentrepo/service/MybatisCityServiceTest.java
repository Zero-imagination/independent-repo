package com.disagreed.independentrepo.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(value = "mybatis")
@SpringBootTest
public class MybatisCityServiceTest extends CityServiceTest {

}