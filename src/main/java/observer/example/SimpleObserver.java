package observer.example;

public class SimpleObserver extends AbstractObserver<Integer> {
    private int value;
    private Subject<Integer> simpleSubject;
    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: "+ value);
    }

    public SimpleObserver(Subject<Integer> simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }
}
