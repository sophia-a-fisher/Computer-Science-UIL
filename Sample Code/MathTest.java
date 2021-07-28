public class MathTest
{
   //Methods include equals(), toString(), hashCode()
   public static void main(String[] args)
   {            
      System.out.println("abs() :: " + Math.abs(-78));
      System.out.println("abs() :: " + Math.abs(-73.3));
      System.out.println("pow() :: " + Math.pow(2,3));
      System.out.println("sqrt() :: " + Math.sqrt(9.0));
      System.out.println("ceil() :: " + Math.ceil(7.2));
      System.out.println("floor() :: " + Math.floor(7.7));
      System.out.println("ceil() :: " + Math.ceil(-7.2));
      System.out.println("floor() :: " + Math.floor(-7.7));
      System.out.println("min() :: " + Math.min(3.0,2.4));
      System.out.println("max() :: " + Math.max(3.0,2.4));
      System.out.println("min() :: " + Math.min(3,2));
      System.out.println("max() :: " + Math.max(3,2));
      System.out.println("round() :: " + Math.round(7.5));
      System.out.println("random() :: " + Math.random());
   }
}