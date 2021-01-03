//if an exception might arise, 
//1) Use Try-catch
//2) Use the keyword "throws" in the method signature, which state that we will handle this error higher up in the program
//3) we can throw an error inside of a method using "throw" when we know something is wrong the program.
class Calculator{
    public:
    int power(int n,int p){
        if(n<0 || p<0){
            throw invalid_argument("n and p should be non-negative");
        }
        return pow(n,p);
    }
};

//tutorial
public class HelloWorld{
    
    
    static double hotmax=500;
    static double coldmax=300;
    public static void checktemp(double temp) throws ToHotException,ToColdException{
        if(temp>=hotmax){
            
            new throw ToHotException();
        }
        else(temp<=coldmax){
              new throw ToColdException();
        }
    }



     public static void main(String []args){
         
        double temp=200;
        try{
            checktemp(temp);
            system.out.print("temp is okay");
        }
        catch(ToHotException e){
            system.out.print("tooo Hooot");
        }
        catch(ToColdException e1){
            system.out.print("tooo Coold");
        }
     }
}