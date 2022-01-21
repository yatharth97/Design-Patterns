package factory.abstractFactory.userRole;

public class Forecaster extends UserRole{

    @Override
    View createView() {
        return new ForecasterView();
    }

    @Override
    Functions createFunctions() {
        return new ForecasterFunctions();
    }
}
