class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new LinkedList<>();
        for(int i = 1;i<=searchWord.length();i++)
        {
            String aux = searchWord.substring(0,i);
            int left = 0;
            int right = products.length-1;
            while(left < right)
            {
                int mid = left + (right-left)/2;
                int del = products[mid].compareTo(aux);
                if(del < 0){
                    left = mid+1; 
                }else{
                    right = mid;
                }
            }
            int times = 0;
            result.add(new LinkedList<String>());
            while(left < products.length && times < 3){
            if(products[left].startsWith(aux)) {
                result.get(i-1).add(products[left]);
                times++;
            }
            left++;
            }
        }
        return result;
    }
}
