import java.util.TreeSet;

public class TreeSetdemo {
    public static void main(String args[])
    {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Z");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("C");


        System.out.println(treeSet);//Print sorted value
    }
}
