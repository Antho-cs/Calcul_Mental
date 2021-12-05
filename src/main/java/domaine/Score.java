package domaine;

import java.util.Date;
import java.util.Objects;

public class Score {
    private int score;
    //private User user;
    private String login;
    private Date date;

//    public Score(int score, User user, Date date) {
//        if (score < 0 || score > 10) {
//            throw new IllegalArgumentException("Le score doit être compris entre 0 et 10");
//        }
//        this.score = score;
//        this.user = Objects.requireNonNull(user);
//        this.date = Objects.requireNonNull(date);
//    }

    public Score(int score, String login, Date date) {
        this.score = score;
        this.login = Objects.requireNonNull(login);
        this.date = Objects.requireNonNull(date);
    }

    public String getLogin() {
        return login;
    }

    public Date getDate() {
        return date;
    }

    public int getScore() {
        return score;
    }

//    public User getUser() {
//        return user;
//    }
}
