package P47;

public class Car extends Thread {
    private String name;

    public Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正常進行" + name + "的處理工作");

        }
    }
}
