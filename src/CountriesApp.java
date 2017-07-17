import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Rizwan on 7/11/2017.
 */

    public class CountriesApp {

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String fileName = "Countries.txt";
                String dir = "C:\\Lab15";



            CountriesTextFile.createFile(fileName);
            int userInput = 0;


            do {
                System.out.println();
                System.out.println("Welcome to the Countries Maintenance Application! ");
                System.out.println("1: See the list of countries");
                System.out.println("2: Add a country");
                System.out.println("3: Exit");
                System.out.println();
                System.out.println("Enter menu number: ");
                userInput= scan.nextInt();
                scan.nextLine();
                System.out.println();
                if (userInput==1){
                    CountriesTextFile.ReadFromFile(dir,fileName);
                }
                else if (userInput==2){
                    CountriesTextFile.WriteToFile(scan,dir,fileName);
                }


            }while (userInput==1  || userInput==2);

            System.out.println("Goodbye");




        }

    }