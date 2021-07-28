public class ObjectTest
{
   //Methods include equals(), toString(), hashCode()
   public static void main(String[] args)
   {
      Object thing1 = new Object();
      Object thing2 = new Object();
      Object thing3 = thing2;
      
      System.out.println("Thing1 equals Thing2 :: " + thing1.equals(thing2));
      System.out.println("toString :: " + thing1.toString());
      System.out.println("Thing1 hashcode :: " + thing1.hashCode());
      System.out.println("Thing2 hashcode :: " + thing2.hashCode());
      System.out.println("Thing3 hashcode :: " + thing3.hashCode());
      //System.out.println("Thing1 compareTo Thing2 :: " + thing1.compareTo(thing2));
      //System.out.println("Thing2 compareTo Thing3 :: " + thing2.compareTo(thing3));

   }
}