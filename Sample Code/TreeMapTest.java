import java.util.*;

public class TreeMapTest
{
   //Methods include put(), containsKey(), keySet(), entrySet()
   public static void main(String[] args)
   {
      TreeMap thing = new TreeMap();      
      System.out.println("thing put() :: " + thing.put(7,"dig"));
      System.out.println("thing get() :: " + thing.get(7));
      System.out.println("thing put() :: " + thing.put(7,"rug"));
      System.out.println("thing get() :: " + thing.get(7));
      System.out.println("thing containsKey() :: " + thing.containsKey(7));
      System.out.println("thing containsKey() :: " + thing.containsKey(1));
      
      System.out.println("thing put() :: " + thing.put(1,"pig"));
      System.out.println("thing put() :: " + thing.put(5,"catfish"));
      
      System.out.println("thing :: " + thing);
      System.out.println("thing keySet() :: " + thing.keySet());
      System.out.println("thing entrySet() :: " + thing.entrySet());

   }
}