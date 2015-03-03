package org.automon.pointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Pointcuts defined for various standard/basic pointcuts valid in Spring (execution(method)).
 * They should be reused in other aspects.   See {@link org.automon.pointcuts.Select}
 * for more general pointcuts valid in AspectJ as a whole.
 *
 */
@Aspect
public abstract class SpringSelect {


    /** Method execution pointcuts
     */
    @Pointcut("execution(* java.lang.Object.*(..))")
    public void objectMethod() {
    }


    @Pointcut("execution(* *(..))")
    public void method() {

    }

    @Pointcut("execution(public * *.*(..))")
    public void publicMethod() {

    }

    @Pointcut("execution(private * *.*(..))")
    public void privateMethod() {

    }

    @Pointcut("execution(protected * *.*(..))")
    public void protectedMethod() {

    }

    @Pointcut("method() && !privateMethod() && !protectedMethod() && !publicMethod()")
    public void packageMethod() {

    }

    /** Pointcuts for getter and setter methods */
    @Pointcut("execution(public void *.set*(*))")
    public void setter() {
    }

    @Pointcut("execution(public * *.get*())")
    public void getter() {
    }

    @Pointcut("getter() || setter()")
    public void getterOrSetter() {

    }


}
