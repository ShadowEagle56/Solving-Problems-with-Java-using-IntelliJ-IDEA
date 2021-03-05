public class Part3 {
    static int findStopCodon(String dna, int startIndex, String stopCodon) {
        int index;

        while(true) {
            index = dna.indexOf(stopCodon, startIndex + 3);

            if (index == -1 || (index - startIndex) % 3 == 0) {
                break;
            }

            startIndex += 3;
        }

        if (index != -1) {
            return index;
        } else {
            return dna.length();
        }
    }

    static String findGene(String dna, int start) {
        final String START_CODON = "ATG";
        int startIndex = dna.indexOf(START_CODON, start);

        if (startIndex == -1) {
            return "";
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));

        if (minIndex == dna.length()) {
            return " ";
        } else {
            return dna.substring(startIndex, minIndex + 3);
        }
    }

    static int countGenes(String dna) {
        int start = 0;
        int totalGene = 0;

        while (true) {
            String gene = findGene(dna, start);

            if (gene.isEmpty()) {
                break;
            }

            totalGene++;

            start = dna.indexOf(gene, start) + gene.length();
        }

        return totalGene;
    }

    static void testCountGenes() {
        String dna = "ATGTAAGATGCCCTAGT";
        System.out.println("Gene count on " + dna + " = " + countGenes(dna));
    }

    public static void main(String[] args) {
        testCountGenes();
    }
}
