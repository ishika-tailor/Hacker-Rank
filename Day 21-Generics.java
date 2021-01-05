//generics
public static <E> void printarray(E[] array){
	for(E element: array){
			System.out.print(element);
	}
}

public class HelloWorld{

    public static <T extends Comparable <T>> T findmax(T a,T b){
        int ans=a.compareTo(b);
        if(ans<0){
            return b;
        }
        else{
            return a;
        }
    }
     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(findmax(2,3));
        System.out.println(findmax("ishika","hello"));
     }
}