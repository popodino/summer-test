package org.cjl.summertestproject.mapper;

import org.cjl.summer.mybatis.annotation.Mapper;
import org.cjl.summer.mybatis.annotation.ResultType;
import org.cjl.summer.mybatis.annotation.Select;
import org.cjl.summer.mybatis.annotation.Update;
import org.cjl.summertestproject.domain.City;

import java.util.List;

/**
 * @Title: CityMapper
 * @Package: org.cjl.summertestproject.mapper
 * @Description: TODO(Describe in one sentence)
 * @Author: Jiulong_Chen
 * @Date: 7/14/2022
 * @Version: V1.0
 */
@Mapper
public interface CityMapper {
    @Select(query = "select id,name from t_city")
    List<City> getCities();

    @Select(query = "select id,name from t_city where id = ?")
    City getCityById(Integer id);

    @Update(update = "update t_city set name = ? where id = ?")
    int updateCityName(String name, Integer id);
}
