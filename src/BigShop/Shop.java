package BigShop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop implements PayCheck{

    private BigDecimal balance;
    private Map < String, ArrayList> mapping = new HashMap(); // ALMACENA Y UBICA A CLIENTES U ITEMS PARA VERIFICAR, SETTEAR BALANCE

    public Shop() {
    }

    public Shop(BigDecimal balance) {
        this.balance = balance;
        mapping.put("user", new ArrayList <User> ()); // KEY DEL ARRAYLIST PARA VERIFICAR BALANCE
        mapping.put("item", new ArrayList <Item> ());
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Map<String, ArrayList> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, ArrayList> mapping) {
        this.mapping = mapping;
    }

    @Override
    public void receivePayment(BigDecimal amount) {

    }
}
