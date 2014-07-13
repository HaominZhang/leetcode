    //http://blog.csdn.net/perfect8886/article/details/23040143
    public int divide(int dividend, int divisor) {  
        if (dividend == 0)   
            return 0;  
        if(divisor==0)
            return Integer.MAX_VALUE;
            
        boolean Neg = (dividend > 0 && divisor < 0)  
                || (dividend < 0 && divisor > 0);  
        long a = Math.abs((long) dividend);  
        long b = Math.abs((long) divisor);  
        if (b > a) {  
            return 0;  
        }  
        long sum = 0;  
        long pow_number = 0;  
        int result = 0;  
        while (a >= b) {  
            pow_number= 1;  
            sum = b;  
            while (sum + sum <= a) {    //cannot use multiplication 
                sum += sum;  
                pow_number += pow_number;  //the pow number equals to the current result
            }  
            a -= sum;  
            result += pow_number;  //sum up all pow numbers
        }  
        return Neg ? -result : result;  
    } 