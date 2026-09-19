class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String s : strs){
            encoded.append(s.length()).append("#").append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

    while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // Read string length
        int length = Integer.parseInt(str.substring(i, j));

        // Extract string of that length
        String s = str.substring(j + 1, j + 1 + length);
        result.add(s);

        // Move to next string
        i = j + 1 + length;
    }
    return result;

    }
}
