package use_case.clear_users;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearPresenter) {
        this.userDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    public void execute() {
        String users = this.userDataAccessObject.clearAllUsers();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        this.clearPresenter.prepareSuccessView(clearOutputData);
    }
}
