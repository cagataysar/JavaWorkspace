import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main (String[] args) throws Exception {
//        new Person(24, "Çağatay").konus();
//        System.err.println(new Person(24, "Çağatay").toString());
//        ornek1();
//        ornek2();
        ornek3();
    }

    private static void ornek3 () throws NoSuchMethodException, NoSuchFieldException {
        Class< Person > personClass = Person.class;
        Field yasDegiskeni = personClass.getField("yas");
        CustomLog customLogAnnotation = yasDegiskeni.getAnnotation(CustomLog.class);
        if ( customLogAnnotation.importance() >= 10 ) {
            System.err.println("Bu field önemlidir");
        } else {
            System.err.println("Bu field önemsizdir.");
        }
    }

    private static void ornek2 () throws NoSuchMethodException {
        Class< Person > personClass = Person.class;
        Method konusMetodu = personClass.getMethod("konus");
        CustomLog customLogAnnotation = konusMetodu.getAnnotation(CustomLog.class);
        if ( customLogAnnotation.importance() >= 10 ) {
            System.err.println("Bu field önemlidir");
        } else {
            System.err.println("Bu field önemsizdir.");
        }
    }

    private static void ornek1 () {
//        System.err.println(Runnable.class.getAnnotations().length);
        Class< Person > personClass = Person.class;
        // java.lang.reflect.
//        System.err.println(personClass.getDeclaredFields().length);
        Annotation[] dizi = personClass.getAnnotations();
        Annotation myAnnotation = dizi[ 0 ];
        System.err.println(myAnnotation.annotationType());
        CustomLog customLogAnnotation = (CustomLog) myAnnotation;
        if ( customLogAnnotation.importance() >= 10 ) {
            System.err.println("Bu sınıf önemlidir");
        }
    }
}

//@Deprecated (since = "V3", forRemoval = false)
@CustomLog (importance = 15)
class Person {

    @Deprecated (since = "V3", forRemoval = false)
    @CustomLog (importance = 5)
    public int yas;

    private String isim;

    @SuppressWarnings ("unused") // TC değişkeni kullanılmıyor uyarısını almak istemezsek
    private String TC;

    /**
     * Bunun yerine mesaj parametresi alanı kullan
     */
    @Deprecated (since = "V3", forRemoval = false)
    @CustomLog (importance = 10)
    public void konus () {
        System.err.println(isim + " konuşuyor");
    }

    @CustomLog (importance = 10)
    public void konus (String mesaj) {
        System.err.println(isim + " konuşuyor");
    }

    @Override
    public String toString () {
        return "isim: " + isim + " yas: " + yas;
    }

    public Person (int yas, String isim) {
        this.yas = yas;
        this.isim = isim;
    }
}