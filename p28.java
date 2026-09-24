import java.io.*;

public class p28 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入一個整數");
        int num = Integer.parseInt(br.readLine());
        System.out.println("您輸入的數字是:" + num);
        System.out.println("請輸入字串");
        String str = br.readLine();
        System.out.println("剛剛輸入的字串是:" + str);
    }
}
