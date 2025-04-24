fun searchArray(nums: IntArray, target: Int): Int {
    for(i in nums.indices){
        if(nums[i]==target){
            return i
        }else if (nums[i]> target){
            return i
        }

    }
    return nums.size
}

fun main(){
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 7
    val result = searchArray(nums,target)
    println(result)

}