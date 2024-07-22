package txtfilemanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java program to compare content in the reversed file with original file .
 * @author HP
 */
public class CompareFiles {

    //Main method begins program execution
    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader2;
        try (BufferedReader reader1 = new BufferedReader(new FileReader("ProjectFile.txt"))) {
            reader2 = new BufferedReader(new FileReader("ReversedProjectFile.txt"));
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            boolean areEqual = true;
            int lineNum = 1;
            while (line1 != null || line2 != null) {
                if (line1 == null || line2 == null) {
                    areEqual = false;
                    
                    break;
                } else if (!line1.equalsIgnoreCase(line2)) {
                    areEqual = false;
                    
                    break;
                }
                
                line1 = reader1.readLine();
                
                line2 = reader2.readLine();
                
                lineNum++;
            }   if (areEqual) {
                System.out.println("The two files have same content.");
            } else {
                System.out.println("The two files have different content. They differ at line " + lineNum);
                
                System.out.println("ProjectFile contains: " + line1 + "\nAnd ReversedProjectFile contains: " + line2 + " at line " + lineNum);
            }
        }

        reader2.close();
    }
}
