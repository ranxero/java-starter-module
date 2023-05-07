/**
 * 
 */
package cs.edu.starter.starter1;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import cs.edu.starter.starter1.exception.BitsAreNullException;

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
public class Starter1Test {

	@Mock
	private Delegate mockDelegate;

	private Delegate realDelegate;
	
	@BeforeAll
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		realDelegate = new Delegate();
	}

	@Test
	public void testMockmockDelegate() throws BitsAreNullException {
		when(mockDelegate.converstBitsToDecimal(null)).thenReturn(28);
		when(mockDelegate.converstBitsToDecimal(new int[]{1})).thenReturn(17);

		assertEquals(28, mockDelegate.converstBitsToDecimal(null));
		assertEquals(17, mockDelegate.converstBitsToDecimal(new int[]{1}));

		assertAll("testAll",
				() -> assertEquals(28, mockDelegate.converstBitsToDecimal(null)),
				() -> assertEquals(17, mockDelegate.converstBitsToDecimal(new int[]{1})));
	}

	@Test
	public void testRealDelegate() throws BitsAreNullException {
		assertEquals(77, realDelegate.converstBitsToDecimal(new int[]{0, 1, 0, 0, 1, 1, 0, 1}));
	}
	
	@Test
	public void delegateThrowsException() {
	    assertThrows(BitsAreNullException.class,
	            ()->{
	            	realDelegate.converstBitsToDecimal(null);
	            });
	}
}
