import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SomeClass {

    Map parenthesisMap;

    SomeClass(){
        parenthesisMap = new HashMap<Character, Character>();
        parenthesisMap.put(')', '(');
        parenthesisMap.put(']', '[');
        parenthesisMap.put('}', '{');
    }
    //O(n)
    //n
    boolean isBalanced(String expression){
        Stack openedParenthesisStack = new Stack();

        if(expression == null || expression.length() % 2 != 0 || expression.isEmpty())
            return false;

        for(int i = 0; i < expression.length(); i++){
            char currentCheckedPar = expression.charAt(i);

            if(isOpenedParenthesis(currentCheckedPar)){
                openedParenthesisStack.push(currentCheckedPar);
            } else {
                if(openedParenthesisStack.empty()) {
                    return false;
                } else {
                    char lastOpenedPar = (char)openedParenthesisStack.peek();
                    char pair = (char)parenthesisMap.get(currentCheckedPar);

                    if(lastOpenedPar == pair){
                        openedParenthesisStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return openedParenthesisStack.empty();
    }

    boolean isOpenedParenthesis(char p){
        if(p == '(' || p == '{' || p == '[')
            return true;

        return false;
    }

}


