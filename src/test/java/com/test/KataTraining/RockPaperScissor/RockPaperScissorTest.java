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
}
