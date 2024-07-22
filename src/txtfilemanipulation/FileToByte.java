package txtfilemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Java program that converts file data into byte codes and saved in a new file.
 *
 * @author HP
 */
public class FileToByte {
//main method begins program execution
    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "ProjectFile.txt";
        String finalPath = System.getProperty("user.dir") + "ByteProjectFile.txt";

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            Files.write(Paths.get(finalPath), encoded);
        } catch (IOException e) {

        }
    }

}
