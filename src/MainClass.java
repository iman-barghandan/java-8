import filter.FilterByCityAndZone;
import person.Person;
import person.PersonObjects;
import sort.ListOfLastName;
import sort.SortByAge;
import sort.SortByLengthLastName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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

        //filter city and zone:
        System.out.println("filter city and zone: ");
        Stream<Person> arrayListFilter = FilterByCityAndZone.execute(arrayListPerson,"tehran" , 5);
        arrayListFilter.forEach(System.out::println);
        System.out.println("**********************************");

        //Stream anyMatch:
        System.out.println("anyMatch: ");
        List<Integer> list = Arrays.asList(1,2,3,4,5,10);
        boolean result = list.stream().anyMatch(p -> ((p*2)+2-1)/7==3);
        System.out.println("result: " + result);
        //if "10" was not in the list --> result = false
        System.out.println("**********************************");

        //Stream reduce:
        System.out.println("reduce: ");
        List<String> stringList1 = Arrays.asList("iman","ali","mohammad","mohammadreza");
        Optional<String> stringOptional = stringList1.stream().reduce((r1 , r2) -> r1.length() > r2.length() ? r1 : r2);
        System.out.println("the longest(max) string: ");
        stringOptional.ifPresent(System.out::println);
        System.out.println("**********************************");


    }
}
