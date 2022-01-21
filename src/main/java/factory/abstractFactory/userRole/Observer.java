package factory.abstractFactory.userRole;

public class Observer extends UserRole {

    @Override
    View createView() {
        return new ObserverView();
    }

    @Override
    Functions createFunctions() {
        return new ObserverFunctions();
    }
}
