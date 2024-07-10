public class Strings {
    public static void main(String[] args) {
        String sentence = "I love Java";

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(10));
        System.out.println(sentence.replace('a', 'o'));
//        System.out.println(sentence.);

        StringBuilder message = new StringBuilder();
        message.append("My name is Fidelis");
        message.append(70);
        message.append("My heaight is " + 1.92);
        message.append("That's everything about me");
        System.out.println(message);

        StringBuffer stringBuffer = new StringBuffer();
    }
}
