package com.company;

public class GameComputer extends Computer{


    @Override
    public void memory() {
        System.out.println("Putting High-clock speed memory");
    }

    @Override
    public void cpu() {
        System.out.println("Putting High-end multi-core cpu");
    }

    @Override
    public void storege() {
        System.out.println("Putting SSD storage");
    }

    @Override
    public void connect() {
        System.out.println("Connecting mouse,keyboard monitor");
    }
}
