package cn.springboot.text.test;

public class TestSync implements Runnable {
    private int balance;
    public void run(){
        for(int i  = 0;i < 20;i++){
            increment();
            System.out.println("balance is" + balance);
        }
    }
    public synchronized void increment(){
        int i = balance;
        balance = i +1;
    }
    public static void main ( String[] args) throws Exception{
        TestSync testSync = new TestSync();
        Thread a = new Thread(testSync);
        Thread b = new Thread(testSync);
        a.start();

        b.start();
        b.sleep(2000);
    }
}
