class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix[0].length * matrix.length - 1;
         

        while (l <= r) {
            int m = l + ((r - l) / 2);
            if (matrix[m / matrix[0].length][m % matrix[0].length] < target) {
                l = m + 1;
            } else if (matrix[m / matrix[0].length][m % matrix[0].length] > target) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
