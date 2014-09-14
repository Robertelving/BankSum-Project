package Model;

import java.math.BigDecimal;

/**
 *
 * @author vivalaklask
 */
public interface AccountInterface {
    
    /**
     * Withdraw amount from account.
     * @param amount Amount to be withdrawn.
     * @return amount withdrawn
     */
    public BigDecimal withdraw(BigDecimal amount);
    
    /**
     * Deposit amount to account. 
     * @param amount Amount to be deposited.
     * @return True if amount successfully deposited else false
     */
    public Boolean deposit(BigDecimal amount);
    
}
