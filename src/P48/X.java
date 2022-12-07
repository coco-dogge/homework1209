package P48;

import P47.Car;

public class X {
    public static void main(String[] args) {
        Car car1 = new Car("1號車");
        car1.start();

        for(int i=0;i<5;i++){
            try{
                car1.join();
            }catch (InterruptedException e){}
        }
        System.out.println("結束main()的處理工作");
    }
}

