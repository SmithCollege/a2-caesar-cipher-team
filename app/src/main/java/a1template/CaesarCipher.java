// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset, Character[] alphabet){
        this.alphabet = alphabet;
        this.cipher = new DynamicArray<Character>(alphabet.length);
        this.offset = offset;

        // need to adjust this for when length of 
        for (int i = 0; i<alphabet.length, i++){
            this.cipher.set(i, alphabet[alphabet.offsetByCodePoints(alphabet, 0, )]);
        }
        for (int i = 0; i < alphabet.length-offset; i++){
            this.cipher.set(i, alphabet[i+offset]);
        }
        for (int i = alphabet.length-offset; i < alphabet.length; i++){
            this.cipher.set(i, alphabet[i+offset]);
        }
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        int position = 0;
        for (int i=0; i<alphabet.length; i++){
            if (alpahbet[i] = val){
            position = alphabet[i];
            }
        }
        return position;
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        // Fill in here and update return statement based on your code
        return new String(); 
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        return new String();
    }

    public static void main(String[] args) {
     
    
    }
}
