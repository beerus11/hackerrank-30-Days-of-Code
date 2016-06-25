public class Solution {
    // Write your code here.
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<Character>();
    void pushCharacter(char ch)
        {
        stack.push(ch);
    }
     void enqueueCharacter(char ch){
        queue.add(ch);
     }
    char popCharacter() {
        return stack.pop();
    }

    char dequeueCharacter()
        {
        return queue.remove();
    }
