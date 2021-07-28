import java.lang.*;
import java.util.*;

public class Class
{
   private int i; private double d; private String s;
   public Class(int m, double n, String o) 
   {  i = m;
      d = n;
      s = o;   
   }
   
   public Class() 
   { 
      i = 8;
      d = 0.5;
      s = "science"; 
   }
   
   public int a() 
   {
      return (int)(d * b()); 
   }
   public int b() 
   {
      return i; 
   }
   public double c() 
   {
      return d; 
   }
   public String d() 
   {
      return s.substring(a()); 
   }
}

class RunClass
{
   public static void main(String[] args)
   {
      //Class obj1 = new Class(); 
      //Class obj2 = new Class(obj1.d().length(),0.75,"computer");
      //System.out.println(obj1.a());
      //System.out.println(obj1.d()); 
      //System.out.println(obj2.d());
      int[] ray = {6,2,3,8,3,9,2};
      int[] ray1 = {6,2,3,8,3,9,2};
      int[] ray2 = {6,2,3,8,3,9,2};
      int[] ray3 = {6,2,3,8,3,9,2};
      prog4(ray);
      prog5(ray1);
      prog6(ray2);
      //prog7(ray);

      System.out.println(Arrays.toString(ray));
      System.out.println(Arrays.toString(ray1));
      System.out.println(Arrays.toString(ray2));
      //String[] s = "Mississippi".split("i",2);
      //for(String element : s)
      //{
      //   System.out.print(element + " " );
      //}
      //System.out.println(s[2]);
      
      
   }
   
   public static void prog1()
   {
      char[][] letters = new char[5][5];
      char letter = 'A';
      for(int i = 0; i < letters.length; i++)
      {
         for(int j = 0; j < letters[i].length; j++) 
         {
            letters[i][j] = letter++;           
         }
      
      }
      
      for(char[] arr:letters) System.out.println(Arrays.toString(arr));
      
   }
   
   public static void prog2()
   {
      ArrayList<Integer> x = new ArrayList<Integer>(); 
      ArrayList<Integer> y = new ArrayList<Integer>();
      Integer[] i = {5,6,4,3,7,1,8,9,2}; 
      for(int m:i) 
      {
         x.add(m);
         y.add(m); 
      } 
      System.out.print((x == y) + " "); 
      System.out.print(x.equals(y));
   }
   
   public static void prog3()
   {
      int[] a = {3,7,1,9,8,6,4,2,5,0}; 
      Arrays.sort(a, 3, 7);
      System.out.print(Arrays.toString(a));
      int[] b = Arrays.copyOfRange(a, a[2], a[5]); 
      System.out.print(Arrays.toString(b));
   }
   
   public static void prog4(int[] list)
   {
      for(int i = 0; i < list.length - 1; i++)
{int k = i ;
for(int j = i + 1; j < list.length; j++)
if(list[j] < list[k]) k = j;
int t = list[i]; list[i] = list[k]; list[k] = t;
}
   }
   
   public static void prog5(int[] list)
   {
      for(int x = 1; x < list.length; x++)
{
int y = list[x];
int z = x;
while(z > 0 && y < list[z - 1] )
{ list[z] = list[z - 1]; z--;
}list[z] = y; }   }

public static void prog6(int[] list)
   {
      for(int x = 1; x < list.length; x++)
{
int y = list[x];
int z = x;
while(z > 0 && y < list[z - 1] )
{ list[z] = list[z - 1]; z--;
}list[z] = y; }   }

/*public static void prog7(int[] list)
   {
     if(i == list.length) return;
int k = i;
for(int j = i + 1; j < list.length; j++)
if(list[j] < list[k]) k = j;
int t = list[i]; list[i] = list[k]; list[k] = t; sort(list, i + 1);} 

*/

}