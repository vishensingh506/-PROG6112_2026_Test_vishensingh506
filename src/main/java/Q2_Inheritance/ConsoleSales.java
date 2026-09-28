/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2_Inheritance;

/**
 *
 * @author vishe
 */
public class ConsoleSales extends Consoles{
    
    public ConsoleSales(String consoleType, String store, int totalSales){
        super(consoleType, store, totalSales);
    }
    
    public void printReport(){
        System.out.println("CONSOLE REPORT");
        System.out.println("***************");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store: " + getStore());
        System.out.println("Total sales: " + getTotalSales());
    }
}
