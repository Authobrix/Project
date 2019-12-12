package com.company;

public class Situation {
    Situation[] direction;
    String subject,text;
    int dhealth,dkarma,dhunger;
    public Situation (String subject, String text, int variants, int dhealth,int dkarma,int dhunger) {
        this.subject=subject;
        this.text=text;
        dhealth=dhealth;
        dkarma=dkarma;
        dhunger=dhunger;
        direction=new Situation[variants];
    }
}
