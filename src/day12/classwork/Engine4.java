package day12.classwork;

public class Engine4 {


        Engine4() {
            System.out.println("Engine Ready");
        }
    }

    class MusicSystem {

        MusicSystem() {
            System.out.println("Music System Ready");
        }
    }

    class Car8 {

        Engine4 engine = new Engine4();
        MusicSystem music = new MusicSystem();

        Car8() {
            System.out.println("Car Ready");
        }
    }

    class carMusicSystem {

        private carMusicSystem() {
        }

        public static void main(String[] args) {

            Car8 car = new Car8();
        }

        static carMusicSystem createcarMusicSystem() {
            return new carMusicSystem();
        }
    }


