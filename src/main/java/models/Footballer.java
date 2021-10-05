package models;

public class Footballer extends Ballsporter implements PlayerFeatures{

    private String team;
    private String position;

    public Footballer(int age, int weight, int height, String firstname, String surname, boolean professional) {
        super(age, weight, height, firstname, surname, professional);
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //Override from interface Playerfeatures
    @Override
    public void personalMotto() {
        System.out.println("I am the best. Greatest of all time!");
    }

    //Override from abstract class Ballsporter
    @Override
    public String toString() {
        return "I am a footballer. I play for " + team +
                ", and my position is " + position + ".";
    }
}
