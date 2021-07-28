import java.io.*;
import java.text.DecimalFormat;

public class Bayani
{
   private static File file1;
   private static FileWriter outFile;
   private static BufferedWriter outStream;
   private static FileReader inFile;
   private static BufferedReader inStream;
   
   public static void main(String args[]) throws IOException
   {
      //writeFile();  
      inFile = new FileReader("bayani.dat");
      inStream = new BufferedReader(inFile);
      String inString = inStream.readLine();
      double sum = 0;
      
      while(inString != null)
      {
         System.out.println(String.format("\t\t  $%7s", inString));
         sum += Double.parseDouble(inString);
         inString = inStream.readLine();
      }
     
      System.out.println(String.format("Total = $%7s", sum));
      System.out.println();
            
   }
   
   public static void writeFile() throws IOException
   {
      file1 = new File("bayani.dat");
      file1.createNewFile();
      outFile = new FileWriter("bayani.dat");
      outStream = new BufferedWriter(outFile);
      
      outStream.write("6.99\n12.87\n5.44\n99.99\n115.87\n"); 
      outStream.close();
   }
   
}