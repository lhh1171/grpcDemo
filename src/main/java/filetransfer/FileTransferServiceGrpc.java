package filetransfer;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class FileTransferServiceGrpc {

  private FileTransferServiceGrpc() {}

  public static final String SERVICE_NAME = "filetransfer.FileTransferService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi(value = "")
  public static final io.grpc.MethodDescriptor<Filetransfer.RequestData,
      Filetransfer.ResponseData> METHOD_SERVER_SIDE_STREAM_FUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "filetransfer.FileTransferService", "ServerSideStreamFun"),
          io.grpc.protobuf.ProtoUtils.marshaller(Filetransfer.RequestData.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Filetransfer.ResponseData.getDefaultInstance()));

  public static FileTransferServiceStub newStub(io.grpc.Channel channel) {
    return new FileTransferServiceStub(channel);
  }

  public static FileTransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileTransferServiceBlockingStub(channel);
  }

  public static FileTransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileTransferServiceFutureStub(channel);
  }

  public static interface FileTransferService {

    public void serverSideStreamFun(Filetransfer.RequestData request,
                                    io.grpc.stub.StreamObserver<Filetransfer.ResponseData> responseObserver);
  }

  public static interface FileTransferServiceBlockingClient {

    public java.util.Iterator<Filetransfer.ResponseData> serverSideStreamFun(
            Filetransfer.RequestData request);
  }

  public static interface FileTransferServiceFutureClient {
  }

  public static class FileTransferServiceStub extends io.grpc.stub.AbstractStub<FileTransferServiceStub>
      implements FileTransferService {
    private FileTransferServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileTransferServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FileTransferServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileTransferServiceStub(channel, callOptions);
    }

    @Override
    public void serverSideStreamFun(Filetransfer.RequestData request,
                                    io.grpc.stub.StreamObserver<Filetransfer.ResponseData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SERVER_SIDE_STREAM_FUN, getCallOptions()), request, responseObserver);
    }
  }

  public static class FileTransferServiceBlockingStub extends io.grpc.stub.AbstractStub<FileTransferServiceBlockingStub>
      implements FileTransferServiceBlockingClient {
    private FileTransferServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileTransferServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FileTransferServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileTransferServiceBlockingStub(channel, callOptions);
    }

    @Override
    public java.util.Iterator<Filetransfer.ResponseData> serverSideStreamFun(
        Filetransfer.RequestData request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SERVER_SIDE_STREAM_FUN, getCallOptions(), request);
    }
  }

  public static class FileTransferServiceFutureStub extends io.grpc.stub.AbstractStub<FileTransferServiceFutureStub>
      implements FileTransferServiceFutureClient {
    private FileTransferServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileTransferServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FileTransferServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileTransferServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SERVER_SIDE_STREAM_FUN = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileTransferService serviceImpl;
    private final int methodId;

    public MethodHandlers(FileTransferService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_SIDE_STREAM_FUN:
          serviceImpl.serverSideStreamFun((Filetransfer.RequestData) request,
              (io.grpc.stub.StreamObserver<Filetransfer.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final FileTransferService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_SERVER_SIDE_STREAM_FUN,
          asyncServerStreamingCall(
            new MethodHandlers<
              Filetransfer.RequestData,
              Filetransfer.ResponseData>(
                serviceImpl, METHODID_SERVER_SIDE_STREAM_FUN)))
        .build();
  }
}
