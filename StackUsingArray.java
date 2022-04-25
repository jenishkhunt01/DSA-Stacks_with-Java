package DataStructureWithMosh.Stacks;

import java.util.Arrays;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        System.out.println(Arrays.toString(stack.array));
        System.out.println(stack.peeK());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }
}
class Stack{


    public Stack(int length){

    }

    int [] array = new int[10];
    int count=0;
    public void push(int value){
        array[count++] = value;
    }
    public int pop(){
        int top =array[count-1];
        array[count-1]=0;
        count--;
        return top;
    }

    public boolean isEmpty(){
        return count==0;
    }
    public int peeK(){
        return array[count-1];
    }

    @Override
    public String toString(){
        String str="";
        for(int i=0 ; i< count ; i++){
            str+=" "+array[i]+" ";
        }
        return str;
    }
}

