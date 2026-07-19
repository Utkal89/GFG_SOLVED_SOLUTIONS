class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int low=0;int high=arr.length-1;int idx1=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                idx1=mid;
               high=mid-1;
             
            }
        }
        ans.add(idx1);
        low=0;
        high=arr.length-1;
        int idx2=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                idx2=mid;
                low=mid+1;
              
            }
        }
         ans.add(idx2);
        return ans;
    }
}

