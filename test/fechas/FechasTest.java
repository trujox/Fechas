/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Fran Trujillo
 */
public class FechasTest {
    
    Fechas instance;
    
    public FechasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After");
    }
    
   @Before
    public void setUp() {
        instance = new Fechas();
    }
    
    @After
    public void tearDown() {
        instance = null;

    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void testEsFacturaFechaHoy() throws Exception {
        System.out.println("Dia de hoy");
        String fechaFactura ="2021-05-28";
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEsFacturaFechaPasada() throws Exception {
        System.out.println("Dia del pasado");
        String fechaFactura = "2021-05-27";
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEsFacturaFechaFutura() throws Exception {
        System.out.println("Dia en un futuro");
        String fechaFactura = "2021-05-29";
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hoy method, of class Fechas.
     */
    @Test
    public void testHoy() {
        System.out.println("Hoy");
        Fechas instance = new Fechas();
        String expResult = "";
        String result = instance.Hoy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
/*
Casos de pruebas bordes:
 Valor 28/05/2021(Dia de hoy) = si es el dia de hoy
 Valor 27/05/2021 = si es una fecha pasada
 Valor 29/05/2021 = si es una fecha futura
*/
    
