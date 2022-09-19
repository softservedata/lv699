package hw10;

public class SentenceOfFiveWords {
    public static void main(String[] args) {
        String str = "Reputed to have been composed nearly";
        System.out.println("Sentence: " + "\"" + str + "\"");
        String[] strings = str.split(" ");

        String longestWord = findLongestWord(strings);

        System.out.println("The number of its letters " + "\"" + longestWord + "\"" + ": " + longestWord.length());

        System.out.println("Word " + "\"" + strings[2] + "\"" +
                ", reverse order: " + new StringBuilder(strings[2]).reverse());
    }

    public static String findLongestWord(String[] _strings) {
        String longest = "";
        for (int i = 0; i < _strings.length; i++) {
            if (_strings[i].length() > longest.length()) {
                longest = _strings[i];
            }
        }
        System.out.println("The longest word in the sentence: " + "\"" + longest + "\"");
        return longest;
    }
}
