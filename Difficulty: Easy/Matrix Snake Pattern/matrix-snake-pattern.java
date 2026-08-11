class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix.length;j++){
                    ans.add(matrix[i][j]);
                }
            }
            else{
                    for(int j=matrix.length-1;j>=0;j--){
                        ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}