package main;

import control.ExchangeMoneyControl;
import java.io.IOException;
import model.ExchangeRate;
import persistence.CurrencySetLoader;
import persistence.ExchangeRateLoader;
import persistence.MockCurrencySetLoader;
import persistence.MockExchangeRateLoader;
import ui.CurrencyDialog;
import ui.MoneyDialog;
import ui.MoneyViewer;

public class MoneyCalculator {
            
    public static void main(String[] args) throws IOException {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        moneyCalculator.execute();
    }
    
    public void execute() throws IOException{
        MockCurrencySetLoader mockCurrencySetLoader = MockCurrencySetLoader.getInstance();
        mockCurrencySetLoader.load();
        MoneyDialog moneyDialog = new MoneyDialog();
        CurrencyDialog currencyDialog = new CurrencyDialog();
        MoneyViewer moneyViewer = new MoneyViewer();
        MockExchangeRateLoader exchangeRateLoader = MockExchangeRateLoader.getInstance();        
        ExchangeMoneyControl exchangeMoneyControl = new ExchangeMoneyControl(moneyDialog, currencyDialog, moneyViewer, exchangeRateLoader);
        exchangeMoneyControl.execute();
    }
}
