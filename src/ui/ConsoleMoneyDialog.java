package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import model.Currency;
import model.Money;
import model.Number;

public class ConsoleMoneyDialog implements MoneyDialog{
    
    Money money;
    
    @Override
    
    public Money getMoney(){
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
    
    public void show(){
        System.out.println("Introduzca una cantidad de dinero");
        Number amount;
        Currency currency;
        Scanner sc = new Scanner(System.in);
        amount = new Number(sc.nextDouble());
        CurrencyDialog currencyDialog = new CurrencyDialog();
        currency = currencyDialog.execute();
        money = new Money(amount, currency);
    }
    
    private Money readMoney(){
        return null;
    }
}
