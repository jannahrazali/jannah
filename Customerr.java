// Define a class named Customer to represent individuals.
class Customer {

    // Private instance variables to store the customer's name and age
    private String name;
    private int age;


    // Constructor to initialize the name and age when creating a Customer object.
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Method to display a greeting message including the customers's name and age.
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}


// A class that demonstrates the usage of the Customer class.
public class Customerr {
    public static void main(String[] args) {

        // Create instances of customer class with names and ages.
        Customer customer1 = new Customer("Alice", 25);
        Customer customer2 = new Customer("Bob", 30);



        // Call the sayHello method on the customer instances to display greetings.
        customer1.sayHello();
        customer2.sayHello();
    }
}
