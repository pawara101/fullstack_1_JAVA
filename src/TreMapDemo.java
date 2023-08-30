import java.util.TreeMap;

public class TreMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treemap = new TreeMap<>();

        //treemap.put(3, null,"a");
        treemap.put(1,"c");
        treemap.put(4,"a");
        treemap.put(3,"d");

        System.out.println(treemap);
    }
}
