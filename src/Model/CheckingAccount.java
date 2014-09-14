package Model;

import java.math.BigDecimal;

/**
 *
 * @author vivalaklask
 */
public class CheckingAccount implements AccountInterface{

    private BigDecimal balance;

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
        return false;
    }

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("18.56");
        BigDecimal b2 = new BigDecimal("18.5");
        System.out.println(b1.abs());
        System.out.println(b1.add(b2));
        System.out.println(b1.add(b2));
        System.out.println(b1.movePointLeft(1));
        System.out.println(b1);
        AccountInterface a = new CheckingAccount(new BigDecimal(100.00));
        
    }
    
}
