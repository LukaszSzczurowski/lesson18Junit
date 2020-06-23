package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        return ppl.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());


    }

    //    assertThat(users, hasItem(new User("Tomek", 2, "Tomek_2")));
    public List<User> convertPeopleToUsers(List<Person> people) {
        return people.stream()
                .map(person -> new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge()))
                .collect(Collectors.toList());
    }


}
