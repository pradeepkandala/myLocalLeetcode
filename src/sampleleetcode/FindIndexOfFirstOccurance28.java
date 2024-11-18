package sampleleetcode;

public class FindIndexOfFirstOccurance28 {
    public static void main(String[] args){
        String  haystack = "sadbutsad";
        String needle = "pos";
        int position = strStr(haystack,needle);
        System.out.print(position);
    }

    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);

    }
}
