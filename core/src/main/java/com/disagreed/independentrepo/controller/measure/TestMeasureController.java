package com.disagreed.independentrepo.controller.measure;

import com.disagreed.independentrepo.api.CountryService;
import com.disagreed.independentrepo.api.DishService;
import com.disagreed.independentrepo.api.RestaurantService;
import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.dto.DishDto;
import com.disagreed.independentrepo.dto.RestaurantDto;
import com.disagreed.independentrepo.enums.RepositoryType;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/measure", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestMeasureController {

    private final RestaurantService restaurantService;

    private final DishService dishService;

    private final CountryService countryService;

    @GetMapping(value = "/start/{count}")
    public void startTest (@PathVariable Long count) {
        for (int iterator = 0; iterator < count; iterator++) {
            Arrays.stream(RepositoryType.values()).forEach(this::executeService);
        }
    }

    @SneakyThrows
    private void executeService(RepositoryType repositoryType) {
        Long typeCode = repositoryType.getTypeCode();
        restaurantService.getAll(typeCode);
        dishService.getAll(typeCode);
        countryService.getAll(typeCode);
        Thread.sleep(600);
    }

    /*
    this rest execute query with 13 join:
    from restaurant rs
         inner join menu mn on mn.restaurant_id = rs.restaurant_id
         inner join employee emp on emp.restaurant_id = rs.restaurant_id
         inner join category cg on mn.category_id = cg.category_id
         left join dish ds on mn.menu_id = ds.menu_id
         inner join qualification q on ds.qualification_id = q.qualification_id
         left join ingredient ing on ing.dish_id = ds.dish_id
         inner join manufacturer mf on mf.manufacturer_id = ing.manufacturer_id
         inner join city ci on ci.city_id = mf.city_id
         inner join person p on p.person_id = mf.person_id
         inner join country co on co.country_id = ci.country_id and co.action_ind != 'D'
         inner join person empp on empp.person_id = emp.person_id
         inner join employee_type emptp on emp.employee_type_id = emptp.employee_type_id
         inner join qualification empq on emp.qualification_id = empq.qualification_id
    */
    @GetMapping(value = "/count_join13")
    public List<RestaurantDto> getAllRestaurant(@RequestParam(defaultValue = "0") Long typeCode) {
        return restaurantService.getAll(typeCode);
    }

    /*
    this rest execute query with 6 join:
    from dish ds
         inner join qualification q on ds.qualification_id = q.qualification_id
         left join ingredient ing on ing.dish_id = ds.dish_id
         inner join manufacturer mf on mf.manufacturer_id = ing.manufacturer_id
         inner join city ci on ci.city_id = mf.city_id
         inner join person p on p.person_id = mf.person_id
         inner join country co on co.country_id = ci.country_id and co.action_ind != 'D'
    */
    @GetMapping(value = "/count_join6")
    public List<DishDto> getAllDish(@RequestParam(defaultValue = "0") Long typeCode) {
        return dishService.getAll(typeCode);
    }

    /*
    this rest execute query without join:
    from country co
    */
    @GetMapping(value = "/count_join0")
    public List<CountryDto> getAllCountry(@RequestParam(defaultValue = "0") Long typeCode) {
        return countryService.getAll(typeCode);
    }
}
