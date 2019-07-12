/* Our group didn't complete the entire project. Adding solutions that was posted later
* from our TAs. Their solutions are different from our project so I will be adjusting
* it to fit our project. */

import java.util.Arrays;

public class ArrayList implements List {
    //PRIVATE PROPERTIES
    private String[] data = new String[10];//AN EMPTY ARRAY WITH THE LENGTH OF 10
    private int listSize = 0;

    // This method adds String input to the first array available space in the ArrayList
    // input - a String (from user input) to be added to the ArrayList
    public void add(String input){
        if(this.listSize == data.length)
        {
            data = Arrays.copyOf(data, data.length * 2);
        }
        else
        {
            data[this.listSize] = input;
            this.listSize++;
        }

    }

    //RETURNS THE VALUE OF LIST SIZE
    public int size(){

        return this.listSize;
    }

    /* Gets the input(element) at the specified index
    * @param index - an int representing the index of the input return
    * @return - The String input
     */
    public String get(int index){

        return data[index];//RETURNS THE STRING IN THE INDEX PROVIDED
    }
    /* Removes the specified input(element) and shifts subsequent elements accordingly
    * @param index - an int representing the index of the input to remove
    */
    public void remove(int index){
        for (int i = 0; i<this.listSize -1; i++){
            data[i] = data [i+1];
        }
        data[this.listSize - 1] = null;
        this.listSize--;
    }
}
