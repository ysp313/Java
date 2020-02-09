import java.util.*;
import java.util.function.Predicate;

class Step4 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

        List<Integer> listFiltered = filter(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer item) {
                return item % 2 == 0;
            }
        });
        
        System.out.println(listFiltered.toString());
    }

    private static List<Integer> filter(List<Integer> list, Predicate<Integer> keep) {
        List<Integer> listFiltered = new ArrayList<>();
        for (Integer item : list) {
            if (keep.test(item)) {
                listFiltered.add(item);
            }
        }
        return listFiltered;
    }
}