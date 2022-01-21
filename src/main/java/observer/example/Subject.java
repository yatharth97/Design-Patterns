package observer.example;

public interface Subject<T> {
    public void registerObserver(Observer<T> o);
    public void removeObserver(Observer<T> o);
    public void notifyObservers();
    public void setValue(T value);
}
