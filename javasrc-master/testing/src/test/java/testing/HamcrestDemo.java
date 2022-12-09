package testing;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import domain.Person;

// tag::main[]
public class HamcrestDemo {

	@Test
	public void testNameConcat() {
		Person p = new Person("Ian", "Darwin");
		String f = p.getFullName();
		assertThat(f, containsString("Ian"));
		assertThat(f, equalTo("Ian Darwin"));
		assertThat(f, not(containsString("/"))); // contrived, to show syntax
	}
}
// end::main[]
