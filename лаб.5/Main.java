import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        
        BiFunction<Integer, Integer, Double> power = (b, e) -> Math.pow(b, e);
        double result = power.apply(base, exponent);
        
        System.out.println(base + " в степени " + exponent + " равно " + result);
    }
}
