import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Candela
{
   private static File file1;
   private static FileWriter outFile;
   private static BufferedWriter outStream;
   private static FileReader inFile;
   private static BufferedReader inStream;
   private static ArrayList<String> points;
   private static ArrayList<String> difficulty;
   private static ArrayList<String> targetDif;
   private static ArrayList<String> doPoints;
   private static ArrayList<String> doDifficulty;
   private static ArrayList<Integer> outputString;
   
   public static void main(String args[]) throws IOException
   {
      writeFile();  
      inFile = new FileReader("candela.dat");
      inStream = new BufferedReader(inFile);
      String inString = inStream.readLine();
      int counter = 0;
      int totalQuestions = 0;
      String[] temp = new String[2];
      points = new ArrayList<String>();
      difficulty = new ArrayList<String>();
      targetDif = new ArrayList<String>();
            
      while(inString != null)
      {
         if(counter == 0)
         {
            totalQuestions = Integer.parseInt(inString);
         }
         
         else if(counter > 0 && counter <= totalQuestions)
         {
            temp = inString.split(" ");
            points.add(temp[0]);
            difficulty.add(temp[1]);
         }
         
         else
         {
            targetDif.add(inString);
         }
         //System.out.println(String.format("\t\t  $%7s", inString));
         //sum += Double.parseDouble(inString);
         inString = inStream.readLine();
         counter++;
      }
      
      //System.out.println(points);
      //System.out.println(difficulty);
      //System.out.println(targetDif);
      for(String element: targetDif)
      {
          writeOutput(element);
          System.out.println("=====");
      }
      //System.out.println(String.format("Total = $%7s", sum));
      System.out.println();
            
   }
   
   public static void writeFile() throws IOException
   {
      file1 = new File("candela.dat");
      file1.createNewFile();
      outFile = new FileWriter("candela.dat");
      outStream = new BufferedWriter(outFile);
      
      outStream.write("10\n12 8\n10 5\n8 3\n12 4\n");
      outStream.write("7 5\n13 3\n16 2\n2 8\n14 4\n4 5\n");
      outStream.write("40\n30\n10\n");
      outStream.close();
   }
   
   public static void writeOutput(String target) 
   {
      doPoints = new ArrayList<String>();
      doDifficulty = new ArrayList<String>();
      outputString = new ArrayList<Integer>();
      ArrayList<Integer> tempArray = new ArrayList<Integer>();
        
      System.out.println(String.format("Target diff     = %1s", target));
      //System.out.println(String.format("Calculated diff = %1s", Integer.parseInt(targetDif)-1));
      
      int tempMax = 0;
      int tempIndex = 0;
      int calculatedDif = 0;
      boolean add = true;
      int counter = 0;
      
      while(calculatedDif < Integer.parseInt(target) && counter < points.size())
      {
         counter++;
         tempMax = 0;
         tempIndex = -1;
         add = true;
         for(int i = 0; i < points.size(); i++)
         {
         
            if(Integer.parseInt(points.get(i)) >= tempMax)
            {
               
               for(Integer element: tempArray)
               {
                  if(element == i)
                  {
                     add = false;
                  }
                  
               }
               
               
                
               if(add)
               {
                  tempMax = Integer.parseInt(points.get(i));
                  tempIndex = i;  
               }
               add = true;
                 
            }
            //System.out.println(tempMax);
         }
         
         
         if(tempMax == 0)
         {
            tempMax = -1;
         }
         if(tempIndex > -1 && Integer.parseInt(difficulty.get(tempIndex)) + calculatedDif <= Integer.parseInt(target))
         {
            //System.out.println("ct");
            outputString.add(tempIndex);
            calculatedDif += Integer.parseInt(difficulty.get(tempIndex));
            //System.out.println(calculatedDif);
         }
         if(tempIndex > -1)
         {
            tempArray.add(tempIndex);
         }
         //System.out.println(outputString);
         //tempArray.remove(tempIndex);
      }
            //System.out.println(tempMax);
      Collections.sort(outputString);

      System.out.println("Calculated diff = " + calculatedDif);
      //System.out.println(outputString);
      
      for(Integer element: outputString)
      {
         System.out.print(String.format("Q#%2s" , element+1));
         System.out.print(String.format(",%3s" , points.get(element)));
         System.out.print(String.format(" pts, diff%2s" , difficulty.get(element)));
         System.out.println();
      }

   }
   
}