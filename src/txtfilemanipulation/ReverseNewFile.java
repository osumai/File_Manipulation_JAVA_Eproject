package txtfilemanipulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/**
 * Java program to reverse content in the new file created.
 *
 * @author HP
 */
public class ReverseNewFile {
//Main method begins program execution
    public static void main(String[] args) {
         //Use a try with resources to automatically close resources
        try 
        {
            ArrayList list;
            try (BufferedReader input = new BufferedReader(new FileReader("ProjectFile.txt"))) {
                list = new ArrayList();
                String line;
                while ((line = input.readLine()) != null) {
                    list.add(line);
                }
            }

            Collections.reverse(list);
         //Use a try with resources to automatically close resources
            try (PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("ReversedProjectFile.txt")))) {
                for (Iterator i = list.iterator(); i.hasNext();) {
                    output.println((String) i.next());
                }
            }
            
        } catch (IOException e) 
            
        {
            System.err.println(e);
        }
    }
}
