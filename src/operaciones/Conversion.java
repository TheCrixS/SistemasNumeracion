package operaciones;

public class Conversion {
    public String decimalesBinarios(int decimal){
        if (decimal == 0){
            return "0";
        }else {
            StringBuilder binario = new StringBuilder();
            int cont = decimal;
            while (cont > 0){
                int residuo = cont % 2;
                binario.insert(0,residuo);
                cont /= 2;
                System.out.println(decimal+" / 2 = "+cont+", Residuo = "+residuo);
            }
        }
        return "";
    }
    public String binariosDecimales(int binario){
        return "";
    }
    public String decimalOctal (int decimal){
        return "";
    }
    public String octalDecimal(int octal){
        return "";
    }
    public String decimalHexadecimal (int decimal){
        return "";
    }
    public String hexadecimalDecimal(int hdecimal){
        return "";
    }
}
