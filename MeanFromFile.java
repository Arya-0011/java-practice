import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * MeanFromFile
 */
public class MeanFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        int count = 0;

        File inputFile = new File("/workspaces/java-practice/Number.txt");
        Scanner scan = new Scanner(inputFile);

        while (scan.hasNext()) {
            int number = scan.nextInt();
            sum += number;
            count++;
        }

        if (count > 0) {
            float mean = (float) sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("The file is empty. Cannot calculate the mean.");
        }

        scan.close();
    }
}
