fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()
    for (i in 0 until nums.size) {
        if (nums[i] == nums[i + 1]) {
            return true
        }
    }
    return false
}


fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    println(containsDuplicate(nums))

}