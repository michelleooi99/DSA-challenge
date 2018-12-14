/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michelleooichinyee;

/**
 *
 * @author Tarc
 */
public class ConvertDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Binary(8);
        System.out.print("\n");
        
        Hexa(8);
        System.out.print("\n");
        
        Binary(15);
        System.out.print("\n");
        
        Hexa(15);
        System.out.print("\n");
        
        Binary(125);
        System.out.print("\n");
        
        Hexa(125);
        System.out.print("\n");
    }
    
    private static void Binary(int n){
        if(n == 1){
            System.out.print(n);
        }
        
        else {
            Binary(n / 2);
            System.out.print(n % 2);
        }
    }
    
    private static void Hexa(int n){
        if (n < 16) {
            printHexa(n);
        }
        
        else {
            Hexa(n / 16);
            printHexa(n % 16);
        }
    }

    private static void printHexa(int n) {
        switch (n) {
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
            case 15:
                System.out.print("F");
                break;
            default:
                System.out.print(n);
        }
    }
    
}
