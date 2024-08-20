package org.example;

public class Desktop  implements  Computer{
    public  Desktop(){
        System.out.println("Desktop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compiling in Desktop");

    }
//    public void compile (){
//        System.out.println("Compiling in Desktop");
//
//    }
}
