
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testing {

	private API API;
	private String id = "6918387";

	@Before
	public void setUp() throws Exception {
		API = new API();
	}

	@Test
	public void testingElse() {
		String id = API.toPost(ownerId);
		assertTrue(API.toPost(ownerId, id));
	}

	@Test
	public void Testi() {
		String message = "Test 2";
		String id2 = API.wallPost(ownerId, message);
		int i = 1;
		assertTrue(Integer.parseInt(editThePost(ownerId, id2)) == i);
	}

	@Test
	public void deleteHealthCheckTest() {
		String id3 = API.wallPost(id3);
		int i = 1;
		assertTrue(Integer.parseInt(DeletethePost(ownerId, id3)) == i);

	}

	@After
	public void tearDown() throws Exception {
	}

}
