package com.company;

public class Story {
    private Situation start_story;
    public Situation current_situation;

    Story() {
        start_story = new Situation(
                "Необитаемый остров (ночь)",
                "Вы потерпели крушение на самолёте и оказались на неизвестном острове.\n Вы очень голодны и " +
                        "сильно замёрзли.\n Вдруг вы заметили поселение местных жителей.\n У них есть еда и одежда\n" +
                        " Вам необходимо принять решение: \n"
                        + "(1)Попробовать поговорить с ними и попросить помощи\n"
                        + "(2)Украсть еду и одежду у местных жителей\n"
                        + "(3)не рисковать и попробовать найти ресурсы в другом месте ",
                3, 0, 0, 0);
        start_story.direction[0] = new Situation(
                "ночь",
                "Они поделились со мной ресурсами за помощь в ремонте лодки. "
                        + "попробую что-нибудь разыскать",
                0, 100, 50, 40);
        start_story.direction[1] = new Situation(
                "нашёл еду",
                "Расколол 2 кокоса и пожарил пойманную рыбу,",
                0, 0, 0, 0);
        start_story.direction[2] = new Situation(
                "первая встреча с людьми",
                "я заметил дым, поднимающийся в глубине леса ",
                0, 0,
                50, 1);
        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
