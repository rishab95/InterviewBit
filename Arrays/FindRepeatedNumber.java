// Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

// Sample Input:

// [3 4 1 4 1]
// Sample Output:

// 1
// If there are multiple possible answers ( like in the sample case above ), output any one.

// If there is no duplicate, output -1

public class FindRepeatedNumber{
	public int solution(final List<Integer> nums){
		Set<Integer> seenSet = new HashSet<Integer>();
		for(int num : nums){
			if(seenSet.contains(num)){
				return num;
			}
			seenSet.add(num);
		}
		return -1;
	}
}