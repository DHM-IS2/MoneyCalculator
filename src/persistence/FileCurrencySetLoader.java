package persistence;
import model.Currency;
import model.CurrencySet;

public class FileCurrencySetLoader implements CurrencySetLoader {
    
    private static FileCurrencySetLoader instance;
    
    private FileCurrencySetLoader() {
    }
    
    public static FileCurrencySetLoader getInstance() {
        if (instance == null)
            instance = new FileCurrencySetLoader();
        return instance;
    }
    
    @Override
    
    public void load(){
    }
}
