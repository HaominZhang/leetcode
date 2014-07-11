//http://gongxuns.blogspot.com/2012/12/leetcode-powxn.html
public double pow(double x, int n) {
        if(n==0)
            return 1.0;
        if(x==0)
            return 0.0;
        if(n<0){
             n = -n;
            x = 1/x;
        }
        double val = 1;
        while(n>0){
            if(n%2==1)
              val*=x;  
            x*=x;
            n=n/2;
        }
    
        
        return val;
    }