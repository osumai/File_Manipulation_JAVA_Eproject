package txtfilemanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java program to extract string content from Reversed file.
 * @author HP
 */

public class ReadExtractFile
{
    //Main method begins program execution
    public static void main(String[] args)
    {
        String line = null;
        
        try
        {
            FileReader fileReader = new FileReader("ProjectFile2.txt");
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            
            // always close the file after its use
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
        
    }
}