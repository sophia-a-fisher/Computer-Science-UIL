import java.util.*;

public class VCM3
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
      //System.out.print(Q16(5));
      //Q17();
      //Q19();
      Q20();
      //Q21();
      //Q23();
      //Q25();
      //Q26();
      //Q27();
      //Q28();
      //Q29();
      //Q30();
      //System.out.print(Q32(9));
      //Q33();
      //Q34(new int[][]{{3,6},{9,1},{-6,5},{7,2}});
      //Q36();
      
   }
   
   public static void Q2()
   {
      //Multiplication priority over plus
      System.out.println(7+3*3);
   }
   
   public static void Q3()
   {
      //Outputs thing in "" without ""
      System.out.println("10");
   }
   
   public static void Q4()
   {
      //String index starts at 0
      String d = "apluscompsci.com";
      System.out.print(d.charAt(5));
   }
   
   public static void Q5()
   {
      //for && to be true BOTH have to be true
      System.out.println(false&&false);
   }
   
   public static void Q6()
   {
      //pow() returns double and (base, power)
      double r;
      r = Math.pow(3,3);
      System.out.println(r);
   }
   
   public static void Q7()
   {
      //multiplication and division have priority over subtract
      System.out.println(4*3-10/5);
   }
   
   public static void Q8()
   {
      //when if doesn't have body only one statement in body
      int a = 9, b = 22;
      if(a >= b)
         System.out.print("1");
      if(a <= b)
         System.out.print("2");
      System.out.print("3");
   }
   
   public static void Q9()
   {
      //do-while always executes once
      int a = 5;
      do{
         a = a - 3;
      }while(a > 0);
      System.out.print(a);
   }

   public static void Q10()
   {
      //double[x] sets default length to x
      double[] m = new double[7];
      System.out.println(m.length);
   }


   public static void Q11()
   {
      //Scanner uses space as default deliminator
      Scanner e = new Scanner("5 6 7");
      System.out.println(e.nextDouble());
      System.out.println(e.next());
      System.out.println(e.nextInt());
   }
   
   public static void Q12()
   {
      //do while always goes at least once
      int a = 11;
      int u = 0;
      do{
         a = a - 2;
         u = u + a;
      }while(a > 0);
      System.out.println(u);
   }

   public static void Q13()
   {
      //Plus has priority over >>
      System.out.println(11+5 >> 1);
   }
   
   public static void Q14()
   {
      //Byte (-128,127)
      System.out.println(Byte.MIN_VALUE);
   }
   
   public static void Q15()
   {
      //ArrayList initialization doesn't have any elements yet
      List<String> y;
      y = new ArrayList<String>();
      System.out.println(y.get(1));
   }
   
   public static double Q16(double x)
   {
      //variable assignement shortcuts
      x = x * 2;
      x *= 2;
      return x;
   }
   
   public static void Q17()
   {
      //tracking loops and knowing increments
      int x = 0;
      for(int x1 = 0; x1 < 12; x1 = x1+3)
      {
         for(int x2 = 0; x2 <= x1; x2++)
         {
            x++;
         }
      }
      System.out.println(x);
   }
   
   public static void Q19()
   {
      //double can't be converted to float unless specified with (f)
      ArrayList<Float> decs;
      decs = new ArrayList<Float>();
      //decs.add(26.2);
      decs.add(new Float(26.2));
      decs.add(new Float("26.2f"));
   }
   
   public static void Q20()
   {
      //I DONT KNOW
      String line = "deckthehallswithstuff";
      String[] chunks = line.split("[d-h]");
      System.out.println(chunks.length);
      System.out.println(chunks[0]);
      System.out.println(chunks[1]);
      System.out.println(chunks[2]);
      System.out.println(chunks[3]);
      System.out.println(chunks[4]);
      System.out.println(chunks[5]);
      System.out.println(chunks[6]);
   }
   
   public static void Q21()
   {
      //put(x,y) places y at index x
      Map<Double, Integer> m;
      m = new HashMap<Double, Integer>();
      m.put(2.1,9);
      m.put(3.4,10);
      m.put(122.5, 76);
      
      System.out.println(m.get(2));
      System.out.println(m.put(2.1,22));
   }
   
   public static void Q23()
   {
      //poll() removes head of queue, offer() is same as add() 
      Queue<Integer> q;
      q = new LinkedList<Integer>();
      
      q.offer(28);
      q.add(42);
      q.offer(37);
      System.out.println(q.poll());
      
      q.offer(46);
      q.offer(40);
      System.out.println(q.remove());
   }
   
   public static void Q25()
   {
      //continue skips to next iteration without doing rest of statements 
      int count = 0;
      for(int i = 0; i < 25; i++)
      {
         for(int j = i; j >= 0; j = j - 4)
         {
            if((i*j)%2 == 0)
               continue;
            count++;
         }
      }
      System.out.println(count);
   }
   
   public static void Q26()
   {
      //continue skips to next iteration without doing rest of statements 
      int count = 0;
      for(int j = 20; j > 7; j += -3)
      {
         count++;
      }
      System.out.println(count);
   }
   
   public static void Q27()
   {
      //remember numbers correspond to characters (99 = c )
      String d = "apluscompsci.com";
      System.out.print(d.indexOf(99));
   }
   
   public static void Q28()
   {
      //algebraic expressions done before assignment
      double[] m = new double[4];
      m[0] = 8;
      m[3] = 44;
      m[3] = m[0] / 2;
      System.out.println(m[3]);
   }

   public static void Q29()
   {
      //add(x) adds to back of queue and add(x,y) adds y to x index
      List<Integer> y;
      y = new ArrayList<Integer>();
      y.add(2);
      y.add(1,5);
      y.add(0,8);
      System.out.println(y.get(1));
   }
   
   public static void Q30()
   {
      //bitwise >> divides by 2 << multiplies by 2
      // ^= is setting to xor bitwise operation
      Integer a = 99;
      a >>= 4;
      a <<= 3;
      System.out.println(a);
      
      a ^= 33;
      System.out.println(a);
   }
   
   public static int Q32(int n)
   {
      // tracking recursion in tree diagram
      int ans = 0;
      if(n <= 1)
         ans = 0;
      else
         ans = Q32(n-2) + (n-1);
      return ans;
   }
   
   public static void Q33()
   {
      // calling class variable by default gets super value
      abstract class Dog{
         public static final int max = 25;
      }
      
      class BigDog extends Dog{
         public static final int max = 7;
      }
      
      Dog dk = new BigDog();
      System.out.print(dk.max);
   }

   public static int Q34(int[][] mat)
   {
      // 2d array that's not square can't do [m][i] and [i][m]
      int tot = 0;
      int rows = mat.length;
      System.out.println(rows);
      int cols = mat[0].length;
      int start = Math.max(rows, cols) - 1;
      int m = start/2;
      for(int i = start; i >= 0; i--)
      {
         tot += mat[i][m];
         tot += mat[m][i];
      }
      return tot;
   }
   
   public static void Q36()
   {
      // calling class variable by default gets super value
      boolean B = true;
      boolean A = true;
      boolean C = false;
      System.out.println(B || (A && !A) || (C || !C));
   }


}

