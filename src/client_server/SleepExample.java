package client_server;

public class SleepExample extends Thread {
    String myId;
    public SleepExample(String id) {
        myId = id;
    }
    public void run() { // overwrite Thread's run()
        for (int i=0; i < 500; i++) {
            System.out.println(myId+" Thread");
            try {
                sleep(100);
            } catch (InterruptedException e) {}
        }
    }
    public static void main(String[] argv) {
        Thread t1 = new SleepExample("T1"); // ����Thread����
        Thread t2 = new SleepExample("T2"); // ����Thread����
        t1.start(); // �}�l����t1.run()
        t2.start();
    }
}