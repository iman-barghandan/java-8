package person;

import java.util.ArrayList;

public class PersonObjects
{
    public ArrayList<Person> listOfPerson()
    {
        ArrayList<Person> arrayListPerson = new ArrayList<>();

        //person1:
        Address address1 = new Address(1,"tehran","azadi" , "azadi" ,"123459");
        Person person1 = new Person("iman","brg",30,address1);
        arrayListPerson.add(person1);
        //person2:
        Address address2 = new Address(4,"tehran","shariati" , "hor" ,"457654");
        Person person2 = new Person("shahrokh","karimi",25,address2);
        arrayListPerson.add(person2);
        //person3:
        Address address3 = new Address(3,"shiraz","hafez" , "shahidi" ,"485456");
        Person person3 = new Person("amin","alavi",27,address3);
        arrayListPerson.add(person3);
        //person4:
        Address address4 = new Address(7,"mashad","emam" , "vahdati" ,"456741");
        Person person4 = new Person("ali","barghandan",31,address4);
        arrayListPerson.add(person4);

        return arrayListPerson;
    }
}
