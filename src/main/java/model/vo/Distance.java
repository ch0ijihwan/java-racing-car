package model.vo;

public class Distance {
    private static final int NOT_MOVE = 0;
    private int movingRecord;

    public Distance() {
        this.movingRecord = NOT_MOVE;
    }

    public int value() {
        return movingRecord;
    }

    public void update(int movement) {
        movingRecord = movingRecord + movement;
    }
}
