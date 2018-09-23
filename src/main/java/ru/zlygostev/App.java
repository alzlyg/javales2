package ru.zlygostev;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> testList = new ArrayList<String>();
        testList.add("green");
        testList.add("sleep");
        testList.add("see");
        testList.add("screen");
        testList.add("tree");
        testList.add("feed");
        testList.add("feet");
        testList.add("teen");
        testList.add("leep");
        testList.add("teeth");
        testList.add(1, "tree");
        testList.add(10, "see");
        WorkWithStringList AnalyzeString = new WorkWithStringList();
        AnalyzeString.Analyze(testList);

        // ТЕЛЕФОННЫЙ СПРАВОЧНИК
        Phonebook phones = new Phonebook();
        phones.add("Ivanov", "347212");
        phones.add("Sidorov", "324739");
        phones.add("Petrov", "334745");
        phones.add("Hromov", "313645");
        phones.add("Golubev", "344433");
        phones.add("Ivanov", "312352");
        phones.add("Petrov", "374432");
        System.out.println("Телефоны на фамилии Ivanov - " + phones.get("Ivanov"));
    }
}
