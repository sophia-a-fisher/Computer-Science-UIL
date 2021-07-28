import java.io.*;
import java.text.DecimalFormat;

public class Callen
{
   private static double startAirTemp;
   private static double airTemp;
   private static double endAirTemp;
   private static double startWindSpeed;
   private static double windSpeed;
   private static double endWindSpeed;
   private static int airStep;
   private static int windStep;
   private static double windChill;
   private static File file1;
   private static FileWriter outFile;
   private static BufferedWriter outStream;
   private static FileReader inFile;
   private static BufferedReader inStream;
   private static String[] components = new String[6];
   
   public static void main(String args[]) throws IOException
   {
      //writeFile();  
      inFile = new FileReader("callen.dat");
      inStream = new BufferedReader(inFile);
      String inString = inStream.readLine();
      
      while(inString != null)
      {
         components = inString.split(" ");
         
         if(Double.parseDouble(components[0]) > Double.parseDouble(components[1]))
         {
            startAirTemp = Double.parseDouble(components[0]);
            airTemp = startAirTemp;
            endAirTemp = Double.parseDouble(components[1]);
         }
         
         else
         {
            startAirTemp = Double.parseDouble(components[1]);
            airTemp = startAirTemp;
            endAirTemp = Double.parseDouble(components[0]);
         }
            
         if(startAirTemp > 50)
         {
            System.out.println("ERROR: air temperature > 50");
            return;
         }
         
         airStep = Integer.parseInt(components[2]); 
   
         if(Double.parseDouble(components[3]) < Double.parseDouble(components[4]))
         {
            startWindSpeed = Double.parseDouble(components[3]);
            windSpeed = startWindSpeed;
            endWindSpeed = Double.parseDouble(components[4]);
         }
         
         else
         {
            startWindSpeed = Double.parseDouble(components[4]);
            windSpeed = startWindSpeed;
            endWindSpeed = Double.parseDouble(components[3]);
         }
   
         if(startWindSpeed < 3)
         {
            System.out.println("ERROR: wind speed < 3");
            return;
         }
     
         windStep = Integer.parseInt(components[5]);
   
         System.out.print(String.format("%19s", "Wind Speeds\n"));
         System.out.print(String.format("%7s", "Temps"));
         while(windSpeed >= 3 && windSpeed <= endWindSpeed)
            {
                
                System.out.print(String.format("%7.0f", windSpeed));
                windSpeed += windStep;
            }
         windSpeed = startWindSpeed;
   
         System.out.println();
   
         while(airTemp <= 50 && airTemp >= endAirTemp)
         {
            System.out.print(String.format("%7.0f", airTemp));
            while(windSpeed >= 3 && windSpeed <= endWindSpeed)
            {
                System.out.print(String.format("%7.1f", calculateChill(airTemp, windSpeed)));
                windSpeed += windStep;
            }
            System.out.println();
            
            windSpeed = startWindSpeed;
            airTemp -= airStep;
         }
         System.out.println("*************************");
         inString = inStream.readLine();
      }
   }
   
   public static void writeFile() throws IOException
   {
      file1 = new File("callen.dat");
      file1.createNewFile();
      outFile = new FileWriter("callen.dat");
      outStream = new BufferedWriter(outFile);
      
      outStream.write("20 -10 10 15 30 5\n"); 
      outStream.write("-110 0 25 70 20 15"); 
      outStream.close();
   }
   
   public static double calculateChill(double airTemp, double windSpeed)
   {
      DecimalFormat df = new DecimalFormat("#.#");
      windChill = 35.74 + (.6215*airTemp) - 35.75*(Math.pow(windSpeed, .16)) + .4275*airTemp*(Math.pow(windSpeed,.16));
      return windChill;
   }
}