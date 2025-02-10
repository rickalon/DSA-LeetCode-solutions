class Solution {
    public String clearDigits(String s) {
    Stack<Character> stack = new Stack<>();
    for(char c : s.toCharArray())
        if(c>='0' && c<='9' && !stack.isEmpty())
            stack.pop();
        else
            stack.push(c);
    if(stack.size()==0)
        return "";
    char[] ans = new char[stack.size()];
    int i = stack.size()-1;
    while(!stack.isEmpty())
        ans[i--]=stack.pop();
    return new String(ans);
    }
}
