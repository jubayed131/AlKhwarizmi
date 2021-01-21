package stacks_queues;

import java.util.Stack;

public class Brackets {
    public static int solution(String s){
        if(s.length()%2!=0){
            return 0;
        }// adding odd number of strings can not be properly nested.
        Stack<Character> stringStack=new Stack<Character>();

        for(int i=0;i<s.length();i++){
            char chCurrent=s.charAt(i);
            if(isOpeningBracket(chCurrent)){
                stringStack.push(chCurrent);
            }else{
                //adding closing bracket to the empty stack can not be properly nested.
                if(stringStack.size()==0) return 0;
                char chPop=stringStack.pop();
                if(isBracketMatch(chPop,chCurrent)) {continue;}
                else{
                    return 0;
                }

            }

        }
        if(stringStack.isEmpty()) return 1;

        return 0;
    }

    static boolean isOpeningBracket(char ch){
        if(ch=='[' || ch=='{' || ch=='(') {
            return true;
        }
        return false;
    }

    static boolean isBracketMatch(char ch1,char ch2){
        if(ch1=='[' && ch2==']') return true;
        if(ch1=='{' && ch2=='}') return true;
        if(ch1=='(' && ch2==')') return true;
        return false;

    }

    public static void main(String[] args){
        System.out.println(solution("{[()()]}"));
        System.out.println(solution("{[()()[}"));
    }

}
