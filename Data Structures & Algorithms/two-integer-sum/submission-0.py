class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i, num in enumerate(nums):
            newTarget = target - num
            if newTarget in seen:
                return [seen[newTarget], i]
            seen[num] = i
        return []
        