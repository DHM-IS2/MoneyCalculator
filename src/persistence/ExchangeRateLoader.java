package persistence;

import java.util.Date;
import model.Currency;
import model.ExchangeRate;
import model.Number;

public interface ExchangeRateLoader {
    
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency);
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency);
}
