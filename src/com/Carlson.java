package com;
public class Carlson extends object{
    public Carlson(){
        super("Карлсон");
        Join(getName());
    }
    public void exultingraisedhand (String val){
        System.out.println(getName() +" ликуя, поднял руку с " + val+ "истолетом над головой и выстрелил");
    }
    public void chewed(){
        System.out.println(getName()+ "сидел с невозмутимым видом и жевал булочку");
    }
}
