public class IntegerTest
{
   //Methods include equals(), toString(), hashCode()
   public static void main(String[] args)
   {
      Integer thing1 = 1;
      Integer thing2 = 2;
      Integer thing3 = thing2;
      
      System.out.println("Thing1 intValue() :: " + thing1.intValue());
      System.out.println("Thing1 equals Thing2 :: " + thing1.equals(thing2));
      System.out.println("Thing2 equals Thing3 :: " + thing2.equals(thing3));
      System.out.println("Thing1 toString() :: " + thing1.toString());
      System.out.println("Thing1 toString(i,r) :: " + thing1.toString(5,2));
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo(3));
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo(0));
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo(1));
      System.out.println("Thing1 parseInt() :: " + thing1.parseInt("5"));
   }
}