import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created on 26/05/16.<br/>
 */
public class Main {
    public static void main(String[] args){
        System.out.println(sayHello());
    }


    private static String sayHello() {
        List<String> hellos = Lists.newArrayList();
        hellos.add("Hello");
        hellos.add("Hello");
        hellos.add("Hello");
        hellos.add("Hello");
        hellos.add("Hello");

        return hellos.stream().reduce((s, s2) -> s + s2).get();
    }
}
