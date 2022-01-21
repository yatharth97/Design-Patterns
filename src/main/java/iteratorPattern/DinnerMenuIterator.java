package iteratorPattern;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;
    public DinnerMenuIterator(MenuItem[] list) {
        this.list = list;
    }
    @Override
    public MenuItem next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
