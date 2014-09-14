/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vivalaklask
 */
public class CheckingAccountTest {
    
    private AccountInterface instance;
    
    public CheckingAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.instance = new CheckingAccount(new BigDecimal("100.00"));
    }
    
    @After
    public void tearDown() {
        this.instance = null;
    }

    /**
     * Test of withdraw method, of class CheckingAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        BigDecimal initialBalance = instance.getBalance();
        BigDecimal withdrawAmount = new BigDecimal("10.00");
        BigDecimal expReturnResult = new BigDecimal("10.00");
        BigDecimal result = instance.withdraw(withdrawAmount);
        
        assertEquals(expReturnResult, result);
        assertEquals(initialBalance.subtract(withdrawAmount),instance.getBalance());
    }

    /**
     * Test of deposit method, of class CheckingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        BigDecimal initialBalance = instance.getBalance();
        BigDecimal depositAmount = new BigDecimal("10.00");
        Boolean expResult = true;
        Boolean result = instance.deposit(depositAmount);
        assertEquals(expResult, result);
        assertEquals(initialBalance.add(depositAmount), instance.getBalance());
    }
    
}
