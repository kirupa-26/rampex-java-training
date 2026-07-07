package day12.hometask;

public class Car {


        void start() {
            System.out.println("Car Started");
        }
    }

    class SportsCar extends Car {

        void start() {
            System.out.println("Sports Car Started");
        }
    }

    class MethodOverriding {

        public static void main(String[] args) {

            SportsCar car = new SportsCar();

            car.start();
        }
    }


