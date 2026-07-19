class Solution {
    public int firstSearch(int[] arr, int target) {
        // Code Here
        int low=0;int high= arr.length-1;int idx=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<target) low= mid+1;
            else if(arr[mid]>target) high=mid -1;
            else {
                idx=mid;
                high=mid-1;
            }
        }
        return idx;
    }
}