public class Main {
    public static void main(String[] args) {
        Moped slowRide=new Moped("Red",1,5,5);
        System.out.println("color:"+slowRide.getColor());

        Car myCar=new Car("Red",4,10,5);
        System.out.println("fuel capacity:"+myCar.getFuelCapacity());

        SemiTruck bigTruck=new SemiTruck("Black",2,4,5);
        System.out.println("Color:"+bigTruck.getColor());

        Hovercraft flyer=new Hovercraft("silver",2,5,5);
        flyer.setColor(" silver");
        System.out.println("Color:"+flyer.getColor());
    }
}
