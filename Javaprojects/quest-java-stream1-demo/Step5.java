import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Step5 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

        List<Integer> listFiltered = list.stream()
        .filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer item) {
                return item % 2 == 0;
            }
        })
        .collect(Collectors.toList());
        
        System.out.println(listFiltered.toString());
    }
}