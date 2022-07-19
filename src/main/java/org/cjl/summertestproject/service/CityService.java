package org.cjl.summertestproject.service;

import org.cjl.summertestproject.domain.City;

import java.util.List;

/**
 * @Title: CityService
 * @Package: org.cjl.summertestproject.service
 * @Description: TODO(Describe in one sentence)
 * @Author: Jiulong_Chen
 * @Date: 7/13/2022
 * @Version: V1.0
 */
public interface CityService {
    int updateCityName(String name, Integer id);

    City getCityById(Integer id);

    List<City> getCities();

}
