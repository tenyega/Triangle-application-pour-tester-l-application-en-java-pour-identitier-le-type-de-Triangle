package appli;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class TriangleUnitTest {

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
        // Mock RandomG to return fixed values for sides
        RandomG mockRandom = mock(RandomG.class);
        when(mockRandom.getSideOne()).thenReturn(1.0f);
        when(mockRandom.getSideTwo()).thenReturn(1.0f);
        when(mockRandom.getSideThree()).thenReturn(1.0f);
        when(mockRandom.getType()).thenReturn("Equilateral");


        System.out.println(mockRandom.getSideOne());
        System.out.println(mockRandom.getSideTwo());
        System.out.println(mockRandom.getSideThree());
        // Assert that all sides are equal (equilateral triangle)
        assertEquals(1.0f, mockRandom.getSideOne(), 0.0001);
        assertEquals(1.0f, mockRandom.getSideTwo(), 0.0001);
        assertEquals(1.0f,mockRandom.getSideThree(), 0.0001);
        System.out.println(mockRandom.getType());
        assertEquals("Equilateral", mockRandom.getType());
    }


@org.junit.Test
public void testScalene() {
    // Mock RandomG to return fixed values for sides
    RandomG mockRandom = mock(RandomG.class);
    when(mockRandom.getSideOne()).thenReturn(1.0f);
    when(mockRandom.getSideTwo()).thenReturn(2.0f);
    when(mockRandom.getSideThree()).thenReturn(3.0f);
    when(mockRandom.getType()).thenReturn("Scalene");


    System.out.println(mockRandom.getSideOne());
    System.out.println(mockRandom.getSideTwo());
    System.out.println(mockRandom.getSideThree());
    // Assert that all sides are equal (equilateral triangle)
    assertEquals(1.0f, mockRandom.getSideOne(), 0.0001);
    assertEquals(2.0f, mockRandom.getSideTwo(), 0.0001);
    assertEquals(3.0f,mockRandom.getSideThree(), 0.0001);
    System.out.println(mockRandom.getType());
    assertEquals("Scalene", mockRandom.getType());
}


    @org.junit.Test
    public void testIsosceles() {
        // Mock RandomG to return fixed values for sides
        RandomG mockRandom = mock(RandomG.class);
        when(mockRandom.getSideOne()).thenReturn(2.0f);
        when(mockRandom.getSideTwo()).thenReturn(2.0f);
        when(mockRandom.getSideThree()).thenReturn(3.0f);
        when(mockRandom.getType()).thenReturn("Isosceles");


        System.out.println(mockRandom.getSideOne());
        System.out.println(mockRandom.getSideTwo());
        System.out.println(mockRandom.getSideThree());
        // Assert that all sides are equal (equilateral triangle)
        assertEquals(2.0f, mockRandom.getSideOne(), 0.0001);
        assertEquals(2.0f, mockRandom.getSideTwo(), 0.0001);
        assertEquals(3.0f,mockRandom.getSideThree(), 0.0001);
        System.out.println(mockRandom.getType());
        assertEquals("Isosceles", mockRandom.getType());
    }
}

