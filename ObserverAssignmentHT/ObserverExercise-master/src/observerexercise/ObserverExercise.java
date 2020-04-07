package observerexercise;

public class ObserverExercise {

    public static void main(String[] args) {
        Eshop eshop = new Eshop("Manaviko");
        
        Customer customer1 = new Customer("Lewis");
        Customer customer2 = new Customer("Nick");
        Customer customer3 = new Customer("George");
      
        Fruit fruit = new Fruit("Pineapple");
        
        customer1.joinEshop(eshop);
        customer2.joinEshop(eshop);
        customer3.joinEshop(eshop);
        
//
        eshop.newRawFruitUpcoming(fruit);
        eshop.fruitIsAvailable(fruit);
        eshop.increasePriceSoon(fruit);
        eshop.increasePrice(fruit);
        eshop.outOfStock(fruit);
    }

}
