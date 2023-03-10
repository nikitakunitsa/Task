package String_3;

public class Main {
    public static void main(String[] args) {
        String word="rfg*sbsb *fdhdhdb*dsnddbn+ fjuffh*";
        String ch="*";
        String newString="" ;
        String newChar="a";
        for (int i=0;i<word.length();i++){
            if(ch.equals(word.charAt(i))){
            newString=word.replace(ch,newChar);
            }
        }
        System.out.println(newString);
    }
}
