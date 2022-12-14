package simple.fun;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;
import stream.Stream.RequestData;
import stream.Stream.ResponseData;
import stream.StreamServiceGrpc;
import stream.StreamServiceGrpc.StreamServiceBlockingStub;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException, IOException {	
		ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 8883).usePlaintext(true).build();

		StreamServiceBlockingStub stub = StreamServiceGrpc.newBlockingStub(channel);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			RequestData requestData = RequestData.newBuilder().setText("hello world").build();
			//调用server端的方法
			ResponseData responseData = stub.simpleFun(requestData);
			System.out.println(responseData.getText());
		}
		System.out.println(System.currentTimeMillis() - start + " MS");
		channel.shutdown();
	}
}
