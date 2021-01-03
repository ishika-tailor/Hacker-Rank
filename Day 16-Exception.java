//Day: 16 exception 
// how do we handle this exception? 1) checked (Occur at compile time-syntax) and unchecked (Occur at time of program its excecute-logic)

public class HelloWorld{

     public static void main(String []args){
         
         try{
             int[] arr=new int[5];
             System.out.println(arr[5]);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("you got error"+e);}
        finally{
        System.out.println("Hello World");}

     }
}

int main(){
    string S;
    cin >> S;
    try {
    int no=stoi(S);
    cout<<no<<endl;
    } catch(exception e) {
    cout<<"Bad String"<<endl;
    }
    return 0;
}