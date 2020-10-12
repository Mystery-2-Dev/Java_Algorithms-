import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);


        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);


        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();


        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);


        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers);

        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);
    }
}