import java.util.*;

public class LinkedListTest
{
   //Methods include add(), size(), iterator(), listIterator()
   //get(), set(), add(), remove()
   public static void main(String[] args)
   {            
      LinkedList thing1 = new LinkedList();
   
      System.out.println("addFirst() :: ");
      thing1.addFirst(-78);
      System.out.println("addLast() :: ");
      thing1.addLast(23);
      System.out.println("thing1 :: " + thing1);
      System.out.println("getFirst() :: " + thing1.getFirst());
      System.out.println("getLast() :: " + thing1.getLast());
      System.out.println("removeFirst() :: " + thing1.removeFirst());
      System.out.println("thing1 :: " + thing1);
      System.out.println("removeLast() :: " + thing1.removeLast());
      System.out.println("thing1 :: " + thing1);
     
   }
}