package control;

import java.io.IOException;
import model.Currency;
import model.ExchangeRate;
import model.Money;
import model.MoneyExchanger;
import persistence.ExchangeRateLoader;
import ui.CurrencyDialog;
import ui.MoneyDialog;
import ui.MoneyViewer;
import model.MoneyExchanger;

public class ExchangeMoneyControl{
    
    private MoneyDialog moneyDialog;
    private CurrencyDialog currencyDialog;
    private MoneyViewer moneyViewer;
    private ExchangeRateLoader exchangeRateLoader;

    public ExchangeMoneyControl(MoneyDialog moneyDialog, CurrencyDialog currencyDialog, MoneyViewer moneyViewer, ExchangeRateLoader exchangeRateLoader) {
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
        this.moneyViewer = moneyViewer;
        this.exchangeRateLoader = exchangeRateLoader;
    }
    
    public void execute() throws IOException{
        Money money = readMoney();
        Currency currency = readCurrency();
        ExchangeRate exchangeRate = exchangeRateLoader.load(money.getCurrency(), currency);
        money = MoneyExchanger.exchange(money, exchangeRate);
        moneyViewer.show(money);
    }
    
    private Money readMoney() throws IOException{
        moneyDialog.execute();
        return moneyDialog.getMoney();
    }
    
    private Currency readCurrency() throws IOException{
        currencyDialog.execute();
        return currencyDialog.getCurrency();
    }
}
