package com.vvsk.fullstack.threads;

/** Demonstrate Java MultiThreading by creating the threads */
class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Hello, This is run method of Thread, Thread is in running state "+this);
    }
}
public class CreateThreadExample {

    public static void main(String args[]){

        MyThread thread1 = new MyThread("FirstThread");

        MyThread thread2 = new MyThread("SecondThread");

        MyThread thread3 = new MyThread("ThirdThread");

        thread1.start();

        thread2.start();

        thread3.start();

    }

}
