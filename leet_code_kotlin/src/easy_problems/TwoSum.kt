package easy_problems

import java.util.*

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var hashMap: HashMap<Int, Int> = HashMap()

        for (i in nums.indices) {
            if ((target - nums[i]) in hashMap.keys) {
                return intArrayOf(hashMap.get(target - nums[i])!!, i)
            }
            hashMap.put(nums[i], i)
        }
        return intArrayOf()
    }

    fun main(args: Array<String>) {

        val obj = TwoSum()

        println(obj.twoSum(intArrayOf(2, 7, 11, 9), 20))
    }
}