package filetransfer;

import filetransfer.FileTransferServiceGrpc.FileTransferServiceBlockingStub;
import filetransfer.Filetransfer.RequestData;
import filetransfer.Filetransfer.ResponseData;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class Client {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		RequestData requestData = RequestData.newBuilder().setText("��������").build();
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8883).usePlaintext(true).build();
		FileTransferServiceBlockingStub stub = FileTransferServiceGrpc.newBlockingStub(channel);

		Iterator<ResponseData> it = stub.serverSideStreamFun(requestData);
		long start = System.currentTimeMillis();
		while (it.hasNext()) {
			ResponseData data = it.next();
			System.out.println(data.getDeviceId());
			System.out.println(data.getRequestId());
			createFile(data.getRequestId() + ".jpg", data.getFileData().toByteArray());

		}
		channel.shutdown();
		System.out.println(System.currentTimeMillis() - start + " MS");

	}

	// 将byte数组写入文件
	public static void createFile(String filePath, byte[] content) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);
			fos.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
