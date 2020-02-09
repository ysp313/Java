import java.util.*;

class Step1 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

        List<Integer> listFiltered = new ArrayList<>();

        for (Integer item : list) {
            if (item % 2 == 0) {
                listFiltered.add(item);
            }
        }
        System.out.println(listFiltered.toString());
    }
}