import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String S,S1="",a="abcdefghijklmnopqrstuvwxyz",k="";int N,b;char c,ch,p;
        N=in.nextInt();
        
        S=in.nextLine();
        for(int i=0;i<(N-1);i=i+2){
            c=S.charAt(i);
            ch=S.charAt(i+1);
            S1+=ch+c;
        }
        for(int j=0;j<N;j++){
            p=S.charAt(j);
            if(p>='a' && p<='z'){
                b=25-(a.indexOf(p));
                k+=a.charAt(b);
            }
             
        }
        System.out.println(k);
    }
}