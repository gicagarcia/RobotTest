package org.example;

import java.util.function.IntPredicate;

public class Robot {

    public ColisionResult colisionPoint(Integer x1, Integer x2, Integer a, Integer f, Integer d){
        if(d > 8 || d < 0){
            return new ColisionResult("Error");
        }

        Integer angle = recalculateAngle(a, f);
        Integer[] coordinates = calculateColisionPoint(angle, d);

        return new ColisionResult(coordinates);
    }

    public Integer recalculateAngle(Integer a, Integer f){
        return (a+f) - 90;
    }

    private Integer[] calculateColisionPoint(Integer angle, Integer d) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);

        double x = d * cos;
        double y = d * sin;

        Integer roundX = (int) Math.round(x);
        Integer roundY = (int) Math.round(y);

        return new Integer[]{roundX, roundY};
    }

}
