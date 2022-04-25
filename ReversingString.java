package DataStructureWithMosh.Stacks;

import java.util.Stack;

public class ReversingString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str=null;
        if(str == null){
            throw new IllegalArgumentException();
        }
        for(int i=0 ; i< str.length(); i++){
            stack.push(str.charAt(i));
        }
        StringBuffer reverse= new StringBuffer();
        while (!stack.isEmpty()){
            reverse.append(stack.pop());
        }
        System.out.println(reverse);
    }
}
