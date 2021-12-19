package com;
public class Kid extends object{
    public Kid(){
        super("Малыш");
        Join(getName());
    }
    public void pickup(){
        System.out.println(getName() + " успел ответить ");
    }
    public void reckless(){
        System.out.println(getName() + "Малыш совсем вышел из себя");
    }
}
