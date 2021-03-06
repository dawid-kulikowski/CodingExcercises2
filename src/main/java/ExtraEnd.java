//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//
//
//        extraEnd("Hello") → "lololo"
//        extraEnd("ab") → "ababab"
//        extraEnd("Hi") → "HiHiHi"

public class ExtraEnd {

private String str;

    public ExtraEnd(String str) {
        this.str = str;
    }

    public String extraEnd(String str) {
        String last2 = str.substring(str.length()-2,str.length());

        return last2 + last2 + last2;
    }
}
