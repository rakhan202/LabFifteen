import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 * Created by Rizwan on 7/11/2017.
 */

public class CountriesTextFile {

    public static void ReadFromFile(String dir, String filename) {
        Path filePath = Paths.get(dir, filename);
        File textFile = filePath.toFile();

        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);

            try {
                String line = reader.readLine();

                while (line != null){
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void WriteToFile(Scanner s,String dir, String fileName) {
        Path testPath = Paths.get(dir, fileName);
        File testFiles = testPath.toFile();
        System.out.println("Enter a Country:");
        String ourString = s.nextLine();



        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));

            out.println(ourString);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createFile( String fileString) {
        Path filePath = Paths.get( fileString);
        if (Files.notExists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("There was an error: " + e);
            }

        }
      //  System.out.println("File Name: " + filePath.getFileName());
       // System.out.println("Absolute Path: " + filePath.toAbsolutePath());
       // System.out.println("Is Writeable: " + Files.isWritable(filePath));

    }

    public static void createDirectory(Path dirPath) {
        if (Files.notExists(dirPath)){
            try {
                Files.createDirectories(dirPath);
            } catch (IOException e) {
                //e.printStackTrace();
                System.out.println("There was an error" + e);
            }
        }
    }
}
