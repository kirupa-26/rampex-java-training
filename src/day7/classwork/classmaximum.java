package day7.classwork;

public class classmaximum {

        public static void main(String args[]){
            int [] num={1,2,3,4,5};
            int max=0;

            for(int i=0;i<num.length;i++){

                if(num[i]>max){

                    max=num[i];

                }
            }
            System.out.println("Maximum value is:" +max);

        }
    }


