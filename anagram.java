public class Anagram {
    public static boolean anagram(String str1, String str2) {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        String st1=s1.replace(" ","");
        String st2=s2.replace(" ","");

        int [] counts = new int[26];

        for(int i =0 ;i<st1.length();i++){
            counts[st1.charAt(i)-'a']++;
        }
        for(int i =0 ;i<st2.length();i++){
            counts[st2.charAt(i)-'a']--;
        }
        for(int count : counts){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleg";
        System.out.println(anagram(str1,str2));
    }
}
