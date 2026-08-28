class Solution {
    public String reverseWords(String s) {
        String t=s.trim();
        String []arr=t.split("\\s+");
        List<String>al=Arrays.asList(arr);
        Collections.reverse(al);
        return String.join(" ",al);
   }
}