package com.test.KataTraining.RockPaperScissor;

public class RockPaperScissor {

    public String play(String p1,String p2)
    {
        if(p1.equals(p2))
        {
            return "Draw!";
        }
        return "p2 wins";
    }

}
