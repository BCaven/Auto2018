package org.usfirst.frc.team86.robot.navigation;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: https://en.wikipedia.org/wiki/B%C3%A9zier_curve
 */
public class BezierCurve {
    public Vector p0, p1, p2, p3;

    public BezierCurve(Vector p0, Vector p1, Vector p2, Vector p3) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * Computes the value of the bezier curve at t (0 <= t <= 1)
     */
    public Vector getValue(double t) {
        t = clip(t, 0, 1);

        double k = 1-t;
        double k2 = k*k;
        double k3 = k2*k;

        double t2 = t*t;
        double t3 = t2*t;

        double x = k3*p0.x + 3*k2*t*p1.x + 3*k*t2*p2.x + t3*p3.x;
        double y = k3*p0.y + 3*k2*t*p1.y + 3*k*t2*p2.y + t3*p3.y;

        return new Vector(x, y);
    }

    /**
     * Evaluates the length of the curve by sampling it
     */
    public double getLength() {
        double steps = 100;

        Vector previous = new Vector(0.0, 0.0);
        double length = 0;

        for(double i=0; i<steps; i++) {
            double t = i / steps;
            Vector current = getValue(t);

            if(i > 0) {
                double xd = current.x - previous.x;
                double yd = current.y - previous.y;
                length += Math.sqrt(xd*xd + yd*yd);
            }
            previous = current;
        }

        return length;
    }

    public List<Segment> cut(int lengthOfAPart) {
        List<Segment> result = new ArrayList<>();

        double length = getLength();
        double step = (double)lengthOfAPart / length;

        Vector a = p0;
        for(double t=step; t<=1; t+=step) {
            Vector b = getValue(t);
            result.add(new Segment(a, b));
            a = b;
        }

        result.add(new Segment(a, p3));

        return result;
    }
    public double clip(double x,double min,double max) {
    	if(x < min) {
    		return min;
    	} else if (x > max) {
    		return max;
    	} else {
    		return min;
    	}
    }
}
