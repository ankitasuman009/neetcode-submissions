class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = defaultdict(list)
        for word in strs:
            s = "".join(sorted(word))
            group[s].append(word)
        return list(group.values())
        