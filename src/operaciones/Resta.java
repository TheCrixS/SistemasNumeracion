package operaciones;

public class Resta {
    Conversion conver = new Conversion();
    public String restaTodos(String operador1, String operador2, int base) {
        int resta = 0;
        if (base != 10) {
            System.out.println("Conversion del primer numero");
            int op1 = conver.inversa(operador1, base);
            System.out.println("Conversion del segundo numero");
            int op2 = conver.inversa(operador2, base);
            resta = op1 - op2;
        } else {
            System.out.println("¡Base no compatible!");
        }
        System.out.println("Conversion del resultado");
        String resultado = conver.conversion(resta,base);
        return resultado;
    }
}
