package com.bridgelabz;

public class Main {
    //Welcome to employee wage program
    public static void main(String[] args) {

        int empPresent = (int) (Math.floor(Math.random() * 10) % 2);
        if(empPresent ==0)
            System.out.println("Employee is absent");
        else
            System.out.println("Employee is present");
    }
}

