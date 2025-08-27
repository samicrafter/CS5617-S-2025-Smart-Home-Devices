
import org.example.smarthome.devices.Light;
import org.example.smarthome.devices.SimpleSwitch;
import org.example.smarthome.interfaces.Switchable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class LightTest {
    private Light smartLight;
    private SimpleSwitch simpleSwitch;

    @BeforeEach
    void setUp() {
        smartLight = new Light("Test Smart Light");
        simpleSwitch = new SimpleSwitch("Test Switch");

    }

    @Test
    @DisplayName("Smart Light implements only necessary interfaces")
    void testSmartLightInterfaces() {
        assertTrue(smartLight instanceof Switchable, "SmartLight should be Switchable");
    }

    @Test
    @DisplayName("Simple Switch implements minimal interfaces")
    void testSimpleSwitchInterfaces() {
        assertTrue(simpleSwitch instanceof Switchable, "SimpleSwitch should be Switchable");
    }

    @Test
    @DisplayName("Device switching functionality")
    void testSwitchingFunctionality() {
        assertFalse(smartLight.isOn(), "Device should start OFF");

        smartLight.turnOn();
        assertTrue(smartLight.isOn(), "Device should be ON after turnOn()");

        smartLight.turnOff();
        assertFalse(smartLight.isOn(), "Device should be OFF after turnOff()");
    }
}