class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var bestRepeative = 0
        var currentRepeative = 0
        for(num in nums){

            if(num != 1){
                if(currentRepeative>bestRepeative){
                    bestRepeative = currentRepeative 
                }
                 currentRepeative = 0
            }
            
            if(num == 1){
                currentRepeative += 1
                if(currentRepeative>bestRepeative){
                     bestRepeative = currentRepeative
                }
            }
        }
        return bestRepeative
    }
}
