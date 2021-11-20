package infrastructure.services;

import domaine.User;

public class UserService {
    private StockageUserInterface stockageUser;

    public UserService(StockageUserInterface stockageUser) {
        this.stockageUser = stockageUser;
    }

    public Boolean authenticateUser(User user) {
        return stockageUser.authenticateUser(user);
    }
}
