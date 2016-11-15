package ua.kiev.unicyb;

import java.io.IOException;

public class Main {
    public static void main (String[] str) throws IOException {
        Point result = new Solver().solve("C://input.txt");
        System.out.println(result.getX() + " " + result.getY());
    }
}
