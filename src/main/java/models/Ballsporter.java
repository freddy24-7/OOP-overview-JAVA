package models;

public abstract class Ballsporter {

    private int age;
    private int weight;
    private int height;
    private String firstname;
    private String surname;
    private boolean professional;

    public Ballsporter(int age, int weight, int height, String firstname, String surname, boolean professional) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.firstname = firstname;
        this.surname = surname;
        this.professional = professional;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    //Below method will be overridden in the Footballer and Freestyler classes
    @Override
    public String toString() {
        return "Ballsporter{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", professional=" + professional +
                '}';
    }

}
