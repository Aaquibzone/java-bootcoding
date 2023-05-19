package com.bootcoding.java;

import java.util.Random;

public class Match {

    // Properties / data members

    private String teamName;
    private int over;
    private int teamScore;

    private  String ground;
    static Random random = new Random();

    public Match(String teamName, int over, int teamScore, String ground) {
        this.teamName = teamName;
        this.over = over;
        this.teamScore = teamScore;
        this.ground = ground;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore =teamScore;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }
    public static int getRandomScore() {
        int number = random.nextInt(200 - 25); // 899999
        int run = 50 + number;
        //System.out.println(" Run Score = " + run);
        return run;
    }
    public static int getRandomOver() {
        int number = random.nextInt(20 - 5); // 899999
        int overplayed = 5 + number;
        //System.out.println(" Over PLayed = " + overplayed);
        return overplayed;
    }

    @Override
    public String toString() {
        return "Match{" +
                "teamName='" + teamName + '\'' +
                ", over=" + over +
                ", teamScore=" + teamScore +
                ", ground='" + ground + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Match team = new Match("India",getRandomOver(),getRandomScore(),"Jamta Nagpur");
        System.out.println("Team Id: " + team.getTeamName());
        System.out.println("Over Played: " + team.getOver());
        System.out.println("Team Score: " + team.getTeamScore());
        System.out.println("Match Ground: " + team.getGround());


        Match [] t1 = new Match[2];

        t1[0]= new Match("India",getRandomOver(), getRandomScore(),"jamta nagpur");
        t1[1]= new Match("Australia",getRandomOver(),getRandomScore(),"jamta nagpur");

        for(int i=0;i<2;i++)
        {
            System.out.println(t1[i]);


        }

        if(t1[0].getRandomScore()>t1[1].getRandomScore())
        {
            System.out.println("Team India Win ");
        }
        else{
            System.out.println("Australia Wins");
        }

    }

    }

