package ru.zlygostev;

import java.util.ArrayList;

public class Phonebook {
    ArrayList<String> listLastname = new ArrayList<String>();
    ArrayList<String> listNumber = new ArrayList<String>();

    public void Phonebook() {
    }

    public void add(String lastname, String number) {
        listLastname.add(lastname);
        listNumber.add(number);
    }

    public ArrayList<String> get(String lastname) {
        ArrayList<String> lastnameNumbers = new ArrayList<String>();
        for(int i=0; i<listLastname.size(); i++)
            if (listLastname.get(i) == lastname) {
                lastnameNumbers.add(listNumber.get(i));
            }

        return(lastnameNumbers);
    }
}
