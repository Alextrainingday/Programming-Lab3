package com;

public class Voice extends object{
    public Voice(){
        super("голоса");
        Join(getName());
    }
    public void buzzed(String val){
        System.out.println("В соседних"+val+"домах загудели голоса"+ getName());
    }
}
