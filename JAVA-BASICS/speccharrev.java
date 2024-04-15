import java.util.*;
public class speccharrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int len = str.length();
        int i, j=len-1;
        for(i=0;i<j;i++) {
            for (j=j; i < j; j--) {
                while (!((ch[i]) >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') ||
                        (ch[i] >= '0' && ch[i] <= '9')) {
                    i++;
                }
                while (!((ch[j]) >= 'A' && ch[j] <= 'Z') || (ch[j] >= 'a' && ch[j] <= 'z') ||
                        (ch[j] >= '0' && ch[j] <= '9')) {
                    j--;
                }
                char temp;
                if (i < j) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        for(i=0;i<len;i++)

        {
            System.out.print(ch[i]);
        }

    }

}
