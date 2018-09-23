package ru.zlygostev;

import java.util.ArrayList;

public class WorkWithStringList {
    public void WorkWithStringList() {
    }

    public void Analyze(ArrayList<String> inList) {
        ArrayList<String> resultList = new ArrayList<String>();
        ArrayList<Integer> resultCount = new ArrayList<Integer>();

        for(int i=0; i<inList.size(); i++){
            // Проверяем есть ли данный элемент i из inList в resultList
            if (resultList.contains(inList.get(i))) {
                int j = resultList.indexOf(inList.get(i));
                resultCount.set(j, resultCount.get(j)+1);
                continue;
            }

            // Т.к. элемент i из inList в resultList отсутствует, то добавляем его
            resultList.add(inList.get(i));
            resultCount.add(1);
        }

        // Выводим результат работы
        for(int i=0; i<resultList.size(); i++) {
            System.out.println(resultList.get(i) + " - " + resultCount.get(i));
        }
    }
}
