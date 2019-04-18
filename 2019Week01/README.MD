ARTS(week01)
=====

	算法题(Algorithm)
	Longest Palindromic Substring
	
	Found all Palindromic Substring, Compare the length of the subString,get the logest Palindromic Substring.
	```
	class Solution {
  public String longestPalindrome(String s) {
       if (s == null || s.length() < 1) return "";
       int start = 0, end = 0;
       for (int i = 0; i < s.length(); i++) {
           int len1 = expandAroundCenter(s, i, i);
           int len2 = expandAroundCenter(s, i, i + 1);
           int len = Math.max(len1, len2);
           if (len > end - start) {
               start = i - (len - 1) / 2;
               end = i + len / 2;
           }
        }
        return s.substring(start, end + 1);
      }
     private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
        }
        return R - L - 1;
      }
  }
  ```

#阅读点评(Review)
Starting Off With a Sha-Bang
阅读笔记
最简单的例子，一个脚本只是把一些系统内置的命令列表存储在文件里。

sha-bang (#!)在一个脚本的顶部，告诉你的系统解释器需要提前加载的命令集。

#!实际上是2个字节的魔法数字。一个特殊文件类型的标记或者在这个情况下，可执行shell脚本。
请注意，sha-bang的路径一定要是争取的，否则就会出现错误信息Command not found.

#!可以省略，如果脚本只是常用的系统内置命令，没有用到内置shell标识。
我就是给了一个错误的路径导致出现奇怪的错误信息。

