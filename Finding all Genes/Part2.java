public class Part2 {
    static int howMany(String stringa, String stringb){
        int totalOccurences = 0;
        int start = 0;

        while(true){
            int index = stringb.indexOf(stringa, start);

            if(index == -1){
                break;
            }

            else{
                totalOccurences ++;
                start = index + stringa.length();
            }
        }
        return totalOccurences;
    }

    static void testHowMany(){
        String stringa = "GAA";
        String stringb = "ATGAACGAATTGAATC";
        System.out.println("Total occurences of " + stringa + " in " + stringb + " = " + howMany(stringa, stringb));

        stringa = "AA";
        stringb = "ATAAAA";
        System.out.println("Total occurences of " + stringa + " in " + stringb + " = " + howMany(stringa, stringb));
    }

    public static void main(String[] args) {
        testHowMany();
    }
}
