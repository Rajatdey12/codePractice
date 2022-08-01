package se8;

import java.lang.annotation.*;
import java.math.BigInteger;

@Documented
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface CustomAnnotation {

    String name() default "";

    Class<?> type();

    boolean isMandatory() default false;
}


class AnnotationImpl {

    @CustomAnnotation(name = "NAME", type = String.class, isMandatory = true)
    private String name;

    private String adress;

    private int age;

    private double salary;

    private BigInteger phone_number;

}
