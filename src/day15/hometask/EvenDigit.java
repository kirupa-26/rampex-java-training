package day15.hometask;

public class EvenDigit {

        public static void main(String[] args) {

            int[] nums = {12,345,2,6,7896};

            int count = 0;

            for (int n : nums) {
                if (String.valueOf(n).length() % 2 == 0)
                    count++;
            }

            System.out.println(count);
        }
    }






