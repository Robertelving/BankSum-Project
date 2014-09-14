package Model;

import java.math.BigDecimal;

/**
 *
 * @author vivalaklask
 */
public class CheckingAccount implements AccountInterface{

    private BigDecimal balance;
    private AccountType type;

    public CheckingAccount() {
        this.balance = new BigDecimal("0.00");
    }
    
    public CheckingAccount(BigDecimal balance, AccountType type) {
        this.balance = balance;
        this.type = type;
    }
    
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

    @Override
    public void setType(AccountType type) {
        this.type = type;
    }

    @Override
    public AccountType getType() {
        return this.type;
    }
}
