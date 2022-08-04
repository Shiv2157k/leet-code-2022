from typing import List


class TwoSum:

    def get_indices(self, nums: List[int], target: int) -> List[int]:

        hashmap = {}

        for i, num in enumerate(nums):
            if target - num in hashmap:
                return [i, hashmap[target - num]]
            hashmap[num] = i
        return []


if __name__ == "__main__":
    twoSum = TwoSum()
    print(twoSum.get_indices([3, 4, 5, 7], 11))
    print(twoSum.get_indices([3, 7], 10))
    print(twoSum.get_indices([3], 10))




