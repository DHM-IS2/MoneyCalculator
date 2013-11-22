package persistence;

import java.util.Date;
import model.Currency;
import model.ExchangeRate;

public class FileExchangeRateLoader implements ExchangeRateLoader{
    
    private static FileExchangeRateLoader instance;
     
    private FileExchangeRateLoader(){
    }
     
    public static FileExchangeRateLoader getInstance() {
        if (instance == null)
            instance = new FileExchangeRateLoader();
        return instance;
    }
     
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency){
        return load(new Date(), fromCurrency, toCurrency);    
    }
    
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency){
        return new ExchangeRate(date, fromCurrency, toCurrency, new model.Number(2.50));
    }
}
