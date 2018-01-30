package org.usfirst.frc.team86.robot.navigation;

/**
 * Just a simple 2D vector
 */
public class Vector {
    public double x;
    public double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Vector fromAngleAndLength(double angle, double lengthInMillimeters) {
        angle = Math.toRadians(angle);  // All math operations expect radians

        // According to the unit circle: x is the cosine, y is the sinus
        double x = lengthInMillimeters * Math.cos(angle);
        double y = lengthInMillimeters * Math.sin(angle);

        return new Vector(x, y);
    }

    /**
     * Returns true if v is parallel with this vector
     */
    public boolean isParallel(Vector v) {
        return getAngle() == v.getAngle();
    }

    /**
     * Returns the length of this vector. Easy using the Pythagorean theorem
     */
    public double getLength() {
        return Math.sqrt(x*x + y*y);
    }

    /**
     * Returns the orientation of this vector
     */
    public double getAngle() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    /**
     * Adds the two vectors and returns the result
     */
    public static Vector add(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y);
    }

    public static Vector scale(Vector v, double k) {
        return new Vector(v.x * k, v.y * k);
    }

    /**
     * Subtract the second vector from the first and returns the result
     */
    public static Vector subtract(Vector v1, Vector v2) {
        return new Vector(v1.x - v2.x, v1.y - v2.y);
    }

    public Vector rotate(double angleInDegrees) {
        double a = Math.toRadians(angleInDegrees);
        return new Vector(x * Math.cos(a) - y * Math.sin(a), y * Math.cos(a) + x * Math.sin(a));
    }

    public String toString() {
        return "("+((int)(x)+", "+(int)(y))+")";
    }

    public String display(int offset, double scale) {
        int xx = (int)(x*scale) + offset;
        int yy = (int)(y*scale) + offset;

        return xx+", "+yy;
    }
}
