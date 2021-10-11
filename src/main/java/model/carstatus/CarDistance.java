package model.carstatus;

public class CarDistance {
    private int distance = 0;
    public int value() {
        return distance;
    }

    public void update(int movement) {
        distance = distance + movement;
    }
}
