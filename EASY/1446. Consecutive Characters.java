class Solution {
    public int maxPower(String s) {
        int res=1,cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                cnt++;
            else cnt=1;
            res=Math.max(res,cnt);
            
        }
        return res;
    }
}
