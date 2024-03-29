public int hIndex(int[] citations) {
        int n = citations.length;
        int left=0;
        int right = citations.length -1 ;
        
        //Binary Search
        while(left <= right){
            int mid = (left+right) /2;
            if(citations[mid] == n-mid){
                return citations[mid];
            }         
            if(citations[mid]< n-mid){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return n-left;
}
