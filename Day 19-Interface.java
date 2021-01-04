//Day 19 interfaces
//interface collection of abstract method
//1) no template 2) no constructor
//template of functionality

//editorial
import java.util.Random;
interface Character{
    public void attack();
    public void heal();
    public String Weapon();
}
class hero implements Character{
    public String weapon="chaaku";
    public String Weapon(){
        return weapon;
    }
    public void attack(){
        System.out.println("Hero attack on enemy");
    }
    public void heal(){
        System.out.println("Hero is healing him self");
    }
}
class enemy implements Character{
    public String weapon="Maaku";
    public String Weapon(){
        return weapon;
    }
    public void attack(){
        System.out.println("enemy attack on you");
    }
    public void heal(){
        System.out.println("enemy is healing him self");
    }
}


public class HelloWorld{

    public static Character surprise(){
        Random ran=new Random();
        if(Math.abs(ran.nextInt())% 2 ==0){
            return new enemy();
        }
        else{
            return new hero();
        }
    }

     public static void main(String []args){
       Character h1=new hero();
       Character e1=new enemy();
       e1.attack();
       h1.attack();
       h1.heal();
       e1.heal();
       System.out.println("Hero weapon:"+h1.Weapon());
       System.out.println("Enemy weapon:"+e1.Weapon());
       Character sp=surprise();
       sp.attack();
       sp.heal();
       
     }
}

//tutorial
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int total=0;
        for(int j=1;j<n+1;j++){
            if(n%j==0){
                total=total+j;
            }
        }
        return total;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}