package com.peachyy.xcache.annation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Xs.Tao
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Repeatable(value = CachePuts.class)
public @interface CachePut {
    /**
     * key prifix
     * @return
     */
    String prefix();

    /**
     * key name support SpEL
     * @return
     */
    String key();

    /**
     * expire ttl
     * @return
     */
    long ttl() default -1;

    /**
     * cache condition support SpEL
     * @return
     */
    String condition() default "";

    /**
     * allow null vlaue
     * @return
     */
    boolean allowNullValue() default false;
}
