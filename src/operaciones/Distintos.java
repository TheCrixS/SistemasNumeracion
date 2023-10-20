package operaciones;

public class Distintos {
    Conversion conver = new Conversion();
    public String multiplicacionDistintos(String operador1, String operador2, int base) {
        int suma = 0;
        if (base != 10) {
            int op1 = conver.inversa(operador1, base);
            int op2 = conver.inversa(operador2, base);
            suma = op1 * op2;
        } else {
            System.out.println("¡Base no compatible!");
        }
        String resultado = conver.conversion(suma,base);
        return resultado;
    }
    
}
