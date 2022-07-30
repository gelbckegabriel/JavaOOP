package basicStructure;

/* Class is a structure that abstracts a set of objects as similar features.
    A claas defines the behaviour of it´s own object by their attributes. */

/* Attributes is an element of a class that is responsible for defining your
    data structure. The set of these is responsible to represent their features
    and it will be a part of the objects created. */

/* Method is a portion of code (subroutine) which is provided by the class.
    It´s executed when asked and it makes a certain behaviour. */

/* An object is the representation of a concept/entity of the real world, that
    can be physical (ball, car, tree...) or a concept (trip, purchase, stock...)
    and it has a well defined meaning to a software. For these, it should be defined
    initially in a class, which can be later instantiated as distinct objects. */

/* Message is the process of activation of a method from an object. This occurs
    when a requisition (call) to this method has been made, triggering the execution
    of it´s behaviour described by it´s class. */

public class Car {

        String color;
        String model;
        double tankCapacity = 71;
        double gasAvailable = 40;
        double gasValue = 5.50;
        double valueToPay = 0;

        Car() {

        }

        Car(String color, String model, double tankCapacity) {
            this.color = color;
            this.model = model;
            this.tankCapacity = tankCapacity;
        }

            // color
        public void setColor(String color) { // DEFINE / PUT THE COLOR OF THE CAR (SET).
            this.color = color;
        }

        public String getColor() { // RETURN THE COLOR OF THE CAR (GET).
            return color;
        }

            // model
        public void setModel(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }

            // tank capacity
        public void setTankCapacity(double tankCapacity) {
            this.tankCapacity = tankCapacity;
        }

        public double getTankCapacity() {
            return tankCapacity;
        }

        double totalValueTank(double gasValue) {
            return tankCapacity * gasValue;
        }

        /*static void fillTank (double gasValue) { // DIDN´T WORK FOR NOW.
            if (gasAvailable < tankCapacity) {
                double difference = tankCapacity - gasAvailable;
                double valueToPay = difference * gasValue;

                System.out.println("You will fill " + difference + " liters. Must pay U$" + valueToPay + " !");
                gasAvailable = gasAvailable + difference;
            }
        }*/

}


