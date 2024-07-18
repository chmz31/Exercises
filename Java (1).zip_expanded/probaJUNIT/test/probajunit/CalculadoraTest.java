/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package probajunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.sumar(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.restar(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.multiplicar(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = null;
        double result = instance.dividir(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
