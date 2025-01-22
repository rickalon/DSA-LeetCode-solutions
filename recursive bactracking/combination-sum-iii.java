class Solution {
    private List<Integer> aux;
    private List<List<Integer>> ans;
    private int k;
    private int target;
    public List<List<Integer>> combinationSum3(int k, int n) {
    aux = new LinkedList<>();
    ans = new ArrayList<>();
    this.k = k;
    target = n;
    resolve(0,1);
    return ans;
    }
    public void resolve(int sum,int num){
    if(aux.size()==k){
        if(sum==target)
            ans.add(new ArrayList<>(aux));
        return;
    }
    if(num==10){
        return;
    }
    resolve(sum,num+1);

    aux.add(num);
    resolve(sum+num,num+1);
    aux.removeLast();
    }
}
