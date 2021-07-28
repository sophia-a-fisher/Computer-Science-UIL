import java.util.*;

public class ArrayListTest
{
   //Methods include add(), size(), iterator(), listIterator()
   //get(), set(), add(), remove()
   public static void main(String[] args)
   {            
      ArrayList thing1 = new ArrayList();
   
      System.out.println("add() :: " + thing1.add(-78));
      System.out.println("size() :: " + thing1.size());
      System.out.println("iterator() :: " + thing1.iterator());
      System.out.println("listIterator() :: " + thing1.listIterator());
      System.out.println("get() :: " + thing1.get(0));
      System.out.println("set() :: " + thing1.set(0,76));
      System.out.println("add() :: ");
      thing1.add(1,324);
      System.out.println("thing1 :: " + thing1);
      System.out.println("remove() :: " + thing1.remove(1));
      System.out.println("thing1 :: " + thing1);
   }
}