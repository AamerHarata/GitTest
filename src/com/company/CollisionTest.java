package com.company;

public class CollisionTest {

    public static double GetCollisionTime (Circle o1, Circle o2) {
        double x = o2.x - o1.x;
        double y = o2.y - o1.y;
        double vx = o2.vx - o1.vx;
        double vy = o2.vy - o1.vy;
        double a = vx * vx + vy * vy;

        if (a == 0) {
            // Going the same way. No collision.
            // Return time in future to skip collision this turn.
            return 2.0;
        }

        double b = vx * x + vy * y;
        double c = x * x + y * y;
        double r = (o2.r + o1.r) * (o2.r + o1.r);
        double inside = b * b - a * (c - r);

        if (inside < 0) {
            // results to imaginary number when squared
            // -> no collision this turn
            return -2.0;
        }

        double square = Math.sqrt(inside);
        double fractionA2 = 1 / a;
        double t1 = -((square + b) * fractionA2);
        double t2 = ((square - b) * fractionA2);

        System.out.println(Math.min(t1, t2));
        if (t1 < 0 || t2 < 0) {
            // Either one or both in past.
            // Return time closer to the current time.
            return Math.max(t1, t2);
        }

        // Return time closer to the current time.
        return Math.min(t1, t2);
    };

}
