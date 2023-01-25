class Solution {
/*
 This buildArray function uses a for loop to iterate through the elements of the input array.
In each iteration, the element at the current index "i" of the input array "nums" is used as an index to access the element at that index in the input array "nums" again.
The value at that index is then assigned to the corresponding index in the new array "ans".
Time complexity O(n) , where n is the number of elements in the array
*/
    public int[] buildArray(int[] nums) {
        int [] ans =new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

// 1920.Build Array from Permutation
