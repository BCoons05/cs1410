package labInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class test {
	
	Plane myPlane = new Plane(4, "Boing 747");
	
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
	@Test
	void launch_verifyOutput_RollingUntilTakeOff() {
		myPlane.launch();
		assertEquals("Rolling until take-off", outContent.toString());
	}
	
	@Test
	void land_verifyOutput_RollingToAStop() {
		myPlane.land();
		assertEquals("Rolling to a stop", outContent.toString());
	}
	
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

	@Test
	void toString_verifyOutput_Boing747with4engines() {
		assertEquals(myPlane.toString(), "Boing 747 with 4 engines");
	}
}
