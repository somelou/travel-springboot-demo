package xyz.somelou.travel.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 防止重复提交标记注解
 *
 * @author somelou
 * @date 2019-04-11
 */
@Target(ElementType.METHOD) //作用到方法上
@Retention(RetentionPolicy.RUNTIME) //运行时有效
public @interface NoRepeatSubmit {
}
