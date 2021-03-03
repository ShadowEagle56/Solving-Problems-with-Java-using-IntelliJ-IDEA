# Solving Problems with Java

## Part 1: Finding a Gene: Using the Simplified Algorithm

1. Create a new Java Class named Part1. The following methods go in this class.
2. Write the method findSimpleGene that has one String parameter dna, representing a string of DNA. This method does the following:
Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty string.
Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, return the empty string. 
If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then return the substring that starts with that “ATG” and ends with that “TAA”.
3. Write the void method testSimpleGene that has no parameters. You should create five DNA strings. The strings should have specific test cases, such as: DNA with no “ATG”, DNA with no “TAA”, DNA with no “ATG” or “TAA”, DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene), and DNA with ATG, TAA and the substring between them is not a multiple of 3. For each DNA string you should: 
- Print the DNA string. 
- See if there is a gene by calling findSimpleGene with this string as the parameter. If a gene exists following our algorithm above, then print the gene, otherwise print the empty string.

## Part 2: Finding a Gene: Using the Simplified Algorithm Reorganized

This part will determine if a DNA strand has a gene in it by using the simplified algorithm, but organizing the code in a slightly different way. Modify the method findSimpleGene to have three parameters, one for the DNA string, one for the start codon and one for the stop codon.
Specifically, you should do the following:

1. Create a new Java Class named Part2.
2. Copy and paste the two methods findSimpleGene and testSimpleGene  from the Part1 class into the Part2 class.
3. The method findSimpleGene has one parameter for the DNA string named dna. Modify findSimpleGene to add two additional parameters, one named startCodon for the start codon and one named stopCodon for the stop codon. After making all changes, run your program to check that you get the same output as before.
4. Modify the findSimpleGene method to work with DNA strings that are either all uppercase letters such as “ATGGGTTAAGTC” or all lowercase letters such as “gatgctataat”. Calling findSimpleGene with “ATGGGTTAAGTC” should return the answer with uppercase letters, the gene “ATGGGTTAA”, and calling findSimpleGene with  “gatgctataat” should return the answer with lowercase letters, the gene “atgctataa”.

## Part 3: Problem Solving with Strings

1. Create a new Java Class named Part3.
2. Write the method named twoOccurrences that has two String parameters named stringa and stringb. This method returns true if stringa appears at least twice in stringb, otherwise it returns false. For example, the call twoOccurrences(“by”, “A story by Abby Long”) returns true as there are two occurrences of “by”, the call twoOccurrences(“a”, “banana”) returns true as there are three occurrences of “a” so “a” occurs at least twice, and the call twoOccurrences(“atg”, “ctgtatgta”) returns false as there is only one occurence of “atg”.
3. Write the void method named testing that has no parameters. This method should call twoOccurrences on several pairs of strings and print the strings and the result of calling twoOccurrences (true or false) for each pair. Be sure to test examples that should result in true and examples that should result in false.
4. Write the method named lastPart that has two String parameters named stringa and stringb. This method finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa.  If stringa does not occur in stringb, then return stringb. For example, the call lastPart(“an”, “banana”) returns the string “ana”, the part of the string after the first “an”. The call lastPart(“zoo”, “forest”) returns the string “forest” since “zoo” does not appear in that word.
5. Add code to the method testing to call the method lastPart with several pairs of strings. For each call print the strings passed in and the result. For example, the output for the two calls above might be:
The part of the string after an in banana is ana.
The part of the string after zoo in forest is forest.
