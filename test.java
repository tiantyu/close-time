import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        System.out.println("您想要：\n1.设定自动关机\n2.设定自动重启\n3.取消自动关机或重启\n4.启用屏幕保护");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            System.out.println("您的电脑将于（ ）秒后关机");
            int b=sc.nextInt();
            Runtime.getRuntime().exec("shutdown -s -t "+b);
        }else if (a==2) {
            System.out.println("您的电脑将于（ ）秒后重启");
            int b=sc.nextInt();
            Runtime.getRuntime().exec("shutdown -r -t "+b);
        }else if (a==3) {
            Runtime.getRuntime().exec("shutdown -a");
            System.out.println("您的电脑已取消自动关机");
        } else if (a==4) {
            Runtime.getRuntime().exec("rundll32.exe user32.dll LockWorkStation");
        }
    }
}
