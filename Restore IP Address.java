//http://blog.csdn.net/u013027996/article/details/23558309
public List<String> restoreIpAddresses(String s) {
        List<String> iplist = new ArrayList<String>();
        dfsSearch(s,0,new StringBuffer(),iplist);
        return iplist;
    }
    
    public static void dfsSearch(String str,int part,StringBuffer ip,List<String> list){
        if(part==4){
            list.add(ip.toString());
            return;
        }
        int len = str.length();
        int min = Math.max(1,len-3*(3-part));
        int max = Math.min(3,len-(3-part));
        int cur = min;
        while(cur>=min&&cur<=max){
            String sub = str.substring(0,cur);
            if(cur!=1&&sub.charAt(0)=='0'){
                break;
            }
            int number = Integer.parseInt(sub);  
            if (number >= 0 && number < 256) {  
                StringBuffer subip = new StringBuffer(ip);  
                if (!"".equals(subip.toString())) {  
                    subip.append(".");  
                }  
                subip.append(sub);  
                dfsSearch(str.substring(cur),part + 1,subip, list);  
            }  
            cur++;  
        }
    }