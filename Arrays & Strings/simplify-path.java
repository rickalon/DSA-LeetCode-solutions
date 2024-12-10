class Solution {
    public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    StringBuilder str = new StringBuilder();
    char[] pathArray = path.toCharArray();
    for(int i = 1 ; i < pathArray.length;i++)
    {   
        char c = pathArray[i];
        if(c == '/'){
            stack.push(str.toString());
            str = new StringBuilder();
            while(i+1 < pathArray.length && pathArray[i+1]=='/'){
                    i++;
            }      
        }else{
            str.append(c);
        }
        
    }
    if(!str.isEmpty()){
        stack.push(str.toString());
    }
    
    String result = "";
    int eliminar =0;
    while(!stack.isEmpty()){
    if(stack.peek().equals("")){
        stack.pop();
    }else{
        if(stack.peek().equals("..")){ 
                stack.pop();
                eliminar++;
        }else if(stack.peek().equals(".")){
                stack.pop();
        }else{
            if(eliminar==0){
                result = stack.pop()+((result.isEmpty())?"":("/"+result));
            }else{
                eliminar--;
                stack.pop();
            }
        }
    }
    }
    return "/"+result;
    }
}
