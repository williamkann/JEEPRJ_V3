/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.pj.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julien
 */
public class EmployeesTest {
    
    public static Employees instance = new Employees(1,"Quach","Julien","0123456789","0625984715","0932156545","Rue des Lilas","94800","Villejuif","julien.quach@efrei.net");
    
    public EmployeesTest() {
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
     * Test of getIdemp method, of class Employees.
     */
    @Test
    public void testGetIdemp() {
        System.out.println("getIdemp");
        Integer expResult = 1;
        Integer result = instance.getIdemp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdemp method, of class Employees.
     */
    @Test
    public void testSetIdemp() {
        System.out.println("setIdemp");
        Integer idemp = 2;
        instance.setIdemp(idemp);
        Integer result = instance.getIdemp();
        assertEquals(idemp,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class Employees.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        String expResult = "Quach";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class Employees.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "Kann";
        instance.setLastname(lastname);
        String result = instance.getLastname();
        assertEquals(lastname, result);
        if(!(instance.getLastname().equals("Quach"))) instance.setLastname("Quach");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class Employees.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        String expResult = "Julien";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Employees.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "Nico";
        instance.setFirstname(firstname);
        String result = instance.getFirstname();
        assertEquals(firstname,result);
        if(!(instance.getFirstname().equals("Julien"))) instance.setFirstname("Julien");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHomephone method, of class Employees.
     */
    @Test
    public void testGetHomephone() {
        System.out.println("getHomephone");
        String expResult = "0123456789";
        String result = instance.getHomephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHomephone method, of class Employees.
     */
    @Test
    public void testSetHomephone() {
        System.out.println("setHomephone");
        String homephone = "09987654321";
        instance.setHomephone(homephone);
        String result = instance.getHomephone();
        assertEquals(homephone,result);
        if(!(instance.getHomephone().equals("0123456789"))) instance.setHomephone("0123456789");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMobilephone method, of class Employees.
     */
    @Test
    public void testGetMobilephone() {
        System.out.println("getMobilephone");
        String expResult = "0625984715";
        String result = instance.getMobilephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMobilephone method, of class Employees.
     */
    @Test
    public void testSetMobilephone() {
        System.out.println("setMobilephone");
        String mobilephone = "0648957652";
        instance.setMobilephone(mobilephone);
        String result = instance.getMobilephone();
        assertEquals(mobilephone,result);
        if(!(instance.getMobilephone().equals("0625984715"))) instance.setMobilephone("0625984715");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkphone method, of class Employees.
     */
    @Test
    public void testGetWorkphone() {
        System.out.println("getWorkphone");
        String expResult = "0932156545";
        String result = instance.getWorkphone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setWorkphone method, of class Employees.
     */
    @Test
    public void testSetWorkphone() {
        System.out.println("setWorkphone");
        String workphone = "0946951542";
        instance.setWorkphone(workphone);
        String result = instance.getWorkphone();
        assertEquals(workphone,result);
        if(!(instance.getWorkphone().equals("0932156545"))) instance.setWorkphone("0932156545");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Employees.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        String expResult = "Rue des Lilas";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Employees.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "Rue Parmentier";
        instance.setAddress(address);
        String result = instance.getAddress();
        assertEquals(address,result);
        if(!(instance.getAddress().equals("Rue des Lilas"))) instance.setAddress("Rue des Lilas");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPostalcode method, of class Employees.
     */
    @Test
    public void testGetPostalcode() {
        System.out.println("getPostalcode");
        String expResult = "94800";
        String result = instance.getPostalcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPostalcode method, of class Employees.
     */
    @Test
    public void testSetPostalcode() {
        System.out.println("setPostalcode");
        String postalcode = "94550";
        instance.setPostalcode(postalcode);
        String result = instance.getPostalcode();
        assertEquals(postalcode,result);
        if(!(instance.getPostalcode().equals("94800"))) instance.setPostalcode("94880");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Employees.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        String expResult = "Villejuif";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class Employees.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "Chevilly-Larue";
        instance.setCity(city);
        String result = instance.getCity();
        assertEquals(city,result);
        if(!(instance.getCity().equals("94800"))) instance.setCity("94880");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Employees.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "julien.quach@efrei.net";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Employees.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "willi.kann@efrei.net";
        instance.setEmail(email);
        String result = instance.getEmail();
        assertEquals(email,result);
        if(!(instance.getEmail().equals("julien.quach@efrei.net"))) instance.setEmail("julien.quach@efrei.net");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
