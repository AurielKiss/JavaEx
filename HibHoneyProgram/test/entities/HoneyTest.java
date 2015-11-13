/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class HoneyTest {
    
    public HoneyTest() {
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
     * Test of getId method, of class Honey.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Honey instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Honey.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Honey instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Honey.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Honey instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Honey.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Honey instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaste method, of class Honey.
     */
    @Test
    public void testGetTaste() {
        System.out.println("getTaste");
        Honey instance = null;
        String expResult = "";
        String result = instance.getTaste();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaste method, of class Honey.
     */
    @Test
    public void testSetTaste() {
        System.out.println("setTaste");
        String taste = "";
        Honey instance = null;
        instance.setTaste(taste);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBees method, of class Honey.
     */
    @Test
    public void testGetBees() {
        System.out.println("getBees");
        Honey instance = null;
        Set<Bee> expResult = null;
        Set<Bee> result = instance.getBees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBees method, of class Honey.
     */
    @Test
    public void testSetBees() {
        System.out.println("setBees");
        Set<Bee> bees = null;
        Honey instance = null;
        instance.setBees(bees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Honey.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Honey instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
