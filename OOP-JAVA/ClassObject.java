class Car {
    String color;
    String brand;
    int speed;
    
    void start() {
        System.out.println("Car started");
    }
    void accelerate() {
        speed += 10;
    }
}


public class ClassObject {
    public static void main(String[] args) {
        Car c1 = new Car();
        
        c1.color = "Red";
        c1.brand = "BMW";
        c1.speed = 0;
        c1.start();
        c1.accelerate();
        c1.accelerate();
        
        System.out.println(c1.color);
        System.out.println(c1.brand);
        System.out.println(c1.speed);

        //Object array implementation
        //Objects can stored in array
        System.out.println();
        Car[] car = new Car[3];
        car[0] = new Car();
        car[1] = new Car();
        
        car[0].color = "Blue";
        car[1].brand = "Supra";
        System.out.println(car[0].color);
        System.out.println(car[1].brand);
        System.out.println(car[1].color);
    }
}