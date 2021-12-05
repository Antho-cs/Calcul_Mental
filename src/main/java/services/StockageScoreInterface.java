package services;

import domaine.Score;
import domaine.User;

import java.util.List;

public interface StockageScoreInterface {
    List<Score> recupererDixMeilleursScores();
}
