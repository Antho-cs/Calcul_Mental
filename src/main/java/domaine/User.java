package domaine;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        try {
            this.login = Objects.requireNonNull(login);
            this.password = Objects.requireNonNull(password);
        }
        catch (NullPointerException e) {
            throw new ClientException("Le login et le mot de passe ne peuvent pas être vides");
        }
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }
}
