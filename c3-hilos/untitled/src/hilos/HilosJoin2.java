package hilos;

public class HilosJoin2 extends Thread{
    private int x =3;
    public HilosJoin2(){
        x=4;
        start();
    }
    public void doSometing() throws InterruptedException{
        join();
        x = x-1;
        System.out.println(x);
    }
    public void run(){
        x=x*3;
    }
}
