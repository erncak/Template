package com.company;

public class OfficeComputer extends Computer{
    @Override
    public void memory() {
        System.out.println("Putting Energy-efficient memory");
    }

    @Override
    public void cpu() {
        System.out.println("Putting Low-end dual-core cpu");
    }

    @Override
    public void storege() {
        System.out.println("Energy-efficient HDD");
    }

    @Override
    public void connect() {
        System.out.println("Connecting mouse,keyboard monitor");
    }
}
