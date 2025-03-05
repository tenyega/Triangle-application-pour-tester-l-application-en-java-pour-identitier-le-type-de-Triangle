package appli;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @org.junit.Test
    public void testEquilateral() {
        // Create a custom RandomG that always returns 1.0f for all sides
        RandomG customRandomG = new RandomG(5.0f) {
            @Override
            public float getSideOne() {
                return 1.0f;
            }
            @Override
            public float getSideTwo() {
                return 1.0f;
            }
            @Override
            public float getSideThree() {
                return 1.0f;
            }
        };

        // Inject the custom RandomG instance into the Triangle constructor
        Triangle triangle = new Triangle(5.0f, customRandomG);

        // Assert that the sides are all 1.0f (Equilateral triangle)
        assertEquals(1.0f, triangle.getSide1(), 0.0001);
        assertEquals(1.0f, triangle.getSide2(), 0.0001);
        assertEquals(1.0f, triangle.getSide3(), 0.0001);
        assertEquals("Equilateral", triangle.checkTriangle());
    }

    @org.junit.Test
    public void testScalene() {
        // Create a custom RandomG that always returns 1.0f for all sides
        RandomG customRandomG = new RandomG(5.0f) {
            @Override
            public float getSideOne() {
                return 1.0f;
            }
            @Override
            public float getSideTwo() {
                return 2.0f;
            }
            @Override
            public float getSideThree() {
                return 3.0f;
            }
        };

        // Inject the custom RandomG instance into the Triangle constructor
        Triangle triangle = new Triangle(5.0f, customRandomG);

        // Assert that the sides are all 1.0f (Equilateral triangle)
        assertEquals(1.0f, triangle.getSide1(), 0.0001);
        assertEquals(2.0f, triangle.getSide2(), 0.0001);
        assertEquals(3.0f, triangle.getSide3(), 0.0001);
        assertEquals("Scalene", triangle.checkTriangle());
    }

    @org.junit.Test
    public void testIsosceles() {
        // Create a custom RandomG that always returns 1.0f for all sides
        RandomG customRandomG = new RandomG(5.0f) {
            @Override
            public float getSideOne() {
                return 2.0f;
            }
            @Override
            public float getSideTwo() {
                return 2.0f;
            }
            @Override
            public float getSideThree() {
                return 3.0f;
            }
        };

        // Inject the custom RandomG instance into the Triangle constructor
        Triangle triangle = new Triangle(5.0f, customRandomG);

        // Assert that the sides are all 1.0f (Equilateral triangle)
        assertEquals(2.0f, triangle.getSide1(), 0.0001);
        assertEquals(2.0f, triangle.getSide2(), 0.0001);
        assertEquals(3.0f, triangle.getSide3(), 0.0001);
        assertEquals("Isosceles", triangle.checkTriangle());
    }
}
