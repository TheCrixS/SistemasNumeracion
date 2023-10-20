package operaciones;
public class Conversion {
    public String conversion(int decimal, int base) {
        if (base == 2 || base == 8 || base == 10 || base == 16) {
            if (decimal == 0) {
                return "0";
            }
            if (base == 16){
                StringBuilder conver = new StringBuilder();
                char[] baseHexadecimal = "0123456789ABCDEF".toCharArray();
                int cont = decimal;
                while (cont > 0) {
                    int residuo = cont % base;
                    conver.insert(0, baseHexadecimal[residuo]);
                    cont /= base;
                    System.out.println(decimal + " / " + base + " = " + cont + ", Residuo = " + residuo);
                }
                    return conver.toString();
            } else {
                StringBuilder conver = new StringBuilder();
                int cont = decimal;
                while (cont > 0) {
                    int residuo = cont % base;
                    conver.insert(0, residuo);
                    cont /= base;
                    System.out.println(decimal + " / " + base + " = " + cont + ", Residuo = " + residuo);
                }
                return conver.toString();
            }
        }else{
            return "No existe esa base";
        }
    }
    public int inversa(String valor,int base) {
        int decimal = 0;
        for (int i = 0; i < valor.length(); i++) {
            char digito = valor.charAt(valor.length()-1-i);
            int valorDigito;
            if (digito >= '0' && digito <= '9') {
                valorDigito = digito - '0';
            } else if (digito >= 'A' && digito <= 'F') {
                valorDigito = digito - 'A' + 10;
            } else if (digito >= 'a' && digito <= 'f') {
                valorDigito = digito - 'a' + 10;
            } else {
                throw new IllegalArgumentException("Número no válido");
            }
            if (valorDigito >= base) {
                throw new IllegalArgumentException("Número no válido para la base proporcionada");
            }
            int operacion = (int)Math.pow(base,i)*valorDigito;
            decimal += operacion;
            System.out.println(digito + " * " + base + "^" + i + " = " + operacion);
        }
        return decimal;
    }
}
