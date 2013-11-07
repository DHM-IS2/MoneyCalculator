package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import model.Currency;
import model.CurrencySet;

public class CurrencyDialog{

    public Currency execute() throws IOException{
        Currency currency;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el código de una divisa");
        currency = CurrencySet.getInstance().get(reader.readLine());
        return currency;
    }
    
}
