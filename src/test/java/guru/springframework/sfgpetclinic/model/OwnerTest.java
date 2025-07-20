package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

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
    }

}