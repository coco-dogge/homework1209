package P32;

import P30.Car;
import P30.CarException;

public class X {
    public static void main(String[] args)throws CarException {
        Car car1 = new Car();

        car1.setCar(1234,-10.0);


        car1.show();
    }
}
