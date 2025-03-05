package appli;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class TriangleEasyMock {

    // Test for creating a Triangle object and checking if it's created properly
    @org.junit.Test
    public void createObj(){
        Triangle triangle = new Triangle(200.0f);
        assertNotNull(triangle);  // Ensures the object is not null
        assertTrue(triangle instanceof Triangle);  // Ensures it is an instance of Triangle
    }

    // Test for equilateral triangle (Using mocked RandomG for predictable behavior)
    @org.junit.Test
    public void testEquilateral() {
        // Create a mock of RandomG
        RandomG mockRandom = createMock(RandomG.class);

        // Set expectations
        expect(mockRandom.getSideOne()).andReturn(1.0f);
        expect(mockRandom.getSideTwo()).andReturn(1.0f);
        expect(mockRandom.getSideThree()).andReturn(1.0f);
        expect(mockRandom.getType()).andReturn("Equilateral");

        // Activate the mock
        replay(mockRandom);

        // Assert that all sides are equal (equilateral triangle)
        assertEquals(1.0f, mockRandom.getSideOne(), 0.0001);
        assertEquals(1.0f, mockRandom.getSideTwo(), 0.0001);
        assertEquals(1.0f, mockRandom.getSideThree(), 0.0001);
        assertEquals("Equilateral", mockRandom.getType());

        // Verify that the mock interactions were correct
        verify(mockRandom);
    }

    @org.junit.Test
    public void testScalene() {
        // Create a mock of RandomG
        RandomG mockRandom = createMock(RandomG.class);

        // Set expectations
        expect(mockRandom.getSideOne()).andReturn(1.0f);
        expect(mockRandom.getSideTwo()).andReturn(2.0f);
        expect(mockRandom.getSideThree()).andReturn(3.0f);
        expect(mockRandom.getType()).andReturn("Scalene");

        // Activate the mock
        replay(mockRandom);

        // Assert that the sides are as expected
        assertEquals(1.0f, mockRandom.getSideOne(), 0.0001);
        assertEquals(2.0f, mockRandom.getSideTwo(), 0.0001);
        assertEquals(3.0f, mockRandom.getSideThree(), 0.0001);
        assertEquals("Scalene", mockRandom.getType());

        // Verify mock interactions
        verify(mockRandom);
    }

    @org.junit.Test
    public void testIsosceles() {
        // Create a mock of RandomG
        RandomG mockRandom = createMock(RandomG.class);

        // Set expectations
        expect(mockRandom.getSideOne()).andReturn(2.0f);
        expect(mockRandom.getSideTwo()).andReturn(2.0f);
        expect(mockRandom.getSideThree()).andReturn(3.0f);
        expect(mockRandom.getType()).andReturn("Isosceles");

        // Activate the mock
        replay(mockRandom);

        // Assert that the sides are as expected
        assertEquals(2.0f, mockRandom.getSideOne(), 0.0001);
        assertEquals(2.0f, mockRandom.getSideTwo(), 0.0001);
        assertEquals(3.0f, mockRandom.getSideThree(), 0.0001);
        assertEquals("Isosceles", mockRandom.getType());

        // Verify mock interactions
        verify(mockRandom);
    }
}
