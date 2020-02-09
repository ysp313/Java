import java.util.*;

class Step3 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

        List<Integer> listFiltered = filter(list, new Keep() {

            @Override
            public boolean test(Integer item) {
                return item % 2 == 0;
            }
        });
        
        System.out.println(listFiltered.toString());
    }

    private static List<Integer> filter(List<Integer> list, Keep keep) {
        List<Integer> listFiltered = new ArrayList<>();
        for (Integer item : list) {
            if (keep.test(item)) {
                listFiltered.add(item);
            }
        }
        return listFiltered;
    }

    private interface Keep {

        boolean test(Integer item);
    }
}