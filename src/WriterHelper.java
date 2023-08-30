import java.util.ArrayList;
import java.util.List;
import java.lang.IndexOutOfBoundsException;

public class WriterHelper {
    public void writeList(){
        try {
            List<Integer> list = new ArrayList<>(10);
            list.add(10);

            System.out.println("Entering" + "try statement");
            Integer a = list.get(1);
            System.out.println("Accessing the first Element" +  a);
        }
        catch(IndexOutOfBoundsException e){
            System.err.println("Caught Index out of bound Exeption :" + e.getMessage());
        }
        finally{
            System.out.println("This will always execute");
        }
    }
}
