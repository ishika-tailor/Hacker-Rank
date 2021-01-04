//Day-20 sorting
//enum: a special data type that allows for a variable tobe oneof a set of predefined constants.

public class Person{
    enum Haircolor{
    BLACK,BROWN,GREEN,RAINBOW;}
    
    Haircolor hc=BLACK;
    public Person(){
        
    }
    public static void main(String[] args){
        Person p1=new Person();
        Person p2=p1; //pointing to same memory location
        System.out.print(p1.hc);
        System.out.print(p2.hc);
    }
}

//tutorial
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int swap=0;
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j <i; j++) {           
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
            }
        }   
        System.out.print("Array is sorted in "+swap+" swaps."+"\n");
        System.out.print("First Element: "+a[0]+"\n");
        System.out.print("Last Element: "+a[n-1]+"\n");
    }
}