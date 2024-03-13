package com.company;

public class Main {

    public static void main(String[] args) {
	    // Паттерн, отвечает за выстраивание порядка выполнения кода
        // запускает по определенной очереди

        Template template = new job();
        template.run();
    }
}

// порядок очереди необходимо указать в абстрактом классе

abstract class Template{
    abstract void stepOne();
    abstract void stepTwo();
    abstract void stepThree();

    void run(){
        stepOne();
        stepTwo();
        stepThree();
    }
}

class job extends Template{
    @Override
    void stepOne() {
        System.out.println("шаг 1");
    }

    @Override
    void stepTwo() {
        System.out.println("шаг 2");
    }

    @Override
    void stepThree() {
        System.out.println("шаг 3");
    }
}