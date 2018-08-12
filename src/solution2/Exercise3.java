package solution2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int cantnum;
        int[] vec;
        int[] vecaux;

        System.out.println();
        System.out.print("Cantidad de numeros a ingresar: ");
        cantnum = scan.nextInt();

        vec = new int[cantnum];
        vecaux = new int[cantnum * 2];

        System.out.println();
        System.out.println("Ingrese los numeros:");

        for (int i = 0; i < cantnum; i++) {
            System.out.print("                    .  ");
            num = scan.nextInt();

            vec[i] = num;
        }

        /* Cantidad de veces que contiene un elemento N */
        System.out.println();
        System.out.print("Ingrese numero a verificar: ");
        num = scan.nextInt();

        int cant = 0;

        for (int i = 0; i < vec.length; i++) {

            if (num == vec[i]) {
                cant++;
            }
        }

        System.out.println("Cantidad de veces: " + cant);

        /* Elemento con mayor cantidad de repeticiones y 
           cuantas veces aparece en el vector */
        int aux = -1;
        int vaux = 0;
        int cantvaux = 0;
        for (int i = 0; i < vec.length; i++) {

            if (vec[i] != 0 && vec[i] != aux) {

                for (int j = 0; j < vec.length; j++) {

                    if (vec[i] == vec[j]) {
                        cantvaux++;
                    }
                }
                vecaux[vaux] = vec[i];
                vecaux[vaux + 1] = cantvaux;
                vaux = vaux + 2;
                cantvaux = 0;
                aux = vec[i];
            }
        }

//        for (int i = 0; i < vecaux.length; i++) {
//            System.out.println(vecaux[i]);
//        }
        int cantmayor = 0;
        int j = 0;
        for (int i = 1; i < vecaux.length; i++) {
            if ((i % 2 != 0) && (vecaux[i] != 0)) {
                if (cantmayor < vecaux[i]) {
                    cantmayor = vecaux[i];
                    j = i;
                }
            }
        }
        
        System.out.println();
        System.out.println("El numero con mayor repeticiones es: " + vecaux[j - 1]); 
        System.out.println("Con " + cantmayor + " repeticiones.");
        System.out.println();
    }
}
