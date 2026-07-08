package day15.hometask;

public class DigitGame {

        public static void main(String[] args) {

            int[] nums = {1,2,3,11,12};

            int single = 0, doubleDigit = 0;

            for (int n : nums) {
                if (n < 10)
                    single += n;
                else
                    doubleDigit += n;
            }

            System.out.println(single != doubleDigit);
        }
    }



