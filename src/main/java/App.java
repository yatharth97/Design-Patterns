import adapter.example.*;
import decoratorPattern.coffee.orderSystem.Beverage;
import decoratorPattern.coffee.orderSystem.DarkRoast;
import decoratorPattern.coffee.orderSystem.Mocha;
import decoratorPattern.coffee.orderSystem.Whip;
import factory.method.pizza.ChicagoStore;
import factory.method.pizza.NYStore;
import factory.method.pizza.PizzaStore;
import observer.example.*;
import strategyPattern.camera.BasicCameraApp;
import strategyPattern.camera.CameraPlusApp;
import strategyPattern.camera.PhoneCameraApp;

public class App {
    public static void main(String[] args) {

//--------------- Adapter Pattern
/*
        Duck mallard = new MallardDuck();
        testDuck(mallard);

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
 */

//----------strategy pattern
/*
        PhoneCameraApp cameraApp1 = new CameraPlusApp();
        cameraApp1.edit();
        cameraApp1.share();
        PhoneCameraApp cameraApp2 = new BasicCameraApp();
        cameraApp2.edit();
        cameraApp2.share();
*/
//----------- decorator pattern
/*
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
*/
//---------- factory method pattern
/*
        PizzaStore store1 = new ChicagoStore();
        store1.orderPizza("cheese");
        PizzaStore store2 = new NYStore();
        store2.orderPizza("veggie");
*/
//----------- observer pattern

        Subject<Integer> subject = new SimpleSubject();
        AbstractObserver<Integer> observer = new SimpleObserver(subject);
        System.out.println("Before value update:");
        observer.display();
        System.out.println("Value getting updated through subject:");
        subject.setValue(Integer.valueOf(20));
        System.out.println("Display method in observer");
        observer.display();
        System.out.println("Value getting updated after removal of observer:");
        subject.removeObserver(observer);
        subject.setValue(Integer.valueOf(30));
        System.out.println("Display method in observer");
        observer.display();

    }

    static void testDuck(Duck duck) {
        duck.quack(); duck.fly();
    }
}
