fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray{
    val result = IntArray(m + n)
    var i = 0
    var j = 0
    var k = 0

    for (x in 0 until m + n) {
        if (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++]
            } else {
                result[k++] = nums2[j++]
            }
        } else if (i < m) {
            result[k++] = nums1[i++]
        } else if (j < n) {
            result[k++] = nums2[j++]
        }
    }

    return result
}

fun main() {
    val nums1 = intArrayOf(1, 2, 3)
    val nums2 = intArrayOf(2, 5, 6)
    val m = nums1.size
    val n = nums2.size

    val mergedArray = merge(nums1, m, nums2, n)
    println(mergedArray.joinToString())

}