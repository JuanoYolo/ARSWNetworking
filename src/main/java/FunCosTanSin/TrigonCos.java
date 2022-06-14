package FunCosTanSin;

public class TrigonCos {

    public TrigonCos(String inputLine) {
    }

    public Double Calcular(String inputLine) {

        double numc = Double.parseDouble(inputLine);
        System.out.println("Entro");
        double resultc = Math.cos(numc);
        //System.out.println(resultc);
        return resultc;

    }
}
