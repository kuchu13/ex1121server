import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try{

            ServerSocket svs=new ServerSocket(2525);
            System.out.println("等待客戶端的請求中...");
            Socket s =svs.accept();
            System.out.println("客戶端已和本機連上線...");

            OutputStream out=s.getOutputStream();
            String str="Honor shows the man.";
            System.out.println("資料正在傳送中...");
            out.write(str.getBytes());
            out.close();
            s.close();
            System.out.println("資料傳送完畢...");
        }
        catch(Exception e){

            System.out.println("發生了"+e+"例外");

        }
    }
}
