fun singleNumber(nums: IntArray): Int {
    for(i in nums.indices){
        var count =0
        for(j in nums.indices){
            if(nums[i] == nums[j]){
                count++
            }
        }
        if(count==1){
            return nums[i]
        }
    }
    return -1

}
fun main(){
    val nums = intArrayOf(2, 2, 1)
    println(singleNumber(nums))

}