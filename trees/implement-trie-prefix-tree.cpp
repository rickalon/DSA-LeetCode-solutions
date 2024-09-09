class Trie {
public:
    Trie():root(new Node()) {}
    
    void insert(string word) {
    Node* trav = root;
        for(char c :word){
            if(trav->children.find(c) == trav->children.end()){
                trav->children[c] = new Node();
            }
            trav = trav->children[c];
        }
    trav->eow = true;
    }
    
    bool search(string word) {
    Node* trav = root;
        for(char c :word){
            if(trav->children.find(c) == trav->children.end()){
                return false;
            }
            trav = trav->children[c];
        }
        return trav->eow;
    }
    
    bool startsWith(string prefix) {
        Node* trav = root;
        for(char c :prefix){
            if(trav->children.find(c) == trav->children.end()){
                return false;
            }
            trav = trav->children[c];
        }
        return true;
    }
private:
    struct Node {
        unordered_map<char, Node*> children;
        bool eow = false;
    };
    
    Node* root;
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */
