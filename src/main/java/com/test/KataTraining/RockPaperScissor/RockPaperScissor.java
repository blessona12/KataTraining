package com.test.KataTraining.RockPaperScissor;

public class RockPaperScissor {

    public String play(String p1,String p2)
    {
        if(p1.equals(p2))
        {
            return "Draw!";
        }
        if((p1.equals("Rock") && p2.equals("Scissor")) || (p1.equals("Paper")&& p2.equals("Rock"))
        || (p1.equals("Scissor")&&p2.equals("Paper")))
        {
            return "Player1 Wins!";
        }
        return "Player2 Wins!";
    }

}
