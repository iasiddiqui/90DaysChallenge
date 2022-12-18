//Given a string S. The task is to convert characters of string to lowercase.


class Solution {
 public:
   std::string toLower(std::string& s) {
   transform(s.begin(), s.end(), s.begin(), ::tolower);
   return s;
   }
};
