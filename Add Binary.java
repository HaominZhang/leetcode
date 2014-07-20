public String addBinary(String a, String b) {
            int alen = a.length();
            int blen = b.length();
            
            int maxlen = Math.max(alen,blen);
            int carry=0;
            String binary="";
            for(int i=0;i<maxlen;i++){
                int adigit = i<alen?a.charAt(alen-i-1)-'0':0;
                int bdigit = i<blen?b.charAt(blen-i-1)-'0':0;
                int sum = adigit+bdigit+carry;
                carry = sum/2;
                binary = sum%2 + binary;
            }
            return (carry==1)?"1"+binary:binary;
        }