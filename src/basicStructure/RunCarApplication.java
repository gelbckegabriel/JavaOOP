package basicStructure;

public class RunCarApplication {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setColor("Portimao Blue");
        car1.setModel("BMW 330I - 2022");
        car1.setTankCapacity(71);

        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getTankCapacity());
        System.out.println(car1.totalValueTank(car1.gasValue));

        System.out.println("----------------------------------------------------------------------------");

        Car car2 = new Car("Grey", "Ford Mustang GT - Shelby", 66);

        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getTankCapacity());
        System.out.println(car2.totalValueTank(car2.gasValue));

    }

}
