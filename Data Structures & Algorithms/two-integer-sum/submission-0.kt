class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var resultArray = IntArray(2)
       for(i in 0 until nums.size){
        for(j in i+1 until nums.size){
            if(nums[i]+nums[j]==target) {
                resultArray[0] =i;
                resultArray[1] =j;
                return resultArray;
            }
        }
       }
       return resultArray;
    }
}
