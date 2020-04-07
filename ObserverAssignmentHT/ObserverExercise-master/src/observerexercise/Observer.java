package observerexercise;

public abstract class Observer {
    protected Eshop es;
    protected abstract void update(String message);
}
