package persistence;

import java.util.Date;
import model.Currency;
import model.ExchangeRate;

public class DBExchangeRateLoader implements ExchangeRateLoader{
    
    private static DBExchangeRateLoader instance;
     
    private DBExchangeRateLoader(){
    }
     
    public static DBExchangeRateLoader getInstance() {
        if (instance == null)
            instance = new DBExchangeRateLoader();
        return instance;
    }
    
    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
