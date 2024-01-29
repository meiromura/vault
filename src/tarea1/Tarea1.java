package tarea1;

import java.util.Scanner;

/**
 *
 * @author Jose De Paz 202202525
 */
public class Tarea1 {

    static Scanner sc = new Scanner(System.in);
    static int Seleccion;
    String sino;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y;
        System.out.println("Elija una opcion");
        System.out.println("1.Suma" + "\n2.Resta" + "\n3.Multiplicacion" + "\n4.Division" + "\n5.Tablas de multiplicar" + "\n6.Salir");
        Seleccion = sc.nextInt();
        System.out.println("Digite el Primer numero:");
        x = sc.nextDouble();
        System.out.println("Digite el Segundo numero:");
        y = sc.nextDouble();

        if (Seleccion == 5) {
            System.out.println("Numero de la tabla multiplicar");

        }

        if (Seleccion == 4) {
            
        } else {

            System.out.println(calcular(x, y, Seleccion));
        }

    }

    public static double calcular(double x, double y, int op) {

        switch (op) {
            case 1:

                return x + y;
            case 2:

                return x - y;
            case 3:

                return x * y;
            case 4:

                break;
            case 5:

                break;

            default:
                System.out.println("Opcion no valida");
        }

        return 0;
    }

}
