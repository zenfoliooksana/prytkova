package lab5;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        if ("".equals(data)) {
            System.out.println("0");
            return;
        }
        double summ = 0;
        String[] s1 = data.split(" ");
        int[] a = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
            summ = summ + a[i];

        }
        double result = summ / (s1.length);
        //double result;
        //result = 11/5;
        System.out.printf("%.2f", result);

    }
}