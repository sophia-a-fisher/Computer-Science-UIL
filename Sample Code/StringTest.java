public class StringTest
{
   //Methods include equals(), toString(), hashCode()
   public static void main(String[] args)
   {
      String thing1 = new String("cat");
      String thing2 = "act";
      String thing3 = thing2;
      String thing4 = "Catootle";
      String thing5 = "hus-wauih-dh-hus-adh";
      String thing6 = new String("cat");
      
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo("dig"));
      System.out.println("Thing1 compareTo() :: " + thing1.compareTo("cat"));
      System.out.println("Thing1 equals Thing2 :: " + thing1.equals(thing2));
      System.out.println("Thing2 equals Thing3 :: " + thing2.equals(thing3));
      System.out.println("Thing1 equals Thing6 :: " + thing1.equals(thing6));
      System.out.println("Thing1 length() :: " + thing1.length());
      System.out.println("Thing1 substring() :: " + thing1.substring(1));
      System.out.println("Thing1 substring() :: " + thing1.substring(0,1));
      System.out.println("Thing1 indexOf() :: " + thing1.indexOf("at"));
      System.out.println("Thing1 indexOf() :: " + thing1.indexOf("d"));
      System.out.println("Thing4 indexOf() :: " + thing4.indexOf("t", 0));
      System.out.println("Thing4 indexOf() :: " + thing4.indexOf("t", 3));
      System.out.println("Thing1 charAt() :: " + thing1.charAt(1));
      System.out.println("Thing1 toLowerCase() :: " + thing1.toLowerCase());
      System.out.println("Thing1 toUpperCase() :: " + thing1.toUpperCase());
      System.out.println("Thing5 split() :: " + thing5.split("-").toString());
      System.out.println("Thing5 matches() :: " + thing5.matches("[a-z]"));
      System.out.println("Thing5 replaceAll() :: " + thing5.replaceAll("hus", "cat"));

   }
}