package iteratorPattern;

public class Cafe {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;
    public Cafe(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }
    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
        }
    }
}
