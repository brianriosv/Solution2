package solution2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int cantnum;
        int[] vec;
        int cont1 = 0;

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

//        mayor = menor = vec[0];
//        for (int i = 0; i < vec.length; i++) {
//
//            if (mayor < vec[i] && vec[i] != 0) {
//                mayor = vec[i];
//            }
//
//            if (menor > vec[i] && vec[i] != 0) {
//                menor = vec[i];
//            }
//
//            if (vec[i] != 0) {
//                cont2++;
//            }
//        }
//        for (int i : vec) {
//            sum += i;
//        }
        System.out.println();
        System.out.println("El numero mayor es: " + mayor(vec));
        System.out.println("El numero menor es: " + menor(vec));
        System.out.println("La sumatoria es: " + sumatoria(vec));
        System.out.println("El promedio es: " + promedio(vec));
        System.out.println();
    }

    public static int mayor(int[] vec) {
        int mayor = 0;

        for (int i = 0; i < vec.length; i++) {
            if (mayor < vec[i] && vec[i] != 0) {
                mayor = vec[i];
            }
        }
        return mayor;
    }

    public static int menor(int[] vec) {
        // Integer.MAX_VALUE; - se obtiene el numero maximo del tipo integer
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < vec.length; i++) {
            if (menor > vec[i] && vec[i] != 0) {
                menor = vec[i];
            }
        }
        return menor;
    }

    public static double cantidad(int[] vec) {
        double cont = 0;

        for (int i = 0; i < vec.length; i++) {
            if (vec[i] != 0) {
                cont++;
            }
        }
        return cont;
    }

    public static double sumatoria(int[] vec) {
        double s = 0;

        for (int i : vec) {
            s += i;
        }
        return s;
    }

    public static double promedio(int[] vec) {
        double prom = sumatoria(vec) / cantidad(vec);

        return prom;
    }

}
