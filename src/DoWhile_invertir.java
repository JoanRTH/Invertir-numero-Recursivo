public class DoWhile_invertir {
    public int inv (int n){
        int a = n;
        int c = 0;
        int b;
        
        do {
            a = (int)a/10;
            b = n %10;
            c = (c*10)+b;
            n=a;
        }while(a > 0) ;
        return c;
    }
    
    public int invNum (int n){
        // caso nase
        if (n==0){
            return n;
        } else {
            // función recursivo
                return invNum (n/10) * 10 + (n%10);
            }
        }
    }

