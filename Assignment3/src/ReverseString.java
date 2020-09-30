import java.util.Collection;
import java.util.Stack;

public class ReverseString {
    public String reverse(String s) {
        String[] word=s.split(" ");
        StringBuilder sb=new StringBuilder();
        int len= word.length;
        for(int i=len-1;i>=0;i--){
            if(!"".equals(word[i]))
                sb.append(word[i]+" ");
        }
        if(sb.length()!=0)
            sb.deleteCharAt(sb.length()-1);
        return  sb.toString();
    }
       /* The code below has
       input: Hello this world!
       output: world! this olleH
       Why the first word 'Hello' cannot be in right order?

    public String reverse(String s) {
       char[] a=s.toCharArray();
        swap(a,0,a.length-1);

        int blank=-1;
        for (int i=0;i<a.length;i++){
            if (a[i]==' '){
                int nextBlank=i;
                swap(a,blank+1,nextBlank-1);
                blank=nextBlank;
            }
        }

        return (new String(a));
    }

    private void swap(char[] c, int begin, int end) {
        while (begin<end){
            char temp=c[begin];
            c[begin]=c[end];
            c[end]=temp;
            begin++;
            end--;
        }
    }*/
}