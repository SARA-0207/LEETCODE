class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int st = 0, en = n;
        int perm[] = new int[n+1];
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='I')
            {
                perm[i] = st;
                st++;
            }
            else
            {
                perm[i] = en;
                en--;
            }
        }
        perm[n] = st;
        return perm;
    }
}
