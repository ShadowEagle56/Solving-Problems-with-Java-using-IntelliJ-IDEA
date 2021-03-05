public class Part1 {
    static String findSimpleGene(String dna){
        String result = " ";

        int startIndex = dna.indexOf("ATG");
        int stopIndex = dna.indexOf("TAA", startIndex + 3);

        if (startIndex == -1 || stopIndex == -1) {
            return result;
        }
        
        else if ((stopIndex - startIndex) % 3 == 0) {
            result = dna.substring(startIndex, stopIndex + 3);
            return result;
        }
       
        else{
            return result;
        }
    }
    
    static void testSimpleGene() {
        // DNA with no ATG.
        String dna = "ATCTAATTT";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));

        // DNA with no TAA.
        dna = "ATGATCATCGTT";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));

        //DNA with no ATG and TAA.
        dna = "ATTGTTAT";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));

        //DNA with ATG, TAA and the substring between them is not a multiple of 3.
        dna = "GAAATGGATAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));

        // DNA with ATG, TAA and the substring between them is the multiple of 3.
        dna = "TAAGATATGGTGAAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));
    }
    
    public static void main(String[] args) {
        testSimpleGene();
    }
}
