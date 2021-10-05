package controller;

import models.Footballer;
import models.Freestyler;

public class Main {

    public static void main(String[] args) {

        Footballer christiano = new Footballer(36, 70, 192, "Christiano", "Ronaldo", true);

        christiano.setPosition("forward");
        christiano.setTeam("Manchester United");

        christiano.setAge(37);
//        System.out.println(christiano.getAge());
        christiano.personalMotto();
        System.out.println(christiano.toString());
//        System.out.println(christiano.isProfessional());
        System.out.println();

        Freestyler freestyler = new Freestyler(32, 67, 180, "", "", false);

        freestyler.setFirstname("Soufiane");
        freestyler.setSurname("Touzani");
        freestyler.setSkill_level("'very high'");


        freestyler.personalMotto();
        System.out.println(freestyler.toString());









    }
}
