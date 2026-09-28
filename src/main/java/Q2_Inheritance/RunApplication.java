/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2_Inheritance;

import java.util.Scanner;

/**
 *
 * @author vishe
 */
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Select the Console Type(PS5/XBOX/SWITCH): ");
        String consoleType = scanner.nextLine();
        
        System.out.println("Enter the store: ");
        String store = scanner.nextLine();
        
        System.out.println("Enter the total sales of " + consoleType + "for " + store + ": ");
        int totalSales = scanner.nextInt();
        
        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();
    }
}
