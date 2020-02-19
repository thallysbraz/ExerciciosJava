package util;

public class CurrentyValue {

    public static final double IOF = 0.06;

    public static double valor(double dolar, double real) {
        return (dolar * real) + dolar * real * IOF;
    }

}
