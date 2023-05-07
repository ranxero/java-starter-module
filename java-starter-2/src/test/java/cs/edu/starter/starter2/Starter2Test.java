/**
 * 
 */
package cs.edu.starter.starter2;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.TestInstance.Lifecycle;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author c. schluessel
 *
 */
@ExtendWith(value = { MockitoExtension.class })
@TestInstance(value = Lifecycle.PER_CLASS)
public class Starter2Test {

	@BeforeAll
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testMockmockDelegate() {
	}

}
