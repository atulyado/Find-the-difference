class Solution {
    public char findTheDifference(String s, String t) {// s= abcde t = abcd
         char[] charS = s.toCharArray();//change string to char
         char[] charT = t.toCharArray();
         int sumS=0;
         int sumT=0;
         for(int num : charS){
            sumS += num;//// ASCII sum = 97 + 98 + 99 + 100 = 394 
         }//this going to get all number with it's ASCII value add them
         for(int num : charT){
            sumT += num;// + ASCII of 'e' = 101 -> Total = 495
         }//this going to get all number with it's ASCII value add them with extra e
         return (char) (sumT - sumS);// 101 = 'e'
    }//this going to subtract them and change it to char

    public char findDifference(String s, String t) {
        char result = 0;
        for(char c : s.toCharArray()){
            result ^= c;//Now result has: 'a' ^ 'b' ^ 'c' ^ 'd'
        }

        for(char c : t.toCharArray()){
            result ^= c;//now has e
        }

        return result;
    }
}
