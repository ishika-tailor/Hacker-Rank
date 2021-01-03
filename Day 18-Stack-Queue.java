//day 18 stack and queue 
//editorial
import java.util.LinkedList;
public class Queue{
    LinkedList que;
    public Queue{
        que=new LinkedList();
    }
    public boolean isEmpty(){
        return que.isEmpty();
    }
    public int deque(){
        return (int) que.remove(0);
    }
    public add(int n){
        que.addLast(n);
    }
    public int size(){
        return que.size();
    }
    public int peek(){
        return (int) que.get(0);
    }

     public static void main(String []args){
        Queue q=new Queue();
        q.add(5);
        q.add(6);
        System.out.println(q.peek());
        System.out.println(q.size());
        
     }
}

Stack<String> sticky=new Stack<>();
Queue<String> queue=new Queue<>();

//Tutorial
#include <vector>
#include <deque>

using namespace std;

class Solution {
    
    private:
    vector<char>stack;
    deque<char>queue;
    int p = 0;
    int q = 0;
    public:
    char pushCharacter(char c){
       stack.push_back(c);
       return NULL;
    }
    char enqueueCharacter(char c){
        //fifo
        queue.push_front(c);
        return NULL;
    }
    char popCharacter(){
        return stack[p++];
    }
    char dequeueCharacter(){
        return queue[q++];
    }
};

int main() {
    // read the string s.
    string s;
    getline(cin, s);
    
    // create the Solution class object p.
    Solution obj;
    
    // push/enqueue all the characters of string s to stack.
    for (int i = 0; i < s.length(); i++) {
        obj.pushCharacter(s[i]);
        obj.enqueueCharacter(s[i]);
    }
    
    bool isPalindrome = true;
    
    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (int i = 0; i < s.length() / 2; i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;
            
            break;
        }
    }
    
    // finally print whether string s is palindrome or not.
    if (isPalindrome) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }
    
    return 0;
}