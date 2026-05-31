class Solution {
    fun countSeniors(details: Array<String>): Int {
        var result = 0
        for(passenger in details){
            var age = passenger.substring(11,13).toInt()
            if(age>60){
                result += 1
            }
        }
        return result
    }
}
