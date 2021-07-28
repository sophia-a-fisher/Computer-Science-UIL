public class ComparableTest
{
   //Methods include equals(), toString(), hashCode()
   public static void main(String[] args)
   {
      Comparable thing1 = new Object();
      Comparable thing2 = new Object();
      Comparable thing3 = thing2;
      
      System.out.println("Thing1 compareTo Thing2 :: " + thing1.compareTo(thing2));
      System.out.println("Thing2 compareTo Thing3 :: " + thing2.compareTo(thing3));
   }
}