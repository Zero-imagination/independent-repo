package com.disagreed.independentrepo.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(value = "hibernate")
@SpringBootTest
public class HibernateCityServiceTest extends CityServiceTest {

}