package org.cjl.summertestproject.aspect;

import org.cjl.summer.summermvc.annotation.*;
import org.cjl.summer.summermvc.aop.aspect.JoinPoint;

import java.util.Arrays;
import java.util.Optional;

/**
 * @Title: CityAspect
 * @Package: org.cjl.summertestproject.aspect
 * @Description: TODO(Describe in one sentence)
 * @Author: Jiulong_Chen
 * @Date: 7/13/2022
 * @Version: V1.0
 */
@Aspect
@Component
public class CityAspect {

    @PointCut("public .* org.cjl.summertestproject.service..*Service..*(.*)")
    public void pointCut(){}

    //@Before
    public Object before(JoinPoint joinPoint) throws Throwable{
        System.out.println("============before============");
        return joinPoint.proceed();
    }

    //@After
    public Object after(JoinPoint joinPoint) throws Throwable{
        System.out.println("============after============");
        return joinPoint.proceed();
    }

    @Around
    public Object around(JoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("[Info] ServiceActionName: " + joinPoint.getMethod().getName()
                + " , Args: "+ Arrays.toString(joinPoint.getArguments())
                + " , TimeSpend: " + (endTime - startTime) + "ms"
                + " , Result: " + Optional.ofNullable(obj).orElse("no result").toString());
        return obj;
    }

    @AfterThrowing
    public Object afterThrowing(JoinPoint joinPoint, Throwable e) throws Throwable{
        System.out.println("============AfterThrowing============" + e.getMessage());
        return joinPoint.proceed();
    }
}
