package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Currency;
import model.CurrencySet;

public class CurrencyDialog{
    
    private Currency currency;
    
    public Currency execute(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el código de una divisa");
        while (currency == null)
            try {
                currency = CurrencySet.getInstance().get(reader.readLine());
            } 
            catch (IOException ex) {
                currency = CurrencySet.getInstance().get("");
            }
        return currency;
    }
    
    public Currency getCurrency(){
        return currency;
    }
}
