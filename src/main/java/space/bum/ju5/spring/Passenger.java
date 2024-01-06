package space.bum.ju5.spring;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Passenger {
  private String name;
  private Country country;
  public Passenger(String name) {
    this.name = name;
  }
}
