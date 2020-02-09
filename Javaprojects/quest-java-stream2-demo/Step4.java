import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Step4 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kari", "Parmentier"),
                new Person("Gérard", "Laurent"),
                new Person("Apolline", "Truchon")
        ));

        List<String> listMapped = map(list, new Function<Person, String>() {
            @Override
            public String apply(Person item) {
                return item.getFirstName() + " " + item.getLastName();
            }
        });

        System.out.println(listMapped.toString());
    }

    private static List<String> map(List<Person> list, Function<Person, String> concat) {
        List<String> listMapped = new ArrayList<>();
        for (Person item : list) {
            listMapped.add(concat.apply(item));
        }
        return listMapped;
    }
}