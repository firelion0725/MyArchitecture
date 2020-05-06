package com.leo.thirdlib.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Leo.ZhangTJ
 * @time 2020/5/6
 * @function
 * @describe
 */
@Aspect
public class TrackPointAspect {

    @Pointcut("execution(@com.leo.thirdlib.aspectj.annotation.Record * *(..))")
    public void trackPoint() {
    }

    @Pointcut("execution(@com.leo.thirdlib.aspectj.annotation.RecordClick * *(..))")
    public void trackPointClick() {
    }

    @Around("trackPoint()")
    public void aroundTrackPoint(final ProceedingJoinPoint joinPoint) {
        System.out.println(joinPoint.getTarget().toString() + " Start");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Around("trackPointClick()")
    public void aroundTrackPointClick(final ProceedingJoinPoint joinPoint) {
        System.out.println(joinPoint.getTarget().toString() + " click Start");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
