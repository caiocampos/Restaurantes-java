package tst.campos.util.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação que engloba todas as informações da entidade
 *
 * @author Caio
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DocumentInfo {

	String title();

	String descrption() default "";

	UserAcessType userAcess() default @UserAcessType(create = false, read = true, update = false, delete = false);

	BusinessRule[] rule() default {};

	SpecialSearch[] specialSearch() default {};

	FieldInfo[] fields() default {};
}
