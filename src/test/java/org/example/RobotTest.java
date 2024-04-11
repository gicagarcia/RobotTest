package org.example;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RobotTest {

    @Test
    void shouldNotAcceptDistanceOverLimit(){
        Robot robot = new Robot();
        assertThat(robot.colisionPoint(10, 10, 45, 45, 10)).isEqualTo("Error");
    }

}