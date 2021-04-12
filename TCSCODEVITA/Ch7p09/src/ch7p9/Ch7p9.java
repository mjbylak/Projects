/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7p9;
import java.util.Scanner;
/**
 *
 * @author mitch
 */
public class Ch7p9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double [] bop = new double[10];
    System.out.println("Enter 10 numbers");
    for (int i = 0; i < bop.length; i++) {
        bop[i] = scnr.nextDouble();
    }
    System.out.println("The minimum is: " + min(bop));
        }
    public static double min( double [] bop) {
            
    double min = bop[0];
    for (int i = 0; i < bop.length; i ++) {
        if (bop[i] < min)
            min = bop[i];
            }
    return min;
    }
    }
    
