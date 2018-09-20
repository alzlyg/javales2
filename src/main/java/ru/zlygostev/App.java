package ru.zlygostev;

/**
 * Суммирование массива
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[][] inArray = {
                {"1", "12", "13", "14"},
                {"2", "21", "22", "23"},
                {"3", "32", "33", "34"},
                {"4", "41", "42", "43"}};
        ArraySum ar = new ArraySum();
        try {
            int sum = ar.analyzeAr(inArray);
            System.out.println("Сумма всех элементов массива = " + sum);
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
