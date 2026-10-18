package org.coding.codingwarrior.common;

import java.util.Scanner;

/**
 * @author nageshasriramappa
 **/
public class SimpleSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

//        int option = switch (choice) {
//            case 1, 2, 3:
//                yield choice;
//            default:
//                yield -1;
//        };

        int option = switch (choice) {
            case 1, 2, 3 -> choice;
            default -> -1;
        };
    }
}
