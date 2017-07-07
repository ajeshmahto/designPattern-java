package behavioral.strategy.improved;


import behavioral.strategy.Difficulty;

public class Chess {

    private ChessAlgorithm algorithm = new EasyChessAlgorithm();

    public int calculateNextStep(){
        return algorithm.calculateNextStep();
    }

    public void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
