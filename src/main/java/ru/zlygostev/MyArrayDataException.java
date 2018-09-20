package ru.zlygostev;

public final class MyArrayDataException extends Exception {
    public MyArrayDataException() {
        super("Ошибка! Входной элемент не может быть преобразован в int");
    }

    public MyArrayDataException(int i, int j) {
        super("Ошибка входного элемента: " + i + " " + j);
    }
}
