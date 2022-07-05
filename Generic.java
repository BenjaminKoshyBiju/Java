import java.util.*;
class GeneriClass<T>
{
    
    public GeneriClass(T data)
    {
        System.out.println("the values are"+data);
    }
 
}
class GenericMethod
{
    public <T> void disp(T datas)
    {
        System.out.println("This is generic Method"+datas);
    }
}
public class Generic{
    public static void main(String[] args)
    {
        GeneriClass<Integer> ob1=new GeneriClass<>(5);
       // ob1.disp();
        GeneriClass<String> ob2=new GeneriClass<>("hello");
      //  ob2.disp();
        GenericMethod ob3=new GenericMethod();
        ob3.<String>disp("in java");
    }
}