package DataStructureWithMosh.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class BalancedString {
    public static void main(String[] args) {
        Compare compare  = new Compare();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compare.compare(str));
    }
}
class Compare{

    private final List<Character> leftBrackets = Arrays.asList('{','<','(','[');
    private final List<Character> rightBrackets = Arrays.asList('}','>',')',']');

    public boolean compare(String str){
        Stack<Character> stack  = new Stack<>();
        for(char ch: str.toCharArray()){
            if(isLeftBracket(ch)){
                stack.push(ch);
            }
            if(isRightBracket(ch)){
                if(stack.empty()) return false;

                char top = stack.pop();
                if(bracketNotMatch(top , ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    public boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    public boolean bracketNotMatch(char left , char right){
        return (leftBrackets.indexOf(left)!=rightBrackets.indexOf(right));
    }

}


