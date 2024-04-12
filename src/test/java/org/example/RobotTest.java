package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotTest {

    Robot robot;

    @BeforeEach
    void setUp(){
        robot = new Robot();
    }

    @Test
    public void shouldNotAcceptDistanceOverLimit(){
        ColisionResult result = robot.colisionPoint(10, 10, 45, 45, 10);
        assertTrue(result.hasError());
    }

    @Test
    public void shouldNotAcceptNegativeDistance(){
        ColisionResult result = robot.colisionPoint(1, 1, 45, 60, -4);
        assertTrue(result.hasError());
    }

    @Test
    public void shouldOnlyAcceptAnglesBetweenNegative90AndPositive90(){
        ColisionResult result = robot.colisionPoint(0, 0, 100, 150, 5);
        assertTrue(result.hasError());
    }

    @Test
    public void shouldOnlyAcceptBeamsUnder180(){
        ColisionResult result = robot.colisionPoint(0, 0, 45, 190, 5);
        assertTrue(result.hasError());
    }

    @Test
    public void rightfullyCalculatesColisionAngle(){
        assertThat(robot.recalculateAngle(45, 135))
                .isEqualTo(90);
    }

    @Test
    public void shouldReturnTwoIntegersIfInputsValid(){
        ColisionResult result = robot.colisionPoint(1, 1, 45, 60, 3);
        Integer[] coordinates = result.getCoordinates();
        assertEquals(2, coordinates.length);
    }

}