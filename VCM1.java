import java.util.*;

public class VCM1
{
   public static void main(String[] args)
   {
      //Q2();
      //Q3();
      //Q4();
      //Q5();
      //Q6();
      //Q7();
      //Q8();
      //Q9();
      //Q10();
      //Q11();
      //Q12();
      //Q13();
      //Q14();
      //Q15();
      //Q16();
      //Q17();
      //Q18();
      //Q19();
      //Q20();
      //Q21();
      //Q23();
      //Q24();
      //System.out.println(Q25(7));
      //Q27();
      //Q29();
      //Q30();
      //Q31();
      //Q33();
      Q36();
      
   }
   
   public static void Q2()
   {
      //% gives remainder
      int a = 7 % 3;
      System.out.println(a);
   }
   
   public static void Q3()
   {
      //"" acts as barrier for int addition
      System.out.println(3 + 7 + "" + 8);
   }
   
   public static void Q4()
   {
      //indexOf starts search at beginning
      String best = "aplusccompsci.com";
      System.out.print(best.indexOf('.'));
   }
   
   public static void Q5()
   {
      //for && to be true BOTH have to be true
      boolean sam = false;
      System.out.println(sam&&false);
   }
   
   public static void Q6()
   {
      //ceil() returns double and rounds up always
      System.out.println(Math.ceil(4.6));
   }
   
   public static void Q7()
   {
      //casting has priority over division
      Double b = (double) 9 / 2;
      System.out.println(b);
   }
   
   public static void Q8()
   {
      //when if doesn't have body only one statement in body
      int cnt = 10;
      if(cnt > 5)
         System.out.print(1);
      if(cnt > 10)
         System.out.print(2);
      System.out.print(3);
   }
   
   public static void Q9()
   {
      //for increments by chosen increment
      for(int i = 0; i < 6; i+=2)
         System.out.print(i);
   }

   public static void Q10()
   {
      //static array starts at index 0
      String[] s = {"if", "go", "at"};
      System.out.print(s[1]);
      System.out.print(s[0]);
   }


   public static void Q11()
   {
      //int is autoboxed to any data type larger than it
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
   }
   
   public static void Q12()
   {
      //being able to trace loops
      int sum = 0;
      for(int i = 0; i < 9; i += 2)
         sum += i;
      System.out.print(sum);
   }

   public static void Q13()
   {
      //modulus and multiply has priority over add
      double w = 11 % 2 + 3 * 4 / 2;
      System.out.print(w);
   }
   
   public static void Q14()
   {
      //& over ^ over | priority
      int a = 9 | 22 & 4 ^ 7;
      System.out.println(a);
   }
   
   public static void Q15()
   {
      //default is int and int can't be converted to short
      List<Short> m;
      m = new ArrayList<Short>();
      //m.add(3);
      //m.add(1,6);
      System.out.print(m);
   }
   
   public static void Q16()
   {
      //printf is still; valid for null
      Double d = null;
      System.out.printf("%.2f", d);
   }
   
   public static void Q17()
   {
      //modulus gives remainder
      System.out.println(1 % 5);
   }
   
   public static void Q18()
   {
      //watch out for nested loops
      int sum = 0;
      for(int j = 0; j < 6; j++)
      {
         for(int k = 0; k < j; k++)
         {
            sum += k;
         }
         if(j%2==1)
            sum -=3;
         
      }
      System.out.println(sum);
   }
   
   public static void Q19()
   {
      //do while always goes once
      int z = 07;
      int count = 0;
      do
      {
         z = z - 1;
         count++;
      }while(z > 1);
      System.out.println(count);
   }
   
   public static void Q20()
   {
      //double can't be unboxed converted to float
      float x;
      //x = Math.pow(Math.round(5.5),2);
      //System.out.println(x);
   }
   
   public static void Q23()
   {
      //the options aren't real Wrapper classes
      Set<Byte> set;
      set = new TreeSet<Byte>();  
   }
   
   public static void Q24()
   {
      //handle a static array
      int[] ray;
      ray = new int[4];
      ray[0] = 5;
      ray[1] = ray[0] * 2;  
      ray[2] = ray[1] / 3;
      System.out.println(ray[2]);
   }
   
   public static double Q25(double x)
   {
      //able to trace loop
      double ans = 1.0;
      for(double r = x; r >= 1; r--)
         ans = ans*r;      
      return ans;
   }
   
   public static void Q27()
   {
      //adds just like static array but takes off butt
      Stack<Character> s;
      s = new Stack<Character>();
      s.add('P');
      s.add('O');
      s.add('P');
      s.add('I');
      s.add('T');
      System.out.println(s);
      System.out.println(s.pop());
      System.out.println(s);
   }

   public static void Q29()
   {
      //divide by 2 7 times
      System.out.println(4096 >> 7);
   }
   
   public static void Q30()
   {
      //boolean arrays default to false
      int[] a = new int[7];
      boolean[] b = new boolean[7];
      for(int i = 0; i < 7; i++)
         a[i] = a[i] + 1;
         
      System.out.println(b[5] + " " + a[5]);
   }
   
   public static void Q31()
   {
      //iterator methods and movement
      ArrayList<Character> cList;
      cList = new ArrayList<Character>();
      cList.add('$');
      cList.add('&');
      cList.add('7');
      cList.add('4');
      cList.add('W');
      ListIterator iter;
      iter = cList.listIterator();
      iter.next();
      iter.next();
      iter.remove();
      iter.add('6');
      iter.previous();
      System.out.println(iter.next());
      iter.set('5');
      iter.next();
      iter.previous();
      iter.previous();
      System.out.println(iter.next());
   }
   
   public static void Q33()
   {
      // shortcut doesn't work if assigned to variable???
      int trick = 19;
      trick++;
      trick++;
      ++trick;
      System.out.println(trick);
      trick = trick++;
      trick = trick++;
      System.out.println(trick);
      System.out.println(++trick);
   }

   public static int Q34(double[] d, double y)
   {
      // 2d array that's not square can't do [m][i] and [i][m]
      int spot = -1, x = 0;
      while(x < d.length)
      {
         if(d[x++] == y)
            spot = x;
      }
      return spot;
   }
   
   public static void Q36()
   {
      // short max value is 32767
      int s = Short.MAX_VALUE, x = s;
      int y = 0;
      for(s = 0; x > 0; y++)
      {
         s += x % 10;
         x /= 10;
      }
      System.out.println(s + " " + y);
   }


}

