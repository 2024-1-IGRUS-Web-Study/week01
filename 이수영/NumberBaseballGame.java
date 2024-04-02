import java.util.Random;
import java.util.Scanner;
public class NumberBaseballGame {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rd = new Random();
        rd.setSeed(System.currentTimeMillis());
        int re=rd.nextInt(900)+100;
        System.out.println(re);
        String cstr;
        int r=re;
        int[]read=new int[3];
        int[]real=new int[3];
        for(int i=0; i<3; i++)
        {
            real[i]=r%10;
            r=r/10;
        }
        while(true)
        {
            int strike=0, ball=0, out=0;
            System.out.print("3자리 숫자를 입력해주세요>>");
            cstr=scanner.nextLine();
            if(cstr.equals("exit"))
            {
                break;
            }
            int c=Integer.parseInt(cstr);
            if(c==re)
            {
                System.out.println("정답입니다!");
                break;
            }
            for(int i=0; i<3; i++)
            {
                read[i]=c%10;
                c=c/10;
            }
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    if(j==i&&read[j]==real[i])
                    {
                        strike++;
                    }
                    else if(read[j]==real[i])
                    {
                        ball++;
                    }
                }

            }
            out=3-strike-ball;
            System.out.println("strike: "+strike+" ball: "+ball+" out: "+out);
        }

    }
}
