package hw10;

public class ConvertSentence {
    public static void main(String[] args) {
        String str = "I    am      learning     Java   Core";
        String convertStr = str.replaceAll(" +"," ");
        System.out.println("Sentence:\n" + "\"" + str + "\"" +
                "\nConvert sentence:\n" + "\"" + convertStr.replace("I am", "I'm") + "\"");
    }
}
