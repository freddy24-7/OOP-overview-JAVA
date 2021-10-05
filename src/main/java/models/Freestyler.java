package models;

public class Freestyler extends Ballsporter implements PlayerFeatures{

    private String skill_level;

    public Freestyler(int age, int weight, int height, String firstname, String surname, boolean professional) {
        super(age, weight, height, firstname, surname, professional);
    }

    public String getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(String skill_level) {
        this.skill_level = skill_level;
    }

    //overrides from player features interface
    @Override
    public void personalMotto() {
        System.out.println("It is all about the fun of handling the ball");
    }

    //Overrides from "Ballsporter"
    @Override
    public String toString() {
        return "I am a freestyler. My name is " + getFirstname() + " " + getSurname() +
                ". I have skill level " + skill_level + ".";
    }
}
