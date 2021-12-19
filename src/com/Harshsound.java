package com;
public class Harshsound extends object{
    public Harshsound(){
        super("Резкий звук");
        Join(getName());
    }
    public void rolled(String val){
        System.out.println(getName()+" прокатился по "+val+"крышам и замер" );
    }
}
