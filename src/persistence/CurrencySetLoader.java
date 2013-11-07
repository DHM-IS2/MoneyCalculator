package persistence;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    
    private static CurrencySetLoader instance;
    
    private CurrencySetLoader() {
    }
    
    public static CurrencySetLoader getInstance() {
        if (instance == null)
            instance = new CurrencySetLoader();
        return instance;
    }
    
    public void load(){
        CurrencySet.getInstance().add(new Currency ("USD", "United States Dollar", "$"));
    }
}
