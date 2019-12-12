package com.company;

import java.util.Scanner;

public class Game {
    public static Character manager;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы покупаете билет на самолёт. \n "
                + " (Введите ваше имя):");
        manager = new Character(in.next());
        story = new Story();
        while (true) {
            manager.health += story.current_situation.dhealth;
            manager.hunger += story.current_situation.dhunger;
            manager.karma += story.current_situation.dkarma;
            System.out.println("=====\nЗдоровье:" + manager.hunger + "\tГолод:"
                    + manager.health + "\tКарма:" + manager.karma + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }

    }

}

