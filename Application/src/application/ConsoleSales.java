/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author Fentsey Oliphant
 */
public class ConsoleSales extends Consoles {

    // Constructor that accepts parameters and passes them to the superclass constructor
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the report matching the sample screenshot
    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}