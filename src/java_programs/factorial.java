package java_programs;
public class factorial {


    public int fact(int n){

        if(n == 0 || n == 1){
            
         return 1;
            
        }
        else {
            return n * fact(n -1 );}
         

    }
    
}
