package com;
public class Someone extends object{
    public Someone(){
        super("кто-то ");
        Join(getName());
    }
    public void shouted(){
        System.out.println(getName() + " крикнул, что нужно вызвать полицию ");
    }
}
