import java.util.HashSet;


// This is not a leetcode problem but it is the solution to an interview problem I failed
class HelloWorld {
    // Declare static HashSet
    public static HashSet<String> uniqueStrings = new HashSet<>();
    
    public static void main(String[] args) {
        String binary = "10010";
        generatePermutations(binary, 0 , 1 ,0 );  // Call the function to generate permutations
        
        // Print all unique binary permutations
        for (String binaryString : uniqueStrings) {
            System.out.println(binaryString);
        }
    }
    
    //Generate all possible permutations by flipping zeros to 1 in a binary number at most n times;
    public static void generatePermutations(String binary, int position , int maxNumFlipZeros , int numFlipZeros) {
        
        // Avoid reprocessing already known strings
        if (uniqueStrings.contains(binary)) {
            return;
        }
        
        if(numFlipZeros > maxNumFlipZeros){
            return ;
        }
        
        // Add the original string to the set
        uniqueStrings.add(binary);
        
        
        // Iterate over the string to generate permutations
        for (int i = position; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                // Use StringBuilder to modify the string
                StringBuilder sb = new StringBuilder(binary);
                sb.setCharAt(i, '1');  // Replace '0' with '1'
                String modifiedString = sb.toString();
                numFlipZeros++ ;
                // Recursively generate permutations for the modified string
                generatePermutations(modifiedString, i + 1 , maxNumFlipZeros , numFlipZeros);
                numFlipZeros-- ;
            }
        }
    }
}
