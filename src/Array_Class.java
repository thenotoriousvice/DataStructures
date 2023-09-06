import java.sql.Array;
import java.util.Arrays;

public class Array_Class {
    private int[] items;
    private int count;
    public Array_Class (int length) {
        items = new int[length];
    }
    public void insert(int item){
        //if the array is full;
        if(items.length==count){
            //creating a new array twice the size of the previous
            int[] newItems = new int[count * 2];
            //now copy all the existing items into this new array;
            for(int i=0;i<count;i++)
                newItems[i] = items[i];
            //set items to this new array
            items = newItems;

        }
        items[count++]=item;
    }
    public void removeAt(int index){
        //validating the index first
        if(index <0 || index>=count)
            throw new IllegalArgumentException();
        //now shifting the items to thee left for filling the holes
        //item index:1
        //1 will be shifted to 2
        //2 will be shifted to 3
        for(int i = index; i<count;i++)
            items [i]= items[i+1];

        count--;


    }
    public void print(){
        for (int i=0;i<count;i++)
            System.out.println(items[i]);




    }
}
