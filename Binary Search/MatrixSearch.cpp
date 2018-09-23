/*Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Example:

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem
*/
int Solution::searchMatrix(vector<vector<int> > &A, int B) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int row = A.size();
    int col = A[0].size();
    int krow = -1;
    for(int i=0;i<row; i++){
        if(B >= A[i][0] && B<=A[i][col-1]){
            krow = i;
            break;
        }
    }
    if(krow == -1)
        return 0;
    int left = 0, right = col - 1;
    while(left <= right){
        int mid = left + (right - left)/2;
        if(A[krow][mid] == B)
            return 1;
        if(A[krow][mid] < B)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return 0;
}
