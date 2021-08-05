package b23user;

public class Car {
    int year;
    String make;
    String model;

    static{
        System.out.println("This will run only once");
    }
    static{
        System.out.println("This is another block run only once");
    }
}
