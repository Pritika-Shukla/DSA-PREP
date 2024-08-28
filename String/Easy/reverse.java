//using Stack

import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String str = "";
        
        // Traverse the string and push words to stack
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!str.isEmpty()) {
                    st.push(str);
                    str = "";
                }
            } else {
                str += s.charAt(i);
            }
        }
        
        // Push the last word to the stack
        if (!str.isEmpty()) {
            st.push(str);
        }
        
        StringBuilder ans = new StringBuilder();
        
        // Pop all words from the stack to form the reversed sentence
        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) {
                ans.append(" ");
            }
        }
        
        return ans.toString();
    }
}



//