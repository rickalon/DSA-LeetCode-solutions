    public static int func(int[] a,int k){
        int sol = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right < a.length){
        sum += a[right];
        if(sum > k){
           while(sum >k && left <= right){
            sum -= a[left];
            left++;
           }
        }
        sol = Math.max(right-left+1,sol);
        right++;
        }

        return sol;
    }
