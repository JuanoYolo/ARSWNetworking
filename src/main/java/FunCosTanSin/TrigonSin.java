package FunCosTanSin;

public class TrigonSin {

    public TrigonSin(String inputLine) {
    }

    public Double Calcular(String inputLine) {

        double numc = Double.parseDouble(inputLine);
        System.out.println("Entro");
        double resultc = Math.sin(numc);
        //System.out.println(resultc);
        return resultc;

    }
}
