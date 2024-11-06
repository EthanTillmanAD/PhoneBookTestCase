package testCase;
import java.util.*;

public class PhoneBook {



        private final Map<String, List<String>> phonebook;

        public PhoneBook(Map<String, List<String>> map) {
            this.phonebook = map;
        }

        public PhoneBook() {
            this(new HashMap<>());
        }

        public void add(String name, String phoneNumber) {
                    List<String> numbers = new ArrayList<>();

                    numbers.add(phoneNumber);

                    phonebook.put(name, numbers);

        }

        public void addAll(String name, String... phoneNumbers) {

            phonebook.put(name, Arrays.asList(phoneNumbers));


        }

        public void remove(String name) {
            phonebook.remove(name);
        }

        public Boolean hasEntry(String name) {
            if (phonebook.containsKey(name)){
                return true;
            }else {
                return false;
            }


        }

        public List<String> lookup(String name) {
            List<String> x = new ArrayList<>();

            if (phonebook.containsKey(name)){
               x.addAll(phonebook.get(name));
               return x;
            }else{
                return null;
            }




        }

        public String reverseLookup(String phoneNumber)  {
            for (Map.Entry<String, List<String>> entry : phonebook.entrySet()){
                if (entry.getValue().contains(phoneNumber)){

                    return entry.getKey();

                }
            }

            return "Not in phone book";
        }

        public List<String> getAllContactNames() {
            return null;
        }

        public Map<String, List<String>> getMap() {
            return phonebook;
        }
    }

