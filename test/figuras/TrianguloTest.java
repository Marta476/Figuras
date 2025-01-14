/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package figuras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruthpamela.carbajal
 */
public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    } 

    /**
     * Test of calcularArea method, of class Triangulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Triangulo instance = new Triangulo(5,8,0,0,0);
        double expResult = 20.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPerimetro method, of class Triangulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Triangulo instance = new Triangulo(0,0,5,7,8);
        double expResult = 20.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
