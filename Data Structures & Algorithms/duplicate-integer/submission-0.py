class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        already_contain = {}
        for num in nums:
            if num in already_contain:
                return True
            already_contain[num] = already_contain.get(num, 0) + 1
        return False
        