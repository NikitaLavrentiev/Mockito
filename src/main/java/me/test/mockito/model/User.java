package me.test.mockito.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@EqualsAndHashCode
@ToString
public class User {

    private final String name;
    private final int yearOfBorn;
    private final int years;

    public User(String name, int yearOfBorn) {
        this.name = name;
        this.yearOfBorn = yearOfBorn;
        this.years = getYears();
    }
    public User(String name, int yearOfBorn, int years) {
        this.name = name;
        this.yearOfBorn = yearOfBorn;
        this.years = getYears();
    }

    public String getName() {
        return name;
    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }

    public int getYears() {
        return LocalDate.now().getYear() - getYearOfBorn();
    }
}
