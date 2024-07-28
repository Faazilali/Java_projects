public class Subsequence {
    public static void subSeq(String str, int i, String newString){

        if(i == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);

        //to add char
        subSeq(str, i+1, newString+currChar);

        //not to add char
        subSeq(str, i+1, newString); 
    }

    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, "");
    }
}
