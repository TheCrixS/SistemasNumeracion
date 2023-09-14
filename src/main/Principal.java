package main;
import operaciones.Conversion;
import operaciones.Suma;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Suma");
            System.out.println("2. Conversion");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    sumas();
                    break;
                case 2:
                    conversiones();
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);
        scanner.close();
    }
    public static void sumas() {
        Scanner scanner = new Scanner(System.in);
        int subOpcion;
        Suma suma = new Suma();
        do {
            System.out.println("\n=== Sumas ===");
            System.out.println("1. Decimales");
            System.out.println("2. Binarios");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    int op1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int op2 = scanner.nextInt();
                    int sum = suma.sumaDecimales(op1,op2);
                    System.out.println("La suma de los numeros decimales ("+op1+", "+op2+") es: "+sum);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    String bin1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String bin2 = scanner.next();
                    String sumBin = suma.sumaBinarios(bin1,bin2);
                    System.out.println("La suma de los numeros binarios ("+bin1+", "+bin2+") es: "+sumBin);
                    break;
                case 3:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Subopción no válida. Por favor, seleccione una subopción válida.");
                    break;
            }
        } while (subOpcion != 3);
        scanner.close();
    }
    public static void conversiones() {
        Scanner scanner = new Scanner(System.in);
        int subOpcion;
        Conversion conversion = new Conversion();
        do {
            System.out.println("\n=== Conversiones ===");
            System.out.println("1. Decimal a Binario-Octal-Hexadecimal");
            System.out.println("2. Binario-Octal-Hexadecimal a Decimal");
            System.out.println("3. Volver al Menú Principal");

            System.out.print("Seleccione una opción: ");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.println("Ingrese la base del sistema al que se desea convertir: ");
                    int base = scanner.nextInt();
                    System.out.println("Ingrese el decimal a convertir: ");
                    int decimal = scanner.nextInt();
                    if (base == 2 || base == 8 || base == 16) {
                        System.out.println("El paso a paso es: ");
                        String conver = conversion.conversion(decimal, base);
                        System.out.println("El resultado es el siguiente: " + "\n" + conver);
                    }else{
                    System.out.println("¡La base no existe!");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la base del numero a ingresar: ");
                    int base2 = scanner.nextInt();
                    System.out.println("Ingrese el numero a convertir: ");
                    String num = scanner.next();
                    if (base2 == 2 || base2 == 8 || base2 == 16) {
                        System.out.println("El paso a paso es: ");
                        int inver = conversion.inversa(num, base2);
                        System.out.println("El resultado es el siguiente: " + "\n" + inver);
                    }else{
                        System.out.println("¡La base no existe!");
                    }
                    break;
                case 3:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Subopción no válida. Por favor, seleccione una subopción válida.");
                    break;
            }
        } while (subOpcion != 3);

        scanner.close();
    }
}



