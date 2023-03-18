import java.util.*;

public class JavaDemo {
    public static void main(String[] args) {
        List<String> all=new ArrayList<String>();
        all.add("Hello");
        all.add("World");
        all.add("MLDN");
        for (String str : all) {
            System.out.print(str+" ");
        }
    }
}
