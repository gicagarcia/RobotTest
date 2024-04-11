package org.example;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RobotTest {

    @Test
    public void shouldNotAcceptDistanceOverLimit(){
        Robot robot = new Robot();
        assertThat(robot.colisionPoint(10, 10, 45, 45, 10))
                .isInstanceOf(String.class)
                .isEqualTo("Error");
    }

}