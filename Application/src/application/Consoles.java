/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author Fentsey Oliphant
 */

public abstract class Consoles implements IConsoles {
    // Variables to store the required data
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor that accepts parameters to initialize the variables
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Implementing the methods from the IConsoles interface
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
    

