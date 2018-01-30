package org.usfirst.frc.team86.robot.navigation;

/**
 * A segment is a line between two points
 */
public class Segment {
    public Vector a;
    public Vector b;

    public Segment(Vector a, Vector b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "["+a+", "+b+"]";
    }

    public double getLength() {
        Vector d = Vector.subtract(b, a);
        return Math.sqrt(d.x*d.x + d.y*d.y);
    }

    public Vector getMiddle() {
        return new Vector((a.x+b.x)/2, (a.y+b.y)/2);
    }

    public Segment getPerpendicularSegment() {
        Vector mid = getMiddle();

        Vector segment = Vector.subtract(b, a);
        Vector perpendicular = new Vector(a.x + segment.y, a.y -segment.x);

        return new Segment(mid, perpendicular);
    }

    public static Vector getIntersection(Segment s1, Segment s2) {
        if(s1.a.x == s1.b.x) {
            if(s2.a.x == s2.b.x) {
                // Parallel vertical lines
                return null;
            }
            else {
                double slope2 = (s2.b.y - s2.a.y) / (s2.b.x - s2.a.x);
                double yIntercept2 = s2.a.y - slope2 * s2.a.x;

                return new Vector(s1.a.x, slope2 * s1.a.x + yIntercept2);
            }
        }
        else {
            double slope1 = (s1.b.y - s1.a.y) / (s1.b.x - s1.a.x);
            double yIntercept1 = s1.a.y - slope1 * s1.a.x;

            if(s2.a.x == s2.b.x) {
                return new Vector(s2.a.x, slope1 * s2.a.x + yIntercept1);
            }
            else {
                double slope2 = (s2.b.y - s2.a.y) / (s2.b.x - s2.a.x);
                double yIntercept2 = s2.a.y - slope2 * s2.a.x;

                if(slope1 == slope2) {
                    // Parallel lines
                    return null;
                }

                double x = -(yIntercept1-yIntercept2) / (slope1-slope2);
                double y = slope1 * x + yIntercept1;

                return new Vector(x, y);
            }
        }
    }
}
