package txtfilemanipulation;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Java program to write some content to the new file created.
 *
 * @author HP
 */
public class WriteToNewFile {
//main method begins program execution
    public static void main(String[] args) throws IOException {
        try {
            try (FileWriter myWriter = new FileWriter("ProjectFile.txt")) {
                myWriter.write("With great power comes great responsibility."
                        + "\nSpiderman 1.");
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace(System.out);// Prints exceptions if any
        }
        
    }

}
