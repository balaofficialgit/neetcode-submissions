class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var matched = ""
        if(strs.size == 1){
            return strs[0];
        }
        for(i in 0 until strs.size-1){
            println("k ++ $i 0")
            var firstString = if(matched=="") strs[i] else matched
            var str1length = firstString.length;
            var str2length = strs[i+1].length;
            var isFirstisBig = str1length > str2length;
            var shortString = if(isFirstisBig) strs[i+1] else firstString
            var bigString = if(isFirstisBig) firstString else strs[i+1]

            if(shortString=="" || bigString==""){
                return ""
            }
           for(j in 0 until  shortString.length){

    
             if(shortString.substring(0,shortString.length-j)==bigString.substring(0,(shortString.length)-j)){
                matched = shortString.substring(0,(shortString.length-j))
                 println("matched == $matched")
                   println("matched == $shortString & $bigString")
                break;
            }
           }
        }
        return matched
    }
}
