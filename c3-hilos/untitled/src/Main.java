import hilos.*;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.lang.String.join;

public class Main {
    public static void main (String [] args) throws InterruptedException{

        //Practica
        HilosPractica miHilo = new HilosPractica();
        miHilo.start();
        System.out.println("gygv");
        //
        HilosRunnable hilo = new HilosRunnable();
        hilo.run();
        System.out.println("Finishhh");
        //
        HilosSleep hilo3 = new HilosSleep();
        hilo3.start();
        //
        HilosJoin1 obj = new HilosJoin1();
        Thread t = new Thread(obj);
        t.start();
        //
        new HilosJoin2().doSometing();
        //Ejemplos
        new HilosA("Cristhian").start();
        new HilosA("Correa").start();
        System.out.println("Termina thread main");
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            System.out.println("Thread execution - " + Thread.currentThread().getName());
            return "Cristhian" ;
        });

        String resultValue = completableFuture.join();

        System.out.println("Result - " + resultValue);
    }

    static void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
