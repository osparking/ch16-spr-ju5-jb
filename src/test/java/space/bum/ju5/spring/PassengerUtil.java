package space.bum.ju5.spring;

public class PassengerUtil {
  public static Passenger getExistingPassenger() {
    Passenger passenger = new Passenger("김철수");
    passenger.setCountry(new Country("대한민국", "KR"));
    return passenger;
  }
}
