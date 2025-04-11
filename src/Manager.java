import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Manager {
    private static Queue<String> equation = new LinkedList<>();

    public static void inputNotation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an equation in Polish notation: (+ 3 * 2 2");
        String line = input.next();
        addTo(line);
    }

    public static Queue<String> addTo(String line) {
        int i = 0;

        if (i == line.length() - 1) {
            return equation;
        } else {
            equation.add(String.valueOf(line.charAt(i)));
            i++;
            addTo(line);
        }
        return equation;
    }
    public static void eval(Queue<String> equation) {
        int add = 0;
        int minus = 0;
        switch(equation.peek()) {
            case "+": add += Integer.parseInt(equation.poll();
            case "-": minus += equation.poll(nextInt());
        }
    }
    public Queue<String> getQueue(){
        return equation;
    }
}
