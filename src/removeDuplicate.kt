fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var k = 1
    for (i in k until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i]
            k++

        }
    }
    return k

}


fun main() {
    val nums = intArrayOf(1, 1, 2, 2, 3, 3, 4)
    val newLength = removeDuplicates(nums)
    println("New length: $newLength")
    println("Unique elements: ${nums.take(newLength)}")//.take means it's used to get a specific
// number of elements from the beginning of a list
}