package persistence;

import model.Currency;
import model.CurrencySet;

/**
 *
 * @author Darwin
 */
public class MockCurrencySetLoader implements CurrencySetLoader{
    
    private static MockCurrencySetLoader instance;
    
    private MockCurrencySetLoader() {
    }
    
    public static MockCurrencySetLoader getInstance() {
        if (instance == null)
            instance = new MockCurrencySetLoader();
        return instance;
    }
    
    @Override
    
    public void load(){
        CurrencySet.getInstance().add(new Currency ("USD", "United States Dollar", "$"));
        CurrencySet.getInstance().add(new Currency ("EUR", "United States Dollar", "$"));
    }
    
}
