package sort;

import person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfLastName
{
    public static List<String> execute(ArrayList<Person> arrayList)
    {
        Function<Person,String> personStringFunction = s -> s.getLastName();
        Stream<String> personStream = arrayList.stream().map(personStringFunction);
        List<String> stringList = personStream.collect(Collectors.toList());
        return stringList;
    }
}
