class Solution {
    public int romanToInt(String s) {
        int res=0;
        int i=0;
        Map<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        Map<String,Integer>map2=new HashMap<>();
        map2.put("IV",4);
        map2.put("IX",9);
        map2.put("XL",40);
        map2.put("XC",90);
        map2.put("CD",400);
        map2.put("CM",900);
        while(i<s.length())
        {
            char ch=s.charAt(i),
            next=i<s.length()-1?s.charAt(i+1):' ';
            String comb=Character.toString(ch)+Character.toString(next);
            if(map2.containsKey(comb))
            {
                res=res+map2.get(comb);
                i=i+2;
            }
            else
            {
                res=res+map.get(ch);
                i++;
            }
        }
        return res;
    }
}