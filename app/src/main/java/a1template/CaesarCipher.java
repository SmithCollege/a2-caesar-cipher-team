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
    CaesarCipher(int offset){
        this.alphabet = new Character[26];
        for (int i = 0; i<26; i++){ //creates string of alphabet
            alphabet[i] = Character.valueOf((char) ('a' + i));
        }
        this.cipher = new DynamicArray<Character>(alphabet.length); //creates an empty cipher array with same length as alphabet
        this.offset = offset;

        //creates an offset character array
        int i = 0;
        while (i-this.offset<0){
            this.cipher.set(i, Character.valueOf((char) ('a' + alphabet.length - (this.offset - i)))); 
            i++;
        }
        i = 0; // instead maybe go from end and i--
        while (i+this.offset+1 <= alphabet.length){
            this.cipher.set(i, Character.valueOf((char) ('a' + i - this.offset)));
            i++;
        }
    }

    public char get(int i){
        return this.cipher.get(i);
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        for (int i=0; i < this.alphabet.length; i++){
            if (this.alphabet[i].equals(val)){
            return i;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public int cipherFindIndex(char val){
        for (int i=0; i < this.alphabet.length; i++){
            if (this.cipher.get(i).equals(val)){
            return i;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        //create an empty array
        Character[] array = new Character[message.length()];

        int index = 0;
        for (int i=0; i<message.length(); i++){
            index = this.findIndex(message.charAt(i));
            array [i] = this.cipher.get(index);
        }
        //for each element in the string message, find the character in the alphabet array, return its index alphabet[i],
        //search for cipher[i], set array[i in the message loop] as the character of cipher[i] 
        return array.toString(); 
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        Character[] array = new Character[message.length()];

        int index = 0;
        for (int i=0; i<message.length(); i++){
            index = this.cipherFindIndex(message.charAt(i));
            array [i] = this.alphabet[index];
        }
        return new String();
    }

    public void print(){
        System.out.println("Now printing the cipher");
        for (int i =0; i < this.alphabet.length; i++){
            System.out.println(this.cipher.get(i));
        }
        System.out.println("Now printing the alphabet");
        for (int i =0; i < this.alphabet.length; i++){
            System.out.println(this.alphabet[i]);
        }
    }

    public static void main(String[] args) {
       // Integer[] a = new Integer[5];
       // DynamicArray<Integer> Number = new DynamicArray<Integer>(a);
        CaesarCipher classUnderTest = new CaesarCipher(3);
        classUnderTest.print();
    }
}
