import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
    
public class DialingCodes {
public Map<Integer, String> newmap = new HashMap<>();

    
    public Map<Integer, String> getCodes() {
        return newmap;
    }

    public void setDialingCode(Integer code, String country) {
     newmap.put(code, country);
    }

    public String getCountry(Integer code) {
    return newmap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
     if  (!newmap.containsValue(country)&& !newmap.containsKey(code)){
         setDialingCode(code,country);
     }else {return;}
    }

    public Integer findDialingCode(String country) {
 for (Map.Entry<Integer, String> entry : newmap.entrySet()) {
        if (entry.getValue().equals(country)) {
            return entry.getKey();
        }
    }

    return null;
   
        
        
    }

    // key== code ; country == value
    
    public void updateCountryDialingCode(Integer code, String country) {
        if (!newmap.containsValue(country)){
            return;
        }else{
            int x=findDialingCode(country);
            newmap.remove(x);
            newmap.put(code,country);
        }
    }
}
