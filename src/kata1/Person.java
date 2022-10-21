package kata1;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    private final String name;
    private final LocalDate birthdate;
    LocalDate startDate = LocalDate.parse("2017-02-13");

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getAge(){
        return (int) Period.between(birthdate, startDate).getYears();
    }
}