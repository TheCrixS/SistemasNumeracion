package main;
import operaciones.Conversion;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Suma;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Conversion");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    sumas(scanner);
                    break;
                case 2:
                    restas(scanner);
                    break;
                case 3:
                    multiplicaciones(scanner);
                    break;
                case 4:
                    conversiones(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
    public static void sumas(Scanner scanner) {
        int subOpcion;
        Suma suma = new Suma();
        do {
            System.out.println("\n=== Sumas ===");
            System.out.println("1. Decimales");
            System.out.println("2. Binarios");
            System.out.println("3. Octales");
            System.out.println("4. Hexadecimales");
            System.out.println("5. Volver al Menú Principal");
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
                    String sumBin = suma.sumaTodos(bin1,bin2,2);
                    System.out.println("La suma de los numeros binarios ("+bin1+", "+bin2+") es: "+sumBin);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    String oct1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String oct2 = scanner.next();
                    String sumOct = suma.sumaTodos(oct1,oct2,8);
                    System.out.println("La suma de los numeros octales ("+oct1+", "+oct2+") es: "+sumOct);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    String hex1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String hex2 = scanner.next();
                    String sumHex = suma.sumaTodos(hex1,hex2,16);
                    System.out.println("La suma de los numeros hexadecimales ("+hex1+", "+hex2+") es: "+sumHex);
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    return;
                default:
                    System.out.println("Subopción no válida. Por favor, seleccione una subopción válida.");
                    break;
            }
        } while (subOpcion != 5);
        scanner.close();
    }
    public static void conversiones(Scanner scanner) {
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
                    return;
                default:
                    System.out.println("Subopción no válida. Por favor, seleccione una subopción válida.");
                    break;
            }
        } while (subOpcion != 3);

        scanner.close();
    }
    public static void restas(Scanner scanner) {
        int subOpcion;
        Resta resta = new Resta();
        do {
            System.out.println("\n=== Restas ===");
            System.out.println("1. Decimales");
            System.out.println("2. Binarios");
            System.out.println("3. Octales");
            System.out.println("4. Hexadecimales");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    String op1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String op2 = scanner.next();
                    String res = resta.restaTodos(op1,op2,10);
                    System.out.println("La resta de los numeros decimales ("+op1+", "+op2+") es: "+res);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    String bin1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String bin2 = scanner.next();
                    String resBin = resta.restaTodos(bin1,bin2,2);
                    System.out.println("La resta de los numeros binarios ("+bin1+", "+bin2+") es: "+resBin);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    String oct1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String oct2 = scanner.next();
                    String resOct = resta.restaTodos(oct1,oct2,8);
                    System.out.println("La resta de los numeros octales ("+oct1+", "+oct2+") es: "+resOct);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    String hex1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String hex2 = scanner.next();
                    String resHex = resta.restaTodos(hex1,hex2,16);
                    System.out.println("La resta de los numeros hexadecimales ("+hex1+", "+hex2+") es: "+resHex);
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    return;
                default:
                    System.out.println("Subopción no válida. Por favor, seleccione una subopción válida.");
                    break;
            }
        } while (subOpcion != 5);
        scanner.close();
    }
    public static void multiplicaciones(Scanner scanner) {
        int subOpcion;
        Multiplicacion multiplicacion = new Multiplicacion();
        do {
            System.out.println("\n=== Multiplicaciones ===");
            System.out.println("1. Decimales");
            System.out.println("2. Binarios");
            System.out.println("3. Octales");
            System.out.println("4. Hexadecimales");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    String op1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String op2 = scanner.next();
                    String mul = multiplicacion.multiplicacionTodos(op1,op2,10);
                    System.out.println("La multiplicacion de los numeros decimales ("+op1+", "+op2+") es: "+mul);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    String bin1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String bin2 = scanner.next();
                    String mulBin = multiplicacion.multiplicacionTodos(bin1,bin2,2);
                    System.out.println("La multiplicacion de los numeros binarios ("+bin1+", "+bin2+") es: "+mulBin);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    String oct1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String oct2 = scanner.next();
                    String mulOct = multiplicacion.multiplicacionTodos(oct1,oct2,8);
                    System.out.println("La multiplicacion de los numeros octales ("+oct1+", "+oct2+") es: "+mulOct);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    String hex1 = scanner.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String hex2 = scanner.next();
                    String mulHex = multiplicacion.multiplicacionTodos(hex1,hex2,16);
                    System.out.println("La multiplicacion de los numeros hexadecimales ("+hex1+", "+hex2+") es: "+mulHex);
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    return;
                default:
                    System.out.println("Subopción no válida. Por favor, seleccione una subopción válida.");
                    break;
            }
        } while (subOpcion != 5);
        scanner.close();
    }
}



