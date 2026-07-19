class Solution {
    public boolean binarySearch(int[] arr, int target) {
        // code here
        int low = 0,high=arr.length-1;
        boolean isbinary = true;
        while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]<target) low = mid+1;
           else if(arr[mid]>target) high=mid-1;
           else return true;
        }
        return false;
    }
}