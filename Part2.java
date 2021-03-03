public class Part2 {
    static String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String result = " ";

        int startIndex = dna.toUpperCase().indexOf(startCodon);
        int stopIndex = dna.toUpperCase().indexOf(stopCodon, startIndex + 3);

        if (startIndex == -1 || stopIndex == -1) {
            return result;
        } else if ((stopIndex - startIndex) % 3 == 0) {
            result = dna.substring(startIndex, stopIndex + 3);
            return result;
        } else {
            return result;
        }
    }

    static void testSimpleGene() {
        String startCodon = "ATG";
        String stopCodon = "TAA";

        // DNA with no ATG
        String dna = "ATCTAACATC";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));

        // DNA with no TAA
        dna = "ATTATCATGTTA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));

        //DNA with no ATG and TAA
        dna = "ATTAGTGTA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));

        //DNA with ATG, TAA and the substring between them is not a multiple of 3.
        dna = "GAAATGGATAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));

        // DNA with ATG, TAA and the substring between them is the multiple of 3
        dna = "TAAGATATGGTGAAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));
        
        // All uppercase letters
        dna = "ATGGGTTAAGTC";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));

        // All lowercase letters
        dna = "gatgctataat";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));
    }
    
    public static void main(String[] args) {
        testSimpleGene();
    }
}
