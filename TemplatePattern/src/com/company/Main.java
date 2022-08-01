package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer=new GameComputer();
        computer.set();
        Computer officeComp=new OfficeComputer();
        officeComp.set();
    }
}
