package relations.heritage;

/* Heritage is the relation between classes which one of the classes is named
    of subclass (child is an extension, a subtype, of another class, called
    superclass (parent). The subclass can reuse the attributes and methods
    of the superclass. */

/* Types of Heritage: Simple (the subclass have only one superclass) and
    Multiple (can have one or more superclasses) - NOT AVAILABLE IN JAVA
    AND C#. */

/* Upcast and Downcast: Upcast happens when you put a subclass into a
    parent class, and the other way around works for Downcast. EXAMPLE:
    SuperClass "Employee" being transformed into "Manager", "Seller" and
    "Cleaner" (Downcast), "Manager", "Seller" and "Cleaner" being transformed
    in "Employee" (Upcast).

    UPCAST: "Employee employee1 = new Manager();" - Transforming Manager onto Employee. (Implicit).
    DOWNCAST: "Seller employee2 = (Seller) new Employee();" - Transforming the super onto child. (Explicit).
*/

/* Polymorphism and Overwriting: Polymorphism is the same action of a
    parent class working in a different way in the sublasses. Overwriting
    is the possibility of the action of a parent class working in a different
    way in the subclasses. */

public class Heritage {
}
