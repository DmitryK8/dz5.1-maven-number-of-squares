package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrServiceTest {

    @Test
     void shouldSqrInside() {
        SqrService service = new SqrService();
        int min = 200;
        int max = 300;
        int expected = 3;

        long actual = service.service(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrNotInside() {
        SqrService service = new SqrService();
        int min = 100;
        int max = 200;
        int expected = 5;

        long actual = service.service(min, max);

        assertEquals(expected, actual);

    }
}