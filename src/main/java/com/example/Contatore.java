package com.example;

public class Contatore extends Thread{
    int cont;
    public Contatore(int cont){
        this.cont = cont;
    }
    public void run(){
        for(int i = 0; i <= cont; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
