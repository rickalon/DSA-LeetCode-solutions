class Trie{
    Trie[] trie;
    boolean isEnd;
    public Trie(){
        trie = new Trie[26]; 
        isEnd = false;
    }

    public void insert(String word){
        Trie root = this;
        for(char c : word.toCharArray()){
            if(root.trie[c-'a']==null){
                root.trie[c-'a'] = new Trie();
            }
            root = root.trie[c-'a'];
        }
        root.isEnd = true;
    }
    public boolean startsWith(String word){
        Trie root = this;
        for(char c : word.toCharArray()){
            if(root.trie[c-'a']==null){
                return false;
            }
            root = root.trie[c-'a'];
        }
        return true;
    }

    public boolean search(String word){
        Trie root = this;
        for(char c : word.toCharArray()){
            if(root.trie[c-'a']==null){
                return false;
            }
            root = root.trie[c-'a'];
        }
        return root.isEnd;
    }
}

class Solution {
    private char[][] board;
    private int n,m;
    private int[][] currentPath;
    Set<String> ans;
    StringBuilder str;
    Trie trie;

    public List<String> findWords(char[][] board, String[] words) {
    int n = board.length;
    int m = board[0].length;
    this.n =n;
    this.m =m;
    this.board = board;
    currentPath = new int[n][m];
    ans = new HashSet<>();
    str = new StringBuilder();
    trie = new Trie();

    for(String w : words){
        trie.insert(w);
    }

    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            currentPath[i][j]=1;
            resolve(i,j);
            currentPath[i][j]=0;
        }
    }

    return new ArrayList<>(ans);
    }

    private void resolve(int i, int j){
    char letter = board[i][j];
    str.append(letter);
    String prefix = str.toString();

    if(!trie.startsWith(prefix)){
        str.deleteCharAt(str.length()-1);
        return;
    }else{
        if(trie.search(prefix))
            ans.add(prefix);
    }

    if(j+1 < m && currentPath[i][j+1]==0){
    currentPath[i][j+1]=1;
    resolve(i,j+1);
    currentPath[i][j+1]=0;
    }
    if(j-1>=0 && currentPath[i][j-1]==0){
    currentPath[i][j-1]=1;
    resolve(i,j-1);
    currentPath[i][j-1]=0;
    }
    if(i+1<n && currentPath[i+1][j]==0){
    currentPath[i+1][j]=1;
    resolve(i+1,j);
    currentPath[i+1][j]=0;
    }
    if(i-1>=0 && currentPath[i-1][j]==0){
    currentPath[i-1][j]=1;
    resolve(i-1,j);
    currentPath[i-1][j]=0;
    }
    str.deleteCharAt(str.length()-1);
    return;
    }
}
