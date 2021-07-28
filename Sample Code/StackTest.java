import java.util.*;

public class StackTest
{
   //Methods include add(), size(), iterator(), listIterator()
   //get(), set(), add(), remove()
   public static void main(String[] args)
   {            
      Stack thing1 = new Stack();
   
      System.out.println("isEmpty() :: " + thing1.isEmpty());
      System.out.println("push() :: " + thing1.push(23));
      System.out.println("push() :: " + thing1.push(38));
      System.out.println("thing1 :: " + thing1);
      System.out.println("peek() :: " + thing1.peek());
      System.out.println("thing1 :: " + thing1);
      System.out.println("pop() :: " + thing1.pop());
      System.out.println("thing1 :: " + thing1);
   }
}