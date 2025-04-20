class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
}
 StringBuilder end_result = new StringBuilder();
        end_result.append(s.charAt(0));
        end_result.append(s.charAt(1));

        for (int i = 2; i < s.length(); i++) {

            if (s.charAt(i) != end_result.charAt(end_result.length() - 1) || 
                s.charAt(i) != end_result.charAt(end_result.length() - 2)) {
                end_result.append(s.charAt(i));
            }
        }

        return end_result.toString();
    }
}