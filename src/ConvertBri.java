import java.util.Stack;

public class ConvertBri {
    public void convertBi(int num){
        Stack<Integer> stack = new Stack<>();
        while (num != 0){
            int number = num%2;
            stack.push(number);
            num/=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
