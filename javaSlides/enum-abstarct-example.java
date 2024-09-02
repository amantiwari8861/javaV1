public enum Country {
 
    US {
 
        public String getCurrency() {
            return "DOLLAR";
        }
    }, RUSSIA {
 
        public String getCurrency() {
            return "RUBLE";
        }
    }, INDIA {
 
        public String getCurrency() {
            return "RUPEE";
        }
    };
 
    public abstract String getCurrency();
}
//And this is my main class.


public class ListCurrency {
    public static void main(String[] args) {
        for (Country country : Country.values()) {
            System.out.println(country.getCurrency() + " is the currecny of " + country.name());
        }
    }
}