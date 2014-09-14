package Model;

import java.math.BigDecimal;

/**
 *
 * @author vivalaklask
 */
public class CheckingAccount implements AccountInterface{

    private BigDecimal balance;

    public CheckingAccount() {
        this.balance = new BigDecimal("0.00");
    }
    
    public CheckingAccount(BigDecimal balance) {
        this.balance = balance;
    }
    
    /**
     * Withdraws the amount from AccountBalance and returns amount
     * @param amount The amount to be withdrawn
     * @return amount withdrawn
     */
    @Override
    public BigDecimal withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
        return amount;
    }

    @Override
    public Boolean deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return true;
    }

    @Override
    public BigDecimal getBalance() {
        return this.balance;
    }
    
}
