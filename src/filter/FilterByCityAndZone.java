package filter;

import person.Person;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterByCityAndZone
{
    public static Stream<Person> execute(ArrayList<Person> arrayList , String city , int zone)
    {
        Predicate<Person> personPredicate = s-> s.getAddress().getCity().equals(city) && s.getAddress().getZone()<zone;
        Stream<Person> sp = arrayList.stream().filter(personPredicate);
        return sp;
    }
}
