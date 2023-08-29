class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int cnt = 0;
        while(cnt < s1.length() && cnt < s2.length()){
            if(s1.charAt(cnt) == s2.charAt(cnt)){
                cnt++;
            } else {
                break;
            }
        }
        return s1.substring(0, cnt);
        
    }
}