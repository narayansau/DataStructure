package com.june13_2019.ds.myLearning_Java;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Person{

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public static void printPersonsOlderThan(List <Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(
            List <Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static <X, Y> void processElements(
            Iterable <X> source,
            Predicate <X> tester,
            Function <X, Y> mapper,
            Consumer <Y> block) {
        for (X p : source) {
            if (tester.test( p )) {
                Y data=mapper.apply( p );
                block.accept( data );
            }
        }
    }

    public static void printPersons(
            List <Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test( p )) {
                p.printPerson();
            }
        }
    }

    public int getAge() {
        // ...
        return (int) 1;
    }

    public void printPerson() {
        // ...
    }

    public enum Sex{
        MALE, FEMALE
    }

    interface CheckPerson{
        boolean test(Person p);
    }

    class CheckPersonEligibleForSelectiveService implements CheckPerson{
        public boolean test(Person p) {
            return p.gender == Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

}

