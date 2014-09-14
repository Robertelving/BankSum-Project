package Model;

import java.math.BigDecimal;

/**
 *
 * @author vivalaklask
 */
public interface AccountInterface {
    
    /**
     * Withdraw amount from account.
     * 
     * @param amount Amount to be withdrawn.
     * @return Amount withdrawn
     */
    public BigDecimal withdraw(BigDecimal amount);
    
    /**
     * Deposit amount to account. 
     * 
     * @param amount Amount to be deposited.
     * @return True if amount successfully deposited else false
     */
    public Boolean deposit(BigDecimal amount);
    
    /**
     * Returns the balance of the account.
     * 
     * @return Balance of Account
     */
    public BigDecimal getBalance();
    
    /**
     * Set the type of account
     * @param type Account changed to this type.
     */
    public void setType(AccountType type);
    
    /**
     * returns the type of Account.
     * @return type of Account.
     */
    public AccountType getType();
    
}
