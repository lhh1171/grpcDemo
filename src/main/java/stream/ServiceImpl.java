package stream;

import io.grpc.stub.StreamObserver;
import stream.Stream.RequestData;
import stream.Stream.ResponseData;
import stream.StreamServiceGrpc.StreamService;

public class ServiceImpl implements StreamService {

	@Override
	public void simpleFun(RequestData request, StreamObserver<ResponseData> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("?????????" + request.getText());
		responseObserver.onNext(ResponseData.newBuilder().setText("hello gRPC").build());
		responseObserver.onCompleted();
	}

	@Override
	public void serverSideStreamFun(RequestData request, StreamObserver<ResponseData> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("?????????" + request.getText());
		for (int i = 0; i < 10; i++) {
			responseObserver.onNext(ResponseData.newBuilder().setText("???" + i).build());
		}
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<RequestData> clientSideStreamFun(final StreamObserver<ResponseData> responseObserver) {
		// TODO Auto-generated method stub
		return new StreamObserver<RequestData>() {
			private ResponseData.Builder builder = ResponseData.newBuilder();

			@Override
			public void onNext(RequestData value) {
				// TODO Auto-generated method stub
				System.out.println("?????????" + value.getText());

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				builder.setText("??????????");
				responseObserver.onNext(builder.build());
				responseObserver.onCompleted();
			}

		};
	}

	@Override
	public StreamObserver<RequestData> twoWayStreamFun(final StreamObserver<ResponseData> responseObserver) {
		// TODO Auto-generated method stub
		return new StreamObserver<RequestData>() {

			@Override
			public void onNext(RequestData value) {
				// TODO Auto-generated method stub
				System.out.println("?????????" + value.getText());
				responseObserver.onNext(ResponseData.newBuilder().setText(value.getText() + "???????????").build());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				responseObserver.onCompleted();
			}

		};
	}

}
