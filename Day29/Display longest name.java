//Given a list of names, display the longest name.

class GFG {
     String longest(String names[], int n) {
        String temp = ""; 
        int max = names[0].length(); 
        for(String str: names){
            if(str.length() > max){
                max = str.length();
                temp = str; 
            }
        }
        return temp;
    }
}
