class Solution {
    public String gcdOfStrings(String str1, String str2) {


        int lengthStr1 = str1.length() ;
        int lengthStr2 = str2.length() ;
        int longestSub = 1 ;


        if(lengthStr1 >= lengthStr2){
            longestSub = lengthStr2;
        }else{
            longestSub = lengthStr2;
        }


        for(int i = longestSub ; i > 0 ; i--){
            String longestSubString = largestSubString(str1 , str2 , i) ;
            if(!longestSubString.equals("") ){
                return longestSubString ;
            }
        }


        return "" ;
    }


    public String largestSubString(String str1 , String str2 , int longestSub){
        if(str1.length() % longestSub == 0 && str2.length() % longestSub == 0){
            int div1 = str1.length() / longestSub ;
            int div2 = str2.length() / longestSub ;


            String compare1 = str1.substring(0 , longestSub) ;


            if(compare1.repeat(div1).equals(str1) && compare1.repeat(div2).equals(str2)){
                return compare1 ;
            }
        }
        return "" ;
    }
}
