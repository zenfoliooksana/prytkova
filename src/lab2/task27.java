package lab2;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x= s.nextDouble();
        double result;
        result = Math.sqrt(1-Math.pow(Math.sin(x*Math.PI/180),2));
        System.out.printf("%.4f", result);
    }
}
