import java.io.*;
import java.util.*;

class Solution {
static int bintoDec(String n) {
String num = n;
int dec= 0;
int base = 1;
int len = num.length();
for (int i = len - 1; i >= 0; i--) {
if (num.charAt(i) == '1') {
dec = dec + base;
}
base = base * 2;
}
return dec;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int val = bintoDec(str);
if (val >= 65 && val <= 90) {
char ch = (char) val;
System.out.println(ch);
}
else {
System.out.println("INVALID PAPER CODE");
}

}
}