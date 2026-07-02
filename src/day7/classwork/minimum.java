package day7.classwork;

public class minimum {

    public static void main(String [] args) {
        int[] num = {100, 27, 35, 400, 599};
        int min = 10000;

        for (int i = 0; i < num.length; i++) {

            if (num[i] < min) {

                min = num[i];

            }
        }
        System.out.println("Minimum value is: " + min);
    }
}

