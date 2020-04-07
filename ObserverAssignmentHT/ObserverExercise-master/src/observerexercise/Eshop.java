package observerexercise;

import java.util.ArrayList;
import java.util.List;

public class Eshop {

    private List<Observer> customers;
    private String name;

    public Eshop(String name) {
        this.customers = new ArrayList();
        this.name = name;
    }

    public List<Observer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Observer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        String message = "The eshop name is " + this.name;
        notifyAllCustomers(message);
    }

    public void add(Customer customer) {
        customers.add(customer);
        String successMessage = customer.getName() + " you are now registered " + name;
        notifyCustomer(customer, successMessage);
    }

    public void newRawFruitUpcoming(Fruit fruit) {
        notifyAllCustomers(fruit.getName() + " will be available at our shop soon.");
    }

    public void fruitIsAvailable(Fruit fruit) {
        notifyAllCustomers(fruit.getName() + " is now available.");
    }

    public void outOfStock(Fruit fruit) {
        notifyAllCustomers(fruit.getName() + " is curently out of stock");
    }

    public void increasePriceSoon(Fruit fruit) {
        notifyAllCustomers(fruit.getName() + " will have increased price");
    }

    public void increasePrice(Fruit fruit) {
        notifyAllCustomers( fruit.getName() + "Price has increased");
    }

    void remove(Customer customer) {
        customers.remove(customer);
        String successMessage = customer.getName() + " you are now unsubscribed " + name;
        notifyCustomer(customer, successMessage);
    }

    public void printEshopCustomers() {
        System.out.println("Printing Customers" + name);
        for (Observer c : customers) {
            Customer customer = (Customer) c;
            System.out.println(customer.getName());
        }
    }

    public void notifyAllCustomers(String message) {
        for (Observer observer : customers) {
            observer.update(message);
        }
    }

    public void notifyCustomer(Observer observer, String message) {
        observer.update(message);
    }
}
