package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqr() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqrtCeil(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSqr() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.sqrtCeil(100, 9801);
        assertEquals(expected, actual);
    }

    @Test
    void shouldOneSqr() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.sqrtCeil(100, 110);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTwoSqr() {
        SQRService service = new SQRService();
        int expected = 2;
        int actual = service.sqrtCeil(200, 260);
        assertEquals(expected, actual);
    }
}