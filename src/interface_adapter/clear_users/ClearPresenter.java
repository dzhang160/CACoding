package interface_adapter.clear_users;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel1) {
        this.clearViewModel = clearViewModel1;
    }
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        ClearState state = this.clearViewModel.getState();
        if (clearOutputData.getUsers().isEmpty()) {state.setMessage("No users to be cleared!");}
        else {state.setMessage("Users:\n" + clearOutputData.getUsers() + "were cleared successfully.");}
    }
}