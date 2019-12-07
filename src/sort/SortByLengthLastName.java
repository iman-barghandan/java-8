package sort;

import person.Person;

import java.util.ArrayList;
import java.util.Collections;

public class SortByLengthLastName
{
    public static ArrayList<Person> execute(ArrayList<Person> arrayList)
    {
        Collections.sort(arrayList,(Person p1, Person p2) -> p1.getLastName().length() < p2.getLastName().length() ? -1 : p1.getLastName().length()==p2.getLastName().length() ? 0 : 1);
        return arrayList;
    }
}
