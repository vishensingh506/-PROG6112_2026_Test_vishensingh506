/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1_2DArrays;
import java.util.Scanner;

/**
 *
 * @author vishe
 */
public class ElectronicsReport {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[][] sales = new int[3][3];
        
        for(int i = 0; i<cities.length; i++){
            for(int j = 0; j<consoles.length; j++){
                System.out.println("Enter " + consoles[j] + " sales in " + cities[i]);
                sales[i][j] = scanner.nextInt();
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------");
        System.out.println("");
        
        for(int i = 0; i<sales.length;i++){
                System.out.println("City: "+ cities[i]);
                for(int j = 0; j<sales[i].length;j++){
                    System.out.println(consoles[j] +": "+ sales[i][j]);
                }
                 System.out.println(" ");
        }
        
        //Total sales for each city
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");
        System.out.println("");
        
        int[] cityTotals = new int[cities.length];
        
        for(int i = 0; i<cities.length; i++){
            cityTotals[i] = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.println(cities[i] + ": " + cityTotals[i]);
        }
        
        //City with the most console sales
        System.out.println("");
        int maxSales = 0;
        int maxCityIndex = 0;
        
        for(int i = 0; i<cityTotals.length; i++){
            if(cityTotals[i] > maxSales){
                maxSales = cityTotals[i];
                maxCityIndex = i;
            }
        }
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxCityIndex]);
    }
}
