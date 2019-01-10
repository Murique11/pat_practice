import java.lang.reflect.Method;
import java.util.ArrayList;
@SuppressWarnings("all")
public class Reflect {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ints = new ArrayList();
        ints.add(5);
        ints.add(4);
        Class aClass = ints.getClass();
        aClass.getMethod("add", Object.class).invoke(ints,"String");
        ints.add(3);
        System.out.println(ints);
    }
}
