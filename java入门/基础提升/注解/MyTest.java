package 基础提升.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//加上此注解 value为do执行 不加或者为其他值均不执行
public @interface MyTest {
    public String value();
}
