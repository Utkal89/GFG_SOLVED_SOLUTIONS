class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int l=0;int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int correctno= mid+1;
            int missingnumbers=arr[mid] - correctno;
            if(missingnumbers>=k) h=mid-1;
            else l=mid+1;
        }
        return h+k+1;
    }
}