import java.util.*;

public class delim
{
   public static void main(String[] args)
   {
      //String s = "one,two,three,four,five,six";
      //Scanner input = new Scanner(s);
      //input.useDelimiter("[ti]");
      //System.out.println(input.next());
      //System.out.println(input.next());
      //System.out.println(input.next());
      //System.out.println(input.next());
      
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(5);
      numbers.add(9);
      numbers.add(8);
      numbers.add(1);
      
      numbers.forEach(n -> System.out.println(n));
      numbers.forEach((n) -> System.out.println(n));
      numbers.forEach((n) -> {System.out.println(n);});
      numbers.forEach(n -> {System.out.println(n);});
   }
}