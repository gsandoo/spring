package com.example.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ParameterAop {
    // controller 하위 다 할것
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private  void  cut(){


    }

    // before -> method -> afterReturn 순으로 찍힌다.
    @Before("cut()")
    public void before(JoinPoint joinPoint){
        Object[]args = joinPoint.getArgs();

        // Object에 있는 정보 다 찍을 때 까지 반복
        for(Object obj: args){
            // type 반환
            System.out.println("type: "+ obj.getClass().getSimpleName());
            // method 반환
            System.out.println("value: "+obj);
        }
        System.out.println("비포어 끝");
    }


    // 여긴 모든 정보가 다 찍히고 마지막 return 값 찍어준다
    @AfterReturning(value = "cut()" , returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint , Object returnObj ){
        System.out.println("여기서 부터 에프터 리턴");
        System.out.println("return obj: ");
        System.out.println(returnObj);
    }
}
