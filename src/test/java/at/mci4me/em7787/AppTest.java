package at.mci4me.em7787;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

/**
 * Unit test for a simple App.
 */
public class AppTest {


    @BeforeAll
    static void setupAll() {
        System.out.println("Starte die Tests");
    }

    @BeforeEach
    void setup() {

        System.out.println("Ein neuer Test startet.");
    }

    @Test
    void testSumPositiveNumbers() {
        System.out.println("Test: testSumPositiveNumbers");
        assertEquals(5, App.sum(2, 3), "Die Summe von 2 und 3 sollte 5 sein.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Ein Test ist beendet.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Alle Tests sind beendet.");
    }
}
