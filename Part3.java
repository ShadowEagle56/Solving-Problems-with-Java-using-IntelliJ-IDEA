public class Part3 {
    static boolean twoOccurrences(String stringA, String stringB) {
        int firstIndex = stringB.indexOf(stringA);
        int lastIndex = stringB.lastIndexOf(stringA);

        return firstIndex != lastIndex;
    }

    static String lastPart(String stringA, String stringB) {
        int index = stringB.indexOf(stringA);

        if (index == -1) {
            return stringB;
        } else {
            return stringB.substring(index + stringA.length());
        }
    }

    static void test() {
        String stringA;
        String stringB;

        System.out.println("Testing twoOccurences");

        stringA = "by";
        stringB = "A story by Abby Long";
        System.out.println(stringA + " appears at least twice in " + stringB + " = " + twoOccurrences(stringA, stringB));

        stringA = "a";
        stringB = "banana";
        System.out.println(stringA + " appears at least twice in " + stringB + " = " + twoOccurrences(stringA, stringB));

        stringA = "atg";
        stringB = "ctgtatgta";
        System.out.println(stringA + " appears at least twice in " + stringB + " = " + twoOccurrences(stringA, stringB));

        System.out.println("\nTesting lastPart:");

        stringA = "an";
        stringB = "banana";
        System.out.println("The part of the string after " + stringA + " in " + stringB + " is " + lastPart(stringA, stringB));

        stringA = "zoo";
        stringB = "forest";
        System.out.println("The part of the string after " + stringA + " in " + stringB + " is " + lastPart(stringA, stringB));
    }
    public static void main(String[] args) {
        test();
    }
}
