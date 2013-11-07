package persistence;

import java.util.Date;
import model.Currency;
import model.ExchangeRate;
import model.Number;
public class ExchangeRateLoader {
    
    private static ExchangeRateLoader instance;
    
    private ExchangeRateLoader() {
    }
    
    public static ExchangeRateLoader getInstance() {
        if (instance == null)
            instance = new ExchangeRateLoader();
        return instance;
    }
    
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency){
        return load(new Date(), fromCurrency, toCurrency);    
    }
    
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency){
        return new ExchangeRate(date, fromCurrency, toCurrency, new Number(2.50));
    }
}
