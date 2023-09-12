package operaciones;

public class Conversion {
    int base;
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public String conversion(int decimal, int base){
        if (decimal == 0){
            return "0";
        }else {
            StringBuilder conver = new StringBuilder();
            int cont = decimal;
            while (cont > 0){
                int residuo = cont % base;
                conver.insert(0,residuo);
                cont /= base;
                System.out.println(decimal+" / "+"base = "+cont+", Residuo = "+residuo);
            }
            return conver.toString();
        }
    }
}
