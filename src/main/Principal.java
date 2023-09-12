package main;

import operaciones.Conversion;
import operaciones.Suma;

import java.util.Scanner;

public class Principal {
    public static void main1(String[] args) {
        Suma sum = new Suma();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el operador 1: ");
        int oper1 = sc.nextInt();
        System.out.println("Ingrese el operador 2: ");
        int oper2 =sc.nextInt();
        if (base == 10 || base == 10){
            int s = sum.sumaDecimales(oper1,oper2);
            System.out.println("Base: "+base+"\nNumero 1: "+oper1+"\nNumero 2: "+oper2+"\nResultado: "+s);
        } else if (base == 2) {
            String o1 = String.valueOf(oper1);
            String o2 = String.valueOf(oper2);
            String s = sum.sumaBinarios(o1,o2);
            System.out.println("Base: "+base+"\nNumero 1: "+oper1+"\nNumero 2: "+oper2+"\nResultado: "+s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversion conversion = new Conversion();
        System.out.println("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el operador 1: ");
        int oper1 = sc.nextInt();
        System.out.println(conversion.conversion(oper1,base));
    }
}
