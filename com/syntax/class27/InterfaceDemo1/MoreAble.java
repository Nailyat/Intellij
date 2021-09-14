package com.syntax.class27.InterfaceDemo1;

public interface MoreAble {
    void move();
}
interface ControlAble{
    void control();
}
interface SellAble{
    void sell();
}
interface AnotherInterface{
    void sell();
}

interface Car extends MoreAble, ControlAble, SellAble{
}
class Toyota implements SellAble, AnotherInterface{

    @Override
    public void sell() {

    }
}