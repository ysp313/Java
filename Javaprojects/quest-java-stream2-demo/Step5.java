import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Step5 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kari", "Parmentier"),
                new Person("Gérard", "Laurent"),
                new Person("Apolline", "Truchon")
        ));

        List<String> listMapped = list.stream()
                .map(new Function<Person, String>() {
                    @Override
                    public String apply(Person item) {
                        return item.getFirstName() + " " + item.getLastName();
                    }
                })
                .collect(Collectors.toList());

        System.out.println(listMapped.toString());
    }
}