package com.test.KataTraining.RockPaperScissor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPaperScissorTest {

    @Test
    void Draw()
    {
        RockPaperScissor rpc=new RockPaperScissor();
        assertEquals("Draw!",rpc.play("Rock","Rock"));
        assertEquals("Draw!",rpc.play("scissor","scissor"));
        assertEquals("Draw!",rpc.play("paper","paper"));
    }

    @Test
    void PlayerOneWins()
    {
        RockPaperScissor rpc= new RockPaperScissor();
        assertEquals("Player1 Wins!",rpc.play("Rock","Scissor"));
        assertEquals("Player1 Wins!",rpc.play("Paper","Rock"));
        assertEquals("Player1 Wins!",rpc.play("Scissor","Paper"));
    }

    @Test
    void PlayerTwoWins()
    {
        RockPaperScissor rpc= new RockPaperScissor();
        assertEquals("Player2 Wins!",rpc.play("Scissor","Rock"));
        assertEquals("Player2 Wins!",rpc.play("Rock","Paper"));
        assertEquals("Player2 Wins!",rpc.play("paper","Scissor"));
    }
}
