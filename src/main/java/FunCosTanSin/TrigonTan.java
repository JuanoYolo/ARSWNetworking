package FunCosTanSin;

public class TrigonTan {

    public TrigonTan(String inputLine) {
    }

    public Double Calcular(String inputLine) {

        double numc = Double.parseDouble(inputLine);
        System.out.println("Entro");
        double resultc = Math.cos(numc);
        //System.out.println(resultc);
        return resultc;

    }
}
