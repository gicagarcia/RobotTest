package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform position X:");
        Integer x1 = scanner.nextInt();

        System.out.println("Inform position Y:");
        Integer y1 = scanner.nextInt();

        System.out.println("Inform angle:");
        Integer a = scanner.nextInt();

        System.out.println("Inform beam:");
        Integer f = scanner.nextInt();

        System.out.println("Inform obstacle distance:");
        Integer d = scanner.nextInt();

        ColisionResult result = robot.colisionPoint(x1, y1, a, f, d);
        if(result.hasError()){
            String error = result.getErrorMessage();
            System.out.println(error);
        }else{
            Integer[] coordinates = result.getCoordinates();
            String colision = String.format("Colision point: (%d, %d)", coordinates[0], coordinates[1]);
            System.out.println(colision);
        }
    }
}