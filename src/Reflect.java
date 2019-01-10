import java.lang.reflect.Method;
import java.util.ArrayList;
@SuppressWarnings("all")
public class Reflect {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ints = new ArrayList();
        Class aClass = ints.getClass();
        aClass.getMethod("add", Object.class).invoke(ints,"6不6啊");
        ints.add(6);
        ints.add(6);
        ints.add(6);
        System.out.println(ints);
    }
}
