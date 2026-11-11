class Solution {
    public String minWindow(String s, String t) {
        int[] freq1 = new int[128];
        int count = 0;
        for(char c: t.toCharArray()){
            freq1[c]++;
            count++;
        }
        int l = 0, r = 0, startIndex = 0, minLen = Integer.MAX_VALUE;
        while(r<s.length()){
            char c = s.charAt(r);
            if(freq1[c]>0){
                count--;
            }
            freq1[c]--;
            while(count==0){
                char c2 = s.charAt(l);
                freq1[c2]++;
                if(freq1[c2]>0){
                    count++;
                }
                int len = r-l+1;
                if(len<minLen){
                    minLen = len;
                    startIndex = l;
                }
                l++;
            }
            r++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(startIndex, startIndex+minLen);
    }
}
