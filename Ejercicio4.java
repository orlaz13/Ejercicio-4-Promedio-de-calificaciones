import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double suma = 0;
        double promedio;
        int contador = 1;
        while (contador <= 5) {
            System.out.print("Nota " + contador + ": ");
            nota = sc.nextDouble();
            suma = suma + nota;
            contador = contador + 1;
        }
        promedio = suma / 5;
        System.out.println("Promedio: " + promedio);
        sc.close();
    }
}