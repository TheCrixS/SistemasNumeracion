package operaciones;

public class Suma {
    Conversion conver = new Conversion();
    public String sumaBinarios(String operador1, String operador2){
        int i = operador1.length() - 1;
        int j = operador2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += operador1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += operador2.charAt(j) - '0';
                j--;
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }
    public int sumaDecimales(int operador1, int operador2){
        int suma = operador1 + operador2;
        return suma;
    }
    public String sumaTodos(String operador1, String operador2, int base) {
        int suma = 0;
        if (base != 10) {
            int op1 = conver.inversa(operador1, base);
            int op2 = conver.inversa(operador2, base);
            suma = op1 + op2;
        } else {
            System.out.println("¡Base no compatible!");
        }
        String resultado = conver.conversion(suma,base);
        return resultado;
    }
    public String sumaDistintos(String operador1, String operador2, int base1, int base2) {
        int suma = 0;
        System.out.println("Conversion del primer numero");
        int op1 = conver.inversa(operador1,base1);
        System.out.println("Conversion del segundo numero");
        int op2 = conver.inversa(operador2, base2);
        suma = op1 + op2;
        System.out.println("Conversion del resultado");
        String resultado = conver.conversion(suma,10);
        return resultado;
    }
}
