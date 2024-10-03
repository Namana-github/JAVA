import java.util.Random;
public class TestPassword {
    public static void main(String[] args) {
        String upper_case="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_case="abcdefghijklmnopqrstuvwxyz";
        String num="123456789";
        String all_char="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
        Random rand1=new Random();
        Random rand2=new Random();
        Random rand3=new Random();
        Random rand4=new Random();
        int r1=rand1.nextInt(25);
        int r2=rand2.nextInt(25);
        int r3=rand3.nextInt(10);
        String s1="",s2="",s3="",s4="",al="";
        s1=upper_case.substring(r1,r1+1);
        s2=lower_case.substring(r2,r2+1);
        s3=num.substring(r3,r3+1);
        for (int i=0;i<=4;i++){
            int r4=rand4.nextInt(60);
            s4=all_char.substring(r4,r4+1);
            al=al+s4;   
        }
        System.out.println(s1+s2+s3+al);
    }
}
