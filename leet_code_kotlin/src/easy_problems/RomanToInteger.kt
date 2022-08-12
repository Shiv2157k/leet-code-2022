package easy_problems

import java.util.HashMap

class RomanToInteger {

    fun romanToInt(s: String): Int {
        val romansMap: HashMap<String, Int> = hashMapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )

        var result = romansMap.get(s[s.length - 1].toString())!!
        for(i in s.length -2 downTo 0) {
            romansMap.get(s[i].toString())?.let{current ->
                romansMap.get(s[i + 1].toString())?.let{after ->
                    if (current < after) {
                        result -= current
                    } else {
                        result += current
                    }
                }
            }
        }
        return result
    }

    fun main(args: Array<String>) {
        val obj = RomanToInteger()
        println(message = obj.romanToInt("XLVII"))
    }
}