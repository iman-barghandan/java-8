import person.Person;
import person.PersonObjects;
import sort.ListOfLastName;
import sort.SortByAge;
import sort.SortByLengthLastName;

import java.util.ArrayList;
import java.util.List;

public class MainClass
{
    public static void main(String[] args) {
        PersonObjects po = new PersonObjects();
        ArrayList<Person> arrayListPerson = po.listOfPerson();

        // sort by "age":
        System.out.println("sort by age:");
        ArrayList<Person> arrayListAge = SortByAge.execute(arrayListPerson);
        arrayListAge.forEach(System.out::println);
//        arrayListAge.forEach(c -> System.out.println(c));
        System.out.println("**********************************");

        System.out.println("sort by Lengths of LastName: ");
        //sort by LastName(Lengts):
        ArrayList<Person> arrayListLastName = SortByLengthLastName.execute(arrayListPerson);
        //get list of LastName:
        List<String> stringList = ListOfLastName.execute(arrayListLastName);
        stringList.forEach(System.out::println);
        System.out.println("**********************************");


    }
}
