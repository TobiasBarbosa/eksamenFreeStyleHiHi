package Car;

public class Main {

    public static void main(String[] args) {

        Trailer trailer1 = new Trailer(500);
        Car car1 = new Car("Mercedes", 3000, trailer1);
        Car car2 = new Car("BMW", 2000);


        System.out.println(car1);
        System.out.println(car2);
    }
}
