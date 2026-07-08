package day15.hometask;

public class TrailngZeroes {

        public static void main(String[] args) {

            int[] nums = {1,2,3,4};

            int even = 0;

            for (int n : nums)
                if (n % 2 == 0)
                    even++;

            System.out.println(even >= 2);
        }
    }



