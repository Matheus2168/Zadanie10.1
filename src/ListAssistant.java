
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListAssistant {

    private List<Integer> list;


    void createNewList(){
        list = new LinkedList<>();
    }

    void fillByConsole(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Podaj liczbe:");
                number = sc.nextInt();
            if (number>=0){
                list.add(number);
                System.out.println("Dodano "+number+" do listy");
            }
        }
        while (number >=0);
    }

    List reverseList(){
        List<Integer> reversed = new LinkedList<>();
        int lastIndex = list.size()-1;
        for (int i = lastIndex ; i>=0 ; i--){
            reversed.add(list.get(i));
        }
        return reversed;
    }

    int calculateSum(){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        showSum(sum);
        return sum;
    }
    private void showSum(int sum){
        String result = "";
        for (int i = 0 ; i < list.size() ; i++){
            if (i == list.size()-1){
                result += list.get(i)+" = ";
            }
            else {

                result += list.get(i)+" + ";

            }

        }
        result+= sum;
        System.out.println(result);
    }

    int findGreatest(){
        int greatest = 0;
        for (Integer integer : list) {
            if (integer > greatest){
                greatest = integer;
            }
        }
        return greatest;
    }

    int findLeast(){
        int least = list.get(0);
        for (Integer integer : list) {
            if (integer < least){
                least = integer;
            }
        }
        return least;
    }

    public List<Integer> getList() {
        return list;
    }
}
