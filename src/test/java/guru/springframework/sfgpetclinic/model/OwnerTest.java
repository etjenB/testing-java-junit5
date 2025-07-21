package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Joe", "Bucks");
        owner.setCity("Kanye West");
        owner.setTelephone("123456789");

        assertAll("Properties test",
                () -> assertAll("Person properties",
                        () -> assertEquals("Joe", owner.getFirstName()),
                        () -> assertEquals("Bucks", owner.getLastName())),
                () -> assertAll("Owner properties",
                        () -> assertEquals("Kanye West", owner.getCity()),
                        () -> assertEquals("123456789", owner.getTelephone()))
        );

        assertThat(owner.getCity(), is("Kanye West"));
    }

}