package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RobotTest {

    Robot robot;

    @BeforeEach
    void setUp(){
        robot = new Robot();
    }

    @Test
    public void shouldNotAcceptDistanceOverLimit(){
        assertThat(robot.colisionPoint(10, 10, 45, 45, 10))
                .isEqualTo("Error");
    }

    @Test
    public void shouldNotAcceptNegativeDistance(){
        assertThat(robot.colisionPoint(1, 1, 45, 60, -4))
                .isEqualTo("Error");
    }

}