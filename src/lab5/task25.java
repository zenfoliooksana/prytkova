package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String [] arr = data.split(" ");
        Arrays.sort(arr);

        String t = arr[0];
        for (int j = 0; j != arr.length; j++) {

            if (t.equals(arr[j])) {

            } else {
                System.out.print(arr[j]+ " ");
                t = arr [j];
            }

        }

    }

}
