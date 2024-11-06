import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testCase.PhoneBook;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {

    PhoneBook phoneBook;
    @BeforeEach
    void setUp(){
        phoneBook = new PhoneBook();
    }


    @Test
    @DisplayName("Test Default Constructor")
    void createPhoneBookWithoutParameters(){
        //Given


        //When


        //Then
        Assertions.assertTrue(phoneBook.getMap() instanceof HashMap);
//        Assertions.assertInstanceOf(HashMap.class, phoneBook.getMap());
    }

    @Test
    @DisplayName("Test Add Method")
    void addAllTest(){


        String name = "Joe";

        String[] phoneNumbers = {
                "302-234-5678",
                "302-756-8900",
                "302-234-5758",
                "302-776-8900"};

        phoneBook.addAll(name, phoneNumbers);
        List<String> actual =  phoneBook.lookup(name);

       Assertions.assertTrue(phoneBook.hasEntry("Joe"));

    Assertions.assertEquals(Arrays.asList(phoneNumbers), phoneBook.lookup(name));

    }

    @Test
    @DisplayName("Test Remove Method")
    void removeTest(){
        //given
        String name = "Joe";
        //when

        phoneBook.add("Joe", "302-444-8973");
        phoneBook.remove("Joe");
        Map<String, List<String>> actual = null;
        //then
        Assertions.assertEquals(phoneBook.lookup("Joe"), actual);


    }

    @Test
    @DisplayName("Test Reverse LookUp")
    void reverseLookUpTest(){

        String name = "Joe";
        phoneBook.add("Joe", "302-444-8973");

        Assertions.assertEquals(phoneBook.reverseLookup("302-444-8973"), name);




    }
    @Test
    @DisplayName("Test LookUp")
    void lookUpTest(){

        String number = "302-444-8973";
        phoneBook.add("Joe", "302-444-8973");

        Assertions.assertEquals(phoneBook.lookup("Joe"),Arrays.asList(number));




    }

}
