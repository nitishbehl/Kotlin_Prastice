fun majorityElement(nums: IntArray): Int {
    val n =nums.size
    for(i in nums.indices){
        var count =0
        for (j in nums.indices){
           if( nums[i] == nums[j]){
               count++
            }
        }
        if(count >n/2){
            return nums[i]
        }
    }
    return -1

}
fun main(){
    val nums = intArrayOf(6,5,5)
    println(majorityElement(nums))

}