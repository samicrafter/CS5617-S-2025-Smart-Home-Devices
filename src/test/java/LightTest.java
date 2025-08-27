
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.smarthome.devices.Light;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightTest {

    private Light light;

    @BeforeEach
    void setUp() {
        light = new Light();
    }

    @Test
    void testInitialStateIsOff() {
        assertFalse(light.isOn(), "Light should be off initially.");
    }

    @Test
    void testTurnOnSetsIsOnToTrue() {
        light.turnOn();
        assertTrue(light.isOn(), "Light should be on after calling turnOn().");
    }

    @Test
    void testTurnOffSetsIsOnToFalse() {
        light.turnOn();
        light.turnOff();
        assertFalse(light.isOn(), "Light should be off after calling turnOff().");
    }
}