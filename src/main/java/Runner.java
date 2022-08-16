import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2,"Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands, Collator.getInstance());
//        9. Print out all the islands using a for loop
        for (int i = 0; i < scottishIslands.size(); i++){
            String island = scottishIslands.get(i);
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size();i++){
            Integer number = numbers.get(i);
            if (number%2 ==0){
            evenNumbers.add(number);}
        }
        System.out.println(evenNumbers);
//        2. Print the difference between the largest and smallest value
      //  Collections.sort(numbers);
       // Integer range = (numbers.get(numbers.size()-1) -numbers.get(0));
       // System.out.println(range);
//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == 1 && numbers.get(i) == numbers.get(++i)){
                System.out.println("True");
            }
        }
//        4. Print the sum of the numbers,
        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        System.out.println(sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
        int newSum = 0;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == 13){
               newSum = ( sum - (numbers.get(i) + numbers.get(++i)));
            }
        }
        System.out.println(newSum);
//
//          So [7, 13, 2] would have sum of 9.
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(7);
        test.add(9);
        test.add(1);
        test.add(1);

        for (int i = 0; i < test.size(); i++){
            if (test.get(i) == 1 && test.get(i) == test.get(++i)){
                System.out.println("True");
            }
        }



    }

}
