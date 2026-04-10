class Solution {
    public boolean isAnagram(String s, String t) {
        char[] Sarr = s.toCharArray();
        char[] Tarr = t.toCharArray();

        Arrays.sort(Sarr);
        Arrays.sort(Tarr);

        s=new String(Sarr);
        t=new String(Tarr);

        if(s.equals(t))
            return true;

        return false;

    }
}
