package lab11;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Task5 {

    public static class Point implements Comparable<Point> {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.x != other.x) {
                return Integer.compare(this.x, other.x);
            }
            return Integer.compare(this.y, other.y);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }


    public static class CompareY implements Comparator<Point> {

        @Override
        public int compare(Point p1, Point p2) {
            if (p1.getY() != p2.getY()) {
                return Integer.compare(p1.getY(), p2.getY());
            }
            return Integer.compare(p1.getX(), p2.getX());
        }
    }








}
