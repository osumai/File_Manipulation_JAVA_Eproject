package txtfilemanipulation;

import java.io.File;
import java.io.IOException;

/**
 * Java program to create a new empty file .
 *
 * @author HP
 */
public class CreateNewFile {

    //main method begins program execution
    public static void main(String[] args) {
        //Initialize File object 
        File file = new File("ProjectFile.txt");

        //Create and test new file then print exceptions if any
        try {

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(System.out);
        }

    }

}


