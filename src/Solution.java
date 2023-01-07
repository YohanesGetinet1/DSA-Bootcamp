class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1;
        int sum = 0;
        while(n>0)
        {
            int rem = n % 10;
            n = n/10;
            pro = pro * rem;
            sum = sum + rem;

        }
        return pro - sum;
    }
    /* leetcode. Subtract the Product and Sum of Digits of an Integer
*
* Example:
    Input: n = 234
    Output: 15
Explanation:
    Product of digits = 2 * 3 * 4 = 24
    Sum of digits = 2 + 3 + 4 = 9
    Result = 24 - 9 = 15
*
*
* */

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(String.valueOf(sol.subtractProductAndSum(4421)));
        System.out.println(String.valueOf(sol.subtractProductAndSum(234)));
    }
}