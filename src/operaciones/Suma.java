package operaciones;

public class Suma {
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
}
