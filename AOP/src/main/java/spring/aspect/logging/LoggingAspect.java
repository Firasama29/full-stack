package spring.aspect.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.json.JsonParseException;
import org.springframework.stereotype.Component;
import spring.aspect.service.EmployeeService;


@Aspect
@Component
public class LoggingAspect {

    //Aspect is the cross-cutting concern that we are trying to implement. Example: logging
    //join points is a point during the executing of a program such as execution of a method or handling exception. In Spring AOP, join points represents method execution
    //point-cut is a expression that helps aspect to implement an advice at a certain jointPoint.
    //advice is the action taken by an aspect during a join point( logBeforeAllMethods(), logBeforeFindEmployees(), logBeforeFindEmployeeById(), etc. )
    //advice is associated with a point-cut expression and runs at any joinpoint matched by the point-cut

    private final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    //pointCut for service methods
    @Pointcut("within(spring.aspect.service.*Service)")
    public void service() {
        //pointCut for service methods
    }

    //pointCut for controller methods
    @Pointcut("within(spring.aspect.controller.*Controller)")
    public void controller() {
        //pointCut for controller methods
    }

    //pointCut for client methods
    @Pointcut("within(spring.aspect.controller.*Controller)")
    public void client() {
        //pointCut for client methods
    }

    //pointCut for all public methods
    @Pointcut("execution(public * *(..))")
    public void publicMethod() {
        //pointCut for all public methods
    }

    //pointCut that matches all repositories, services and controllers
    @Pointcut("within(@org.springframework.stereotype.Repository.*(..))" +
                " || within(@org.springframework.stereotype.Service.*(..))" +
                " || within(@org.springframework.stereotype.RestController.*(..))")
    public void springBeanPointCut() {}

    //pointCut that matches all Spring beans defined in the application main packages
    @Pointcut("within(@spring.aspect.*(..))" +
                " || within(@spring.aspect.client.*(..))" +
                " || within(@spring.aspect.service.*(..))" +
                " || within(@spring.aspect.controller.*(..))")
    public void applicationPackagePointCut() {}

    //pointCut expressions inside @Before()
    @Before("service() && publicMethod()")
    public void logBeforeAllMethods(JoinPoint joinPoint) throws JsonParseException {
        LOGGER.info("Executing logBeforeAllMethods() method before : [{}] " + joinPoint.getSignature().getName(), joinPoint.getSignature().getDeclaringTypeName());
    }

    //.....................................
    @Before("execution(* spring.aspect.service.EmployeeService.findEmployees())")
    public void logBeforeFindEmployees(JoinPoint joinPoint) {
        LOGGER.info("Executing logBeforeFindEmployees() method for : [{}] ", joinPoint.getSignature().getName());
    }
    @Before("execution(* spring.aspect.service.EmployeeService.findEmployeeById(..))")
    public void logBeforeFindEmployeeById(JoinPoint joinPoint) {
        LOGGER.info("Executing logBeforeFindEmployeeById() method for : [{}] " + joinPoint.getSignature().getName());;
    }

    @After("execution(* spring.aspect.service.EmployeeService.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint) {
        LOGGER.info("Executing logAfterAllMethods() after : [{}] " + joinPoint.getSignature().getName());
    }
}
