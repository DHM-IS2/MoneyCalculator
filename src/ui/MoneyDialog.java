package ui;

import model.Money;

public interface MoneyDialog {
    
    public void setMoney(Money Money);

    public Money getMoney();
    
    public void show();
}
