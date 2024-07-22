package txtfilemanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java program to display content in the ByteProjectFile file.
 * @author HP
 */

public class ReadByteFile
{
    //main method begins program execution
    public static void main(String[] args)
    {
        String line = null;
        
        try
        {
            FileReader fileReader = new FileReader("ByteProjectFile.txt");
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            
            //Close the file after its use
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
        
    }
}