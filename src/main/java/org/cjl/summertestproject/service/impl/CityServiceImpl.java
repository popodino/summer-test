package org.cjl.summertestproject.service.impl;

import org.cjl.summer.summermvc.annotation.Autowired;
import org.cjl.summer.summermvc.annotation.Service;
import org.cjl.summertestproject.domain.City;
import org.cjl.summertestproject.mapper.CityMapper;
import org.cjl.summertestproject.service.CityService;

import java.util.List;

/**
 * @Title: CityServiceImpl
 * @Package: org.cjl.summertestproject.service.impl
 * @Description: TODO(Describe in one sentence)
 * @Author: Jiulong_Chen
 * @Date: 7/13/2022
 * @Version: V1.0
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    @Override
    public int updateCityName(String name, Integer id) {
        return cityMapper.updateCityName(name, id);
    }

    @Override
    public City getCityById(Integer id) {
        return cityMapper.getCityById(id);
    }

    @Override
    public List<City> getCities() {
        return cityMapper.getCities();
    }
}
