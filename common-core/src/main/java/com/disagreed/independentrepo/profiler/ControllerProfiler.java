package com.disagreed.independentrepo.profiler;

import com.athaydes.javanna.Javanna;
import com.disagreed.independentrepo.aop.MonitoringTimed;
import com.disagreed.independentrepo.aop.MonitoringTimedAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class ControllerProfiler {

  private static Map<String, Object> timedAnnotationData = new HashMap<>();

  static {
    double[] percentiles = {0.90, 0.95, 0.9999};
    timedAnnotationData.put("histogram", true);
    timedAnnotationData.put("percentiles", percentiles);
  }

  @Autowired
  private MonitoringTimedAspect timedAspect;

  private static final MonitoringTimed timed =
      Javanna.createAnnotation(MonitoringTimed.class, timedAnnotationData);

  private static final Logger logger = LoggerFactory.getLogger(ControllerProfiler.class);

  @Pointcut("execution(* com.disagreed.independentrepo.repository.impl.*..*.*(..))")
  public void controller() {
  }

  @Around("controller()")
  public Object profile(ProceedingJoinPoint pjp) throws Throwable {
    return timedAspect.timeThisMethod(pjp, timed);
  }
}
