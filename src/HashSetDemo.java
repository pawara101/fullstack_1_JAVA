import java.util.*;
public class HashSetDemo {
    public static void main(String args[])
    {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");

        boolean r1 = hashSet.add("null");

        hashSet.remove("D");

        System.out.println(hashSet);
        System.out.println(r1);        

    }
}
