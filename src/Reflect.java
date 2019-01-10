import java.lang.reflect.Method;
import java.util.ArrayList;
@SuppressWarnings("all")
public class Reflect {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ints = new ArrayList();
        ints.add(3);
        ints.add(2);
        Class aClass = ints.getClass();
        aClass.getMethod("add", Object.class).invoke(ints,"String");
        ints.add(1);
        System.out.println(ints);
    }
}
