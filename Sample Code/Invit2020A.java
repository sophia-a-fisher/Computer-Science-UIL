import java.util.*;

public class Invit2020A
{
   public static void main(String args[])
   {
      //System.out.print(rec(3));
      prog5();
   }
   
   public static int rec(int x)
   {
      if(x == 0)
      {
         return 7;
      }
      else
      {
         return 2 * rec(--x);
      }
   }
   
   public static void prog1()
   {
      int r = 0, p = 6, s = 0;
      for(;r < 5; r++)
      {
         s = ~s;
         System.out.print("s = " + s);
         while(p > 1)
         {
            s++;
            p--;
         }
      }
      System.out.print(r + " " + p + " " + s);
   }
   
   public static void prog2()
   {
      ArrayList<String> list = new ArrayList<String>();
      list.add("tomato");list.add("ham");
      list.add("turkey");list.add("onion");
      Set<String> set = new TreeSet<String>();
      set.add("ham");set.add("turkey");
      set.add("beef");set.add("cheese");
      set.add("mustard");set.add("lettuce");
      set.addAll(list);
      System.out.print(set);
   }
   
   public static void prog3()
   {
      String s = "325-555-1234";
      System.out.print(s.matches(".{10}") + " ");
      System.out.print(s.matches("\\d+-\\d+-\\d+") + " ");
      System.out.print(s.matches("325\\W555\\S1234") + " ");
   }
   
   public static void prog4()
   {
      String r = "monkey";
      String p = "money";
      System.out.print(p.compareTo(r));
   }

   public static void prog5()
   {
      String num = "1.56 3.14 2.77";
      double d1 = Double.parseDouble(num);
      double d2 = Double.parseDouble(num);
      double d3 = Double.parseDouble(num);
      System.out.print(d1 + " " + d2 + " " + d3);
   }
   
   
}


