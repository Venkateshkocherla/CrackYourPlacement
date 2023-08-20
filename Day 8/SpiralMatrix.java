class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int top=0, left=0, right=matrix[0].length-1, bottom=matrix.length-1, i;
        while(left<=right && top<=bottom)
        {
            for(i=left; i<=right; i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            for(i=top; i<=bottom; i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(i=right; i>=left; i--)
            {
                ans.add(matrix[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for(i=bottom; i>=top; i--)
            {
                ans.add(matrix[i][left]);
            }
            left++;}
        }
    
    return ans;}
}