package ru.netology.sqr;

public class SqrService {

    public long service(int min, int max) {
        int index;
        index = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= min && square <= max) {
                index = index + 1;
            }
        }
        return index;
    }
}
