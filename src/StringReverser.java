import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        Stack<Character> stack = new Stack<>();
//        inserting elements into stack by using push method
//        simpler way:
//        for (int i=0; i< input.length();i++){
//            stack.push(input.charAt(i));
//        }
//        smart way
        for (char ch : input.toCharArray())
            stack.push(ch);
//        reversing by poping out the elements from stack (lifo)
//        method 1 : the simpler way , but wont be efficient for the large strings
//        String reversed ="";
//        while(!stack.empty()){
//            reversed+=stack.pop();
//        }
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty())
            reversed.append(stack.pop());
        return reversed.toString();
    }
}
