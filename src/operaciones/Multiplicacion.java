package operaciones;

public class Multiplicacion {
    Conversion conver = new Conversion();
    public String multiplicacionTodos(String operador1, String operador2, int base) {
        int suma = 0;
        if (base != 10) {
            System.out.println("Conversion del primer numero");
            int op1 = conver.inversa(operador1, base);
            System.out.println("Conversion del segundo numero");
            int op2 = conver.inversa(operador2, base);
            suma = op1 * op2;
        } else {
            System.out.println("¡Base no compatible!");
        }
        System.out.println("Conversion del resultado");
        String resultado = conver.conversion(suma,base);
        return resultado;
    }
}
