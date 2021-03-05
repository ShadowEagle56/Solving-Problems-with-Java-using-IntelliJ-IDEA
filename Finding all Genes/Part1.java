public class Part1{
    static int findStopCodon(String dna, int startIndex, String stopCodon){
        int index;

        while(true){
            index = dna.indexOf(stopCodon, startIndex + 3);

            if(index == -1 || (index - startIndex) % 3 == 0) {
                break;
            }

            startIndex += 3;
        }

        if(index != -1){
            return index;
        }
        else {
            return dna.length();
        }
    }

    static void testStopCodon(){
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";

        int index = findStopCodon(dna, 0, "TAA");
        System.out.println("Index = " + index);

        index = findStopCodon(dna, 9, "TAA");
        System.out.println("Index = " + index);

        index = findStopCodon(dna, 1, "TAA");
        System.out.println("Index = " + index);

        index = findStopCodon(dna, 9, "TAG");
        System.out.println("Index = " + index);
    }

    static String findGene(String dna, int start){
        final String startCodon = "ATG";
        int startIndex = dna.indexOf(startCodon, start);

        if(startIndex == -1){
            return " ";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));

        if(minIndex == dna.length()){
            return " ";
        }
        else{
            return dna.substring(startIndex, minIndex + 3);
        }
    }

    static void testFindGene(){
        // no ATG
        String dna = "GTTAATGTAGCTTAAACCTTTAAAGCAAGGCACTGAAAATGCCTAGATGA";
        System.out.println("Gene: " + findGene(dna, 0));

        // with ATG & 1 stop codon
        dna = "GTGAGCTCACTCCATAGACACAAAGGTTTGGTCCTGGCCTTCTTATTAGT";
        System.out.println("Gene: " + findGene(dna, 0));

        // with ATG & multiple stop codons
        dna = "AATGCTAACTAGCTGACTAAT";
        System.out.println("Gene: " + findGene(dna, 0));

        // with ATG & no stop codons
        dna = "AGCTCACAACACCTTGCTTAGCCACACCCCCACGGGATACAGCAGTGATA";
        System.out.println("Gene: " + findGene(dna, 0));
    }

    static void printAllGenes(String dna){
        int start = 0;
        while(true){
            String gene = findGene(dna, start);

            if(gene.isEmpty()){
                break;
            }
            else{
                System.out.println("Gene: " + gene);

                start = dna.indexOf(gene, start + gene.length());
            }
        }
    }

    static void testPrintAllGenes(){
        String dna = "ATGATCTAATTTATGCTGCAACGGTGAAGA";
        printAllGenes(dna);
    }

    public static void main(String[] args) {

        testStopCodon();
        testFindGene();
        testPrintAllGenes();
    }
}
