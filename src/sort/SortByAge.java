package sort;
import person.Person;

import java.util.ArrayList;
import java.util.Collections;

public class SortByAge
{
    public static ArrayList<Person> execute(ArrayList<Person> arrayList)
    {
        Collections.sort(arrayList,(Person p1, Person p2) -> p1.getAge() < p2.getAge() ? -1 : p1.getAge()==p2.getAge() ? 0 : 1);
        return arrayList;
    }
}
