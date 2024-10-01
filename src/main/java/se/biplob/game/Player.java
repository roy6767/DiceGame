package se.biplob.game;

public class Player {
    private final String name;
    private int score=0;
    private int won=0;

    //Constructor to take name input
    Player(String name)
    {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public int getWon() {
        return won;
    }
    void increase(){
        this.won++;
    }
}
