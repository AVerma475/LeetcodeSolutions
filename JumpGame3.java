class Solution {
    public boolean canReach(int[] arr, int start) {
        LinkedList<Integer> que = new LinkedList<>();                
        que.addLast(start);                                  
        while(que.size() !=0){
            int s = que.size();
            while(s-- > 0){
                int x = que.removeFirst();  
                if(arr[x] == 0)return true;                    
                
                int right = x + arr[x];
                int left = x - arr[x];
                arr[x] = -1;
                if(right < arr.length && right >=0 && arr[right]!=-1){
                    que.addLast(right);}
                 if(left >=0 && left <arr.length&& arr[left]!=-1){
                    que.addLast(left);}
            }
        }
        return false;
    }
}
