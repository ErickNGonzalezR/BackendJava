package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    public static Dice dice = Mockito.mock(Dice.class);

    /**
     * Definition: this function helps us for do tests whit Mockito
     * */
    @Test
    public void looses_when_dice_number_is_too_low() {
        //simula que cuando el dado ruede retorna un 2 y se espera un 3
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_big() {


        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}