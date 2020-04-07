package observerexercise;

public class Customer extends Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    protected void update(String message) {
        System.out.println(this.name + " " + message);
    }

    public String getName() {
        return name;
    }

    public void joinEshop(Eshop es) {
        super.es = es;
        es.add(this);
    }

    public void leaveEshop() {
        this.es = null;
    }
    
    public void setEshop(Eshop es) {
        super.es = es;
    }

    public void setName(String name) {
        this.name = name;
    }

}
