package org.cjl.summertestproject.controller;

import org.cjl.summer.mybatis.plugin.Interceptor;
import org.cjl.summer.summermvc.annotation.*;
import org.cjl.summertestproject.domain.City;
import org.cjl.summertestproject.service.CityService;

import java.util.List;
import java.util.Optional;

/**
 * @Title: CityController
 * @Package: org.cjl.summertestproject.controller
 * @Description: TODO(Describe in one sentence)
 * @Author: Jiulong_Chen
 * @Date: 7/13/2022
 * @Version: V1.0
 */
@RestController("/city")
@ConfigurationProperties(prefix = "city")
public class CityController {
    @Autowired
    private CityService cityService;

    @Value("default.enabled")
    private boolean enableDefault;

    @Value("default.id")
    private int defaultCityId;

    @PostMapping("/update_name")
    public City updateName(City city) {
        cityService.updateCityName(city.getName(),city.getId());
        return cityService.getCityById(city.getId());
    }

    @GetMapping("/cities")
    public List<City> getCities() {
        return cityService.getCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable("id") Integer id) {
        City city = cityService.getCityById(id);
        if (enableDefault && city ==null){
            city = cityService.getCityById(defaultCityId);
        }
        return city;
    }
}
