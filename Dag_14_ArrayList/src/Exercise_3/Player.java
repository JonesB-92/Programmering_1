package Exercise_3;

import java.sql.SQLOutput;

public class Player {
    private String name;
    private int age;
    private int score;

    // b) Add to the Player class:
    // a constructor that initializes name and age from parameters and sets score to 0,
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
        score = 0;
    }

    // a toString() method that prints “Player(Ib, age=22, score=30)” for a player named Ib, get and set methods for score,
    @Override
    public String toString() {
        return "Player(" + this.name + ", age= " + this.age + ", score= " + this.score + ")";
    }

    //Getter on score
    public int getScore() {
        return score;
    }

    //Setter on score
    public void setScore(int score) {
        this.score = score;
    }

    //Getter on age
    public double getAge() {
        return age;
    }

    //Getter on name
    public String getName() {
        return name;
    }
}
