class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String s: strs){
            encodedStr += s.length();
            encodedStr += "#";
            encodedStr += s;
        }
        return encodedStr;
    }

    public List<String> decode(String str) {
        List<String> li = new ArrayList<>();
        int i = 0;;
        while(i<str.length()){
            int n = 0;
            String s = "";
            while(Character.isDigit(str.charAt(i))){
                n = n*10 + (str.charAt(i)-'0');
                i++;
            }
            i++; //for "#"
            for(int j=i;j<n+i;j++){
                s += str.charAt(j);
            }
            i = n+i;
            li.add(s);
        }
        return li;
    }
}
