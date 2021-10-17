package controller;

import models.Footballer;
import models.Freestyler;

public class Main {

    public static void main(String[] args) {

        Footballer firstFootballPlayer = new Footballer(36, 70, 192, "", "", true);

        firstFootballPlayer.setFirstname("Chrisiano");
        firstFootballPlayer.setSurname("Ronaldo");
        firstFootballPlayer.setPosition("forward");
        firstFootballPlayer.setTeam("Manchester United");

        firstFootballPlayer.setAge(37);
//        System.out.println(christiano.getAge());
        firstFootballPlayer.personalMotto();
        System.out.println(firstFootballPlayer.toString());
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
