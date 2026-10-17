package org.coding.codingwarrior.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author nageshasriramappa
 **/
public class FindTextInFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to search :");
        String text = scanner.nextLine();

        String filePath = "temp.txt";
        boolean isPresent = findTextInFile(filePath, text);
        System.out.println("Is text present :" + (isPresent));
        scanner.close();
    }

    static boolean findTextInFile(String filePath, String text) throws FileNotFoundException {
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(text)) {
                scanner.close();
                return true;
            }
        }

        scanner.close();

        return false;
    }
}
