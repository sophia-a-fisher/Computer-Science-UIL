public class CharacterTest
{
   //Methods include equals(), toString(), hashCode()
   public static void main(String[] args)
   {
      Character thing1 = 'c';
      Character thing2 = 'C';
      Character thing3 = '*';
            
      System.out.println("Thing1 isDigit() :: " + thing1.isDigit('c'));
      System.out.println("Thing1 isLetter() :: " + thing1.isLetter('c'));
      System.out.println("Thing1 isLetterOrDigit() :: " + thing1.isLetterOrDigit('c'));
      System.out.println("Thing3 isLetterOrDigit() :: " + thing3.isLetterOrDigit('*'));
      System.out.println("Thing1 isLowerCase() :: " + thing1.isLowerCase('c'));
      System.out.println("Thing1 isUpperCase() :: " + thing1.isUpperCase('c'));
      System.out.println("Thing1 toUpperCase() :: " + thing1.toUpperCase('c'));
      System.out.println("Thing2 toLowerCase() :: " + thing2.toLowerCase('C'));
   }
}