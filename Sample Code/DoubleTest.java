public class DoubleTest
{
   //Methods include equals(), toString(), hashCode()
   public static void main(String[] args)
   {
      Double thing1 = 1.0;
      Double thing2 = 2.0;
      Double thing3 = thing2;
      
      System.out.println("Thing1 doubleValue() :: " + thing1.doubleValue());
      System.out.println("Thing1 equals Thing2 :: " + thing1.equals(thing2));
      System.out.println("Thing2 equals Thing3 :: " + thing2.equals(thing3));
      System.out.println("Thing1 toString() :: " + thing1.toString());
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo(3.0));
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo(0.0));
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo(1.0));
      System.out.println("Thing1 parseDouble() :: " + thing1.parseDouble("5"));
   }
}