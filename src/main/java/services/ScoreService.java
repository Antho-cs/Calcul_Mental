package services;

import domaine.Score;
import infrastructure.mysql.StockageScoreMySQL;

import java.util.List;

public class ScoreService {
    private StockageScoreMySQL stockageScoreMySQL;

    public ScoreService(StockageScoreMySQL stockageScoreMySQL) {
        this.stockageScoreMySQL = stockageScoreMySQL;
    }
    public List<Score> recupererDixMeilleursScores() {
        return stockageScoreMySQL.recupererDixMeilleursScores();
    }
}
