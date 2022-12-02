import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Target ile anotasyonun nerelere yazılabilrcrğini belirtiyoruz.
 *
 * @Retention (RetentionPolicy.RUNTIME) ile runtime anına kadar çalışır.
 */
@Target ( { ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention (RetentionPolicy.RUNTIME)
public @interface CustomLog {
    //    bu bir metot değil
    public String islem () default "";

    int importance ();
}
