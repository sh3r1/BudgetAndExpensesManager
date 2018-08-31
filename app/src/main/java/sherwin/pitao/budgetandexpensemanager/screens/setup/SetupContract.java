package sherwin.pitao.budgetandexpensemanager.screens.setup;

public interface SetupContract {

    interface presenter {

    }

    interface SetupView{
       void setNameError();

       void setCurrencyError();

       void navigateToMain();
    }
}
