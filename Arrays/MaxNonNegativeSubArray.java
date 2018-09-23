public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> currList = new ArrayList<>();
		int currSum = 0, maxSum = 0;
		for(int i = 0; i< A.length; i++) {
			if(A[i] >= 0){
				currSum +=A[i];
				currList.add(A[i]);
			} else {
				currSum = 0;
				currList = new ArrayList<>();
			}
			if(maxSum < currSum || (maxSum == currSum) || (result.length < currList.length)){
				maxSum = currSum;
				result = currList;
			}
		} 
		return result;
    }
}
