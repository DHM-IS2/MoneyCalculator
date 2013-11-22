package ui;

import model.Money;

public class MoneyViewer {

    public void show(Money money) {
        System.out.println((double) money.getAmount().getNumerator() / money.getAmount().getDenominator() + " " + money.getCurrency().getCode());    
    }
    
}
