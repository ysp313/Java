import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Step2 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kari", "Parmentier"),
                new Person("Gérard", "Laurent"),
                new Person("Apolline", "Truchon")
        ));

        List<String> listMapped = map(list);

        System.out.println(listMapped.toString());
    }

    private static List<String> map(List<Person> list) {
        List<String> listMapped = new ArrayList<>();
        for (Person item : list) {
            listMapped.add(item.getFirstName() + " " + item.getLastName());
        }
        return listMapped;
    }
}