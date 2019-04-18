class Solution {
    public int myAtoi(String str) {
        //str =str.replace(" ", "");
        int j=0;
        if ("".equals(str)||str.length()==0) {return 0;}
        while(j<str.length()&&str.charAt(j)==' '){
            str = str.substring(j+1,str.length());
            System.out.println(str);
            
            
        }
        if ("".equals(str)||str.length()==0) {return 0;}
        int i = 0, sign = 1, length = str.length();
        double base = 0;
        
        
        if (str.charAt(i) == '-' || str.charAt(i) == '+'||(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
            sign = str.charAt(i) == '-' ? -1 : 1;
        }
        else{
            return 0;
        }
        if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            for(i=0;i<str.length();i++){
                if(str.charAt(i) <'0'||str.charAt(i) > '9'){
                    break;
                }
                base = base * 10 + (str.charAt(i) - '0');
                if ((base) > Integer.MAX_VALUE) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                
            }
        }
        else {
                for(i=1;i<str.length();i++){
                    if(str.charAt(i) <'0'||str.charAt(i) > '9'){
                        break;
                    }
                    base = base * 10 + (str.charAt(i) - '0');
                    if ((base) > Integer.MAX_VALUE) {
                        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                }
                
        }
      
        return sign * (int)base;
    }
}
