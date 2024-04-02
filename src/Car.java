class Car {
    public void driveCar(){
        System.out.println("Car is driving!");
    }
}
class Benz extends Car{
    public void driveBenz(){
        System.out.println("Benz is driving!");
    }
}
class Audi extends Car{
    public void driveAudi(){
        System.out.println("Audi is driving!");
    }
}
class BMW extends Car{
    public void driveBMW(){
        System.out.println("BMW is driving!");
    }
}
class Test2{
    public static void main(String[] args) {
        Benz be=new Benz();
        be.driveCar();
        be.driveBenz();
        Audi a=new Audi();
        a.driveAudi();
        BMW b=new BMW();
        b.driveBMW();
    }
}
