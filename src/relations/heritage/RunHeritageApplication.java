package relations.heritage;

public class RunHeritageApplication {

    public static void main (String[] args) {

        // created a variable straight from the class.
        Employee employee = new Employee();

        // examples of UpCasts (Implicit).
        Employee manager = new Manager();
        Employee seller = new Seller();
        Employee cleaner = new Cleaner();

        // example of DownCasts (Explicit) - DOWNCAST SHOULD BE AVOIDED.
        //Manager manager_ = new Employee(); //it will result in an error.
        Seller seller_ = (Seller) new Employee(); // you need to inform to who you want to downcast (Seller).
    }
}
