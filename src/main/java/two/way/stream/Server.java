package two.way.stream;

import stream.ServiceImpl;
import stream.StreamServiceGrpc;
import stream.StreamServiceGrpc.StreamService;

import java.io.IOException;

//rpc请求接收器
public class Server {
	private static int port = 8883;
	private static io.grpc.Server server;
	public void run() {
		StreamService serviceImpl = new ServiceImpl();
		server = io.grpc.ServerBuilder.forPort(port).addService(StreamServiceGrpc.bindService(serviceImpl)).build();
		try {
			server.start();
			System.out.println("Server start success on port:" + port);
			server.awaitTermination();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.run();
	}
}
