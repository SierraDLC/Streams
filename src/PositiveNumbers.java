
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(18);
        list.add(12);

        System.out.println(positive(list));
       


    }

    public static List<Integer> positive(List<Integer> numbers){
               
        List<Integer> values = numbers.stream()
                  
                        .filter(value -> value%2==0)
       
                        .collect(Collectors.toList());
                 return values;
            }


}
