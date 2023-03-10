package String_5;

public class Main {
    public static void main(String[] args) {
        String word = "Работать нужно не 12 часов, а головой!";
        System.out.println(count(word, 'о'));
    }
    private static long count(String s, char c) {
        return s.chars().filter(x -> x == c).count();
    }
}
