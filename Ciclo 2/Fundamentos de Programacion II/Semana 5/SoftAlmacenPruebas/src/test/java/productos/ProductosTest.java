/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class ProductosTest {
    
    public ProductosTest() {
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
     * Test of getReferenciaProductos method, of class Productos.
     */
    @Test
    public void testGetReferenciaProductos() {
        System.out.println("getReferenciaProductos");
        Productos instance = new Productos(001, "Jordan", 50, 5000000);
        int expResult = 1;
        int result = instance.getReferenciaProductos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReferenciaProductos method, of class Productos.
     */
    @Test
    public void testSetReferenciaProductos() {
        System.out.println("setReferenciaProductos");
        int referenciaProductos = 002;
        Productos instance = new Productos();
        instance.setReferenciaProductos(referenciaProductos);
    }

    /**
     * Test of getNombreProductos method, of class Productos.
     */
    @Test
    public void testGetNombreProductos() {
        System.out.println("getNombreProductos");
        Productos instance = new Productos(001, "Jordan", 50, 5000000);
        String expResult = "Jordan";
        String result = instance.getNombreProductos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombreProductos method, of class Productos.
     */
    @Test
    public void testSetNombreProductos() {
        System.out.println("setNombreProductos");
        String nombreProductos = "Air Nike";
        Productos instance = new Productos();
        instance.setNombreProductos(nombreProductos);
    }

    /**
     * Test of getCantidadProductos method, of class Productos.
     */
    @Test
    public void testGetCantidadProductos() {
        System.out.println("getCantidadProductos");
        Productos instance = new Productos(001, "Jordan", 50, 5000000);
        int expResult = 50;
        int result = instance.getCantidadProductos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidadProductos method, of class Productos.
     */
    @Test
    public void testSetCantidadProductos() {
        System.out.println("setCantidadProductos");
        int cantidadProductos = 15;
        Productos instance = new Productos();
        instance.setCantidadProductos(cantidadProductos);
    }

    /**
     * Test of getValorInventariosProductos method, of class Productos.
     */
    @Test
    public void testGetValorInventariosProductos() {
        System.out.println("getValorInventariosProductos");
        Productos instance = new Productos(001, "Jordan", 50, 5000000);
        double expResult = 5000000;
        double result = instance.getValorInventariosProductos();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setValorInventariosProductos method, of class Productos.
     */
    @Test
    public void testSetValorInventariosProductos() {
        System.out.println("setValorInventariosProductos");
        double valorInventariosProductos = 1200000;
        Productos instance = new Productos();
        instance.setValorInventariosProductos(valorInventariosProductos);
    }
}
