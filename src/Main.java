import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Весь список елементів: ");
        printList(list);

        System.out.printf("\n\nВСТАВКА\n");
        list = new LinkedList<>(Arrays.asList(41, 71, 25, 24, 60, 68, 26, 4, 77, 12, 52,
                62, 21, 31, 30));
        System.out.print("Новий оновлений список елементів: ");
        printList(list);

        System.out.printf("\n\nПОШУК\n");
        System.out.println("Індекс числа 68: " + list.indexOf(68));
        System.out.println("Індекс числа 12: " + list.indexOf(12));
        System.out.println("Індекс числа 30: " + list.indexOf(30));
        System.out.println("Найменьше число в списку: " + getMin(list));

        System.out.print("\nВидалення\n");
        System.out.print("Весь список елементів до: \t");
        printList(list);
        list.remove(list.indexOf(41));
        list.remove(list.indexOf(25));
        list.remove(list.indexOf(60));
        System.out.print("\nпісля видалення 41, 25, 60: ");
        printList(list);

    }

    public static void printList(List<Integer> list){
        if (list.size() > 0){
            System.out.print("{");
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size()-1) {
                    System.out.print(list.get(i) + ", ");
                } else {
                    System.out.print(list.get(i) + "}");
                }
            }
        } else {
            System.out.print("{ }");
        }
    }

    public static int getMin(List<Integer> list) {
        int min = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}