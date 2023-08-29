
// Method Overloading
public class MethodOverloadingDemo {
    public int multiply(int x,int y){
        return (x*y);
    }

    public int multiply(int x, int y ,int z){
        return (x*y*z);
    }

    public static void main(String args[])
{
    MethodOverloadingDemo demo = new MethodOverloadingDemo();
    System.out.println(demo.multiply(12, 5, 7));

    System.out.println(demo.multiply(2, 3));
}

}
