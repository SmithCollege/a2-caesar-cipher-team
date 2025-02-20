// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    T[] array;
    //int length;

    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(T[] array){
        this.array = array;
        //this.length = array.length();
    }

    // Now implement the methods from IndexAccess?
    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i){
        return(this.array[i]);
    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset){
        return (this.array[i + offset]);
    }

    /** Stores the given value at the given index
     * @param i index of location to store
     * @param val value to store at given index
     */
    public void set(int i, T val){
        this.array[i] = val;
    }

    public static void main() {
        Integer[] a = new Integer[5];
        DynamicArray<Integer> Number = new DynamicArray<Integer>(a);
    }
}