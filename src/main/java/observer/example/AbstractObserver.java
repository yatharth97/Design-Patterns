package observer.example;

public abstract class AbstractObserver<T> implements Observer<T> {
    public abstract void display();
}
