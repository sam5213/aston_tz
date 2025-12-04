import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        try {
            for (int i : numbers) {
                if (i % 2 == 0) {
                    arrayList.add(i);
                }
            }

            System.out.println(arrayList);

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            return;
        }
    }
}
