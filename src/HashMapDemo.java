import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);


        System.out.println("Size of map is " +map.size());

        System.out.println("Map is "+map);
System.out.println("-------------------------------------------------");
        if (map.containsKey("a")){
            Integer a = map.get("a");
            System.out.println("Value for key "+ a);    
        }
System.out.println("-------------------------------------------------");
        for (String key : map.keySet())
        {
            System.out.println("Value for key "+key + " is "+map.get(key));
        }
System.out.println("-------------------------------------------------");
        for (Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key " + entry.getKey() + " Value is "+entry.getValue());
        }
    }

}
