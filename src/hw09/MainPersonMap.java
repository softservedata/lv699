package hw09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainPersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Garfield", "Andrew");
        personMap.put("Seyfried", "Amanda");
        personMap.put("Tatum", "Channing");
        personMap.put("Kunis", "Mila");
        personMap.put("Johnson", "Boris");
        personMap.put("Smith", "Tim");
        personMap.put("Fernandes", "Bruno");
        personMap.put("Muller", "Thomas");
        personMap.put("Kane", "Harry");
        personMap.put("Cook", "Tim");
        personMap.put("Messi", "Lionel");
        personMap.put("Usyk", "Orest");

        MainPersonMap obj = new MainPersonMap();

        System.out.println(obj.printPerson(personMap));

        System.out.println("Same first name: ");
        obj.printPerson(obj.findSameFirstName(personMap));

        System.out.println("\nRemove the first name \"Orest\"");
        obj.printPerson(obj.rmPersonNameOrest(personMap,"Orest"));
    }

    public Map<String, String> rmPersonNameOrest(Map<String, String> _personMap, String _namePerson) {
        for (Iterator<Map.Entry<String, String>> iterator = _personMap.entrySet().iterator(); iterator.hasNext(); ) {
            if (iterator.next().getValue().equals(_namePerson)) {
                iterator.remove();
            }
        }
        return _personMap;
    }

    public Map<String, String> findSameFirstName(Map<String, String> _personMap) {
        Map<String, String> sameFirstName = new HashMap<>();
        for (Map.Entry<String, String> entry : _personMap.entrySet()) {
            for (Map.Entry<String, String> entry1 : _personMap.entrySet()) {
                if (entry.getValue().equals(entry1.getValue()) && !entry.getKey().equals(entry1.getKey())) {
                    sameFirstName.put(entry.getKey(), entry.getValue());
                    sameFirstName.put(entry1.getKey(), entry1.getValue());
                }
            }
        }
        return sameFirstName;
    }

    public String printPerson(Map<String, String> _personMap) {
        String result = "";
        for (Map.Entry<String, String> entry : _personMap.entrySet()) {
            System.out.println("Person: " + entry.getKey() + " " + entry.getValue());
        }
        return result;
    }
}
