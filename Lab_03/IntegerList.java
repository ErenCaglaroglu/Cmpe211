// ***************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//
// ***************************************************************
import java.util.*;
public class IntegerList
{
    private int sınır;
    int[] list;
    int [] list1;


    //values in the list
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {

        list = new int[size];
        this.sınır=size;
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){

        sınır=sınır+1;
        int [] list1=new int[sınır];

            for (int i=0;i<list.length;i++){

                list1[i]=list[i];
            }
        list=new int[sınır];

        for(int i = 0;i<list.length;i++) {
            list[i]=list1[i];
        }

    }

        public void addElement (int newVal){

        if(list.length<=sınır){
            increaseSize();
            list[list.length-1]=newVal;


        }
        else {

            list[list.length-1]=newVal;
        }

        }
    public void removeFirst(int newVal){

        for (int i=0;i<list.length-1;i++){

            if(list[i]==newVal){
                list[i]=list[i+1];
            }
            sınır=sınır -1;
            int [] list2=new int [sınır];

            for (int x =0;x<list2.length;x++){

                list2[x]=list[x];
            }
            list=list2;
            break;


        }




    }

    }
