//Write a program to print Binary representation of a given number N.

class Solution{
    static String getBinaryRep(int N){
        String binary = Integer.toBinaryString(N);
        if (N < 0)
            return binary.substring(2);
        else {
            if (binary.length() == 30)
                return binary;
            else
                return "0".repeat(Math.max(0, 30 - binary.length())) + binary;
        }
    }
}
