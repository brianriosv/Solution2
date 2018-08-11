package solution2;

import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        boolean bol = false;
        int[] vec = {21, 34, 69, 46, 19, 72, 10, 1, 88, 22};
        
        System.out.print("Ingrese un numero: ");
        num = scan.nextInt();
        
//        for (int i = 0; i < vec.length; i++) {
//            if (vec[i] == num) {
//                bol = true;
//            }
//        }
        
        System.out.println();
        
        if (Pertenece(num, vec)) 
            System.out.println("El numero pertenece.");
        else
            System.out.println("El numero no pertenece.");
        
        System.out.println();
    }
    
    public static boolean Pertenece(int num, int[] vec){
        boolean bol = false;
        
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == num) 
                bol = true;
        }
        
        return bol;
    }
    
}
