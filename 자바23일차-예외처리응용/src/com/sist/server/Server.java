package com.sist.server;
import java.net.*;
import java.util.*;
import java.io.*;
public class Server implements Runnable{
    private ServerSocket ss;
    private final int PORT=3355;
    private Vector<Client> waitVc=new Vector<Client>();
    // 접속자 저장(정보) => ip
    // 서버 (접속)
    public Server()
    {
    	try
    	{
    		ss=new ServerSocket(PORT);
    		System.out.println("Server Start...");
    	}catch(Exception ex){}
    }
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			
			try
			{
				Socket s=ss.accept();
				Client client=new Client(s);
				System.out.println(s.getPort());
				System.out.println(s.getInetAddress().getHostAddress());
				waitVc.add(client);
				client.start();
			}catch(Exception ex){}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Server server=new Server();
         new Thread(server).start();
	}

	// 통신 담당 => 
	class Client extends Thread
	{
		Socket s;
		OutputStream out;
		BufferedReader in;
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(
						new InputStreamReader(s.getInputStream()));
			}catch(Exception ex){}
		}
		public void run()
		{
			while(true)
			{
				try
				{
					String msg=in.readLine();
					for(Client c:waitVc)
					{
						c.out.write((msg+"\n").getBytes());
					}
				}catch(Exception ex){}
			}
		}
	}

}
