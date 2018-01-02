import java.util.List;

public class Test {
    public static void main(String[] args) {



        ListAssistant listAssistant = new ListAssistant();

        listAssistant.createNewList();

        listAssistant.fillByConsole();

        System.out.println(listAssistant.getList().toString());

        List<Integer> reversed = listAssistant.reverseList();

        System.out.println(reversed.toString());

        int sum = listAssistant.calculateSum();

        System.out.println(listAssistant.findGreatest());
        System.out.println(listAssistant.findLeast());
    }
}
