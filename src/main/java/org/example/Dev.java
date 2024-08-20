
package org.example;

public class Dev {
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    private Computer com;
    private  int age;








    public void setAge(int age) {
        this.age = age;
    }


    public  Dev(){
      System.out.println("Dev Constructor");

    }


//    public  Dev(int age){
//       System.out.println("Dev1 Constructor");
//        this.age = age;
//    }



    public int getAge() {
        return age;
    }




    public void build(){


        System.out.println("Working on Awesome Project");
        com.compile();
    }
}
