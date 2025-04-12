import java.util.LinkedList;

import java.util.Scanner;

public class Manager {
    private static LinkedList<String> equation = new LinkedList<>();

    public static void inputNotation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an equation in Polish notation: (+ 3 * 2 2)");
        String line = input.next();
        addTo(line);
    }

    public static LinkedList<String> addTo(String line) {
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
    public static int eval(LinkedList<String> equation) {

        switch(equation.peek()) {
            case "+":
            case "-":
            case "*":
            case "/":
            default: return Integer.parseInt(equation);
        }
    }
    public LinkedList<String> getQueue(){
        return equation;
    }
}
