package space.bum.ju5.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static space.bum.ju5.spring.PassengerUtil.getExistingPassenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
class SpringAppTest {

  @Autowired
  private Passenger passenger;
  private static Passenger expectedPassenger;

  @BeforeEach
  void setUp() {
    expectedPassenger = getExistingPassenger();
  }

  @Test
  void testPassengerInContextIsOk() {
    assertEquals(expectedPassenger, passenger);
    System.out.println(passenger);
  }
}
