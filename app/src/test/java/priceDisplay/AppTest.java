/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package priceDisplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void getPriceLabel() {
        App priceItem = new App();
        assertEquals("should display an item and a price", String.valueOf("A plant is £15"), priceItem.getPriceLabel(15, "plant"));
    }
}
