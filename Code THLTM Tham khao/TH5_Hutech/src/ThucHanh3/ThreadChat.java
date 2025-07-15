/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh3;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ad
 */
public class ThreadChat implements Runnable{
    private Scanner in = null;
    private Socket socket = null;
    public TCPClientChat chat= null;
    ServerSocket server=null;
    public ThreadChat()
    {
        try{
            server = new ServerSocket(1234);//Tạo ra server mới port 1234 là tham số
        }catch(Exception e){e.printStackTrace();}
         new Thread(this).start(); //Khởi động thread
    }
    public void run()
    {
        try{
            while(true)
            {
                while((socket = server.accept())!=null)//nhận kết nối từ máy khác
                {
                    this.in=new Scanner(this.socket.getInputStream());
                    String chuoi= in.nextLine().trim();//nhận chuỗi
                    chat.Hienthi(chuoi+"\n");//Hiển thị chuỗi ra màn hình  
                }
            }
    }catch(Exception e){}
        finally{
            try{socket.close();}catch(Exception e){}
        }
        
    }
    
    
}
