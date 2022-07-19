package org.cjl.summertestproject;

import org.cjl.summer.mybatis.annotation.Mapper;
import org.cjl.summer.mybatis.annotation.MapperScan;
import org.cjl.summer.summermvc.annotation.ComponentScan;
import org.cjl.summer.summermvc.annotation.SummerBootApplication;
import org.cjl.summer.tomcat.SummerBoot;

/**
 * @Title: SummerTestProject
 * @Package: org.cjl.summertestproject
 * @Description: TODO(Describe in one sentence)
 * @Author: Jiulong_Chen
 * @Date: 7/13/2022
 * @Version: V1.0
 */
@SummerBootApplication
@ComponentScan("org.cjl.summertestproject")
@MapperScan(basePackages = "org.cjl.summertestproject.mapper")
public class SummerTestProject {
    public static void main(String[] args) {
        new SummerBoot().run(SummerTestProject.class);
    }
}
