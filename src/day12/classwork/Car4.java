package day12.classwork;

public class Car4 {


        Car4() {
            System.out.println("Car Constructor");
        }
    }

    class SportsCar4 extends Car4 {

        SportsCar4() {
            System.out.println("SportsCar Constructor");
        }
    }

    class ConstructorOrder {

        public static void main(String[] args) {

            SportsCar4 car = new SportsCar4();
        }
    }

