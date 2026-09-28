/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.util.Scanner;

/**
 *
 * @author Fentsey Oliphant
 */
public class Runapplication {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // Display selection menu to the user
        System.out.println("Select the Concole Device Type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

  
        int choice = scanner.nextInt();
        scanner.nextLine();

        String consoleType = "";
    
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid selection. Defaulting to PS5.");
                consoleType = "PS5";
        }

        
        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        // Get total sales from user
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = scanner.nextInt();

        // Instantiate the ConsoleSales class with the user's input
        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);

        // Call the method to print the final report
        sale.printReport();

     
        scanner.close();
    }
}
    
