package solution2;


import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int cantnum;
        int[] vec;
        int mayor;
        int menor;  //= Integer.MAX_VALUE; // se obtiene el numero maximo de tipo int
        float sum = 0;
        int cont1 = 0;
        float cont2 = 0;
                
        System.out.print("Cantidad de numeros a ingresar: ");
        cantnum = scan.nextInt();
        
        vec = new int[cantnum];
        
        System.out.println();
        System.out.println("Ingrese los numeros:");
        System.out.println();
        
        while (cont1 < cantnum) {
            System.out.print(" .  ");
            num = scan.nextInt();
            vec[cont1] = num;
            cont1++;
        }
        
        mayor = menor = vec[0];
        
        for (int i = 0; i < vec.length; i++) {
            
            if (mayor < vec[i] && vec[i] != 0) 
                mayor = vec[i];
                            
            if (menor > vec[i] && vec[i] != 0) 
                menor = vec[i];            
            
            if (vec[i] != 0) {
                cont2++;
            }
        }
        
        for (int i : vec) {
            sum += i;
        }
        
                
        System.out.println();
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("La sumatoria es: " + sum);
        System.out.println("El promedio es: " + (sum / cont2));        
        
    }
    
}
