package stream;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class StreamServiceGrpc {

  private StreamServiceGrpc() {}

  public static final String SERVICE_NAME = "stream.StreamService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi(value = "")
  public static final io.grpc.MethodDescriptor<Stream.RequestData,
      Stream.ResponseData> METHOD_SIMPLE_FUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "stream.StreamService", "SimpleFun"),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.RequestData.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.ResponseData.getDefaultInstance()));
  @io.grpc.ExperimentalApi(value = "")
  public static final io.grpc.MethodDescriptor<Stream.RequestData,
      Stream.ResponseData> METHOD_SERVER_SIDE_STREAM_FUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "stream.StreamService", "ServerSideStreamFun"),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.RequestData.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.ResponseData.getDefaultInstance()));
  @io.grpc.ExperimentalApi(value = "")
  public static final io.grpc.MethodDescriptor<Stream.RequestData,
      Stream.ResponseData> METHOD_CLIENT_SIDE_STREAM_FUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "stream.StreamService", "ClientSideStreamFun"),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.RequestData.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.ResponseData.getDefaultInstance()));
  @io.grpc.ExperimentalApi(value = "")
  public static final io.grpc.MethodDescriptor<Stream.RequestData,
      Stream.ResponseData> METHOD_TWO_WAY_STREAM_FUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "stream.StreamService", "TwoWayStreamFun"),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.RequestData.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Stream.ResponseData.getDefaultInstance()));

  public static StreamServiceStub newStub(io.grpc.Channel channel) {
    return new StreamServiceStub(channel);
  }

  public static StreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StreamServiceBlockingStub(channel);
  }

  public static StreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StreamServiceFutureStub(channel);
  }

  public static interface StreamService {

    public void simpleFun(Stream.RequestData request,
                          io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver);

    public void serverSideStreamFun(Stream.RequestData request,
                                    io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver);

    public io.grpc.stub.StreamObserver<Stream.RequestData> clientSideStreamFun(
            io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver);

    public io.grpc.stub.StreamObserver<Stream.RequestData> twoWayStreamFun(
            io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver);
  }

  public static interface StreamServiceBlockingClient {

    public Stream.ResponseData simpleFun(Stream.RequestData request);

    public java.util.Iterator<Stream.ResponseData> serverSideStreamFun(
            Stream.RequestData request);
  }

  public static interface StreamServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<Stream.ResponseData> simpleFun(
            Stream.RequestData request);
  }

  public static class StreamServiceStub extends io.grpc.stub.AbstractStub<StreamServiceStub>
      implements StreamService {
    private StreamServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StreamServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamServiceStub(channel, callOptions);
    }

    @Override
    public void simpleFun(Stream.RequestData request,
                          io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIMPLE_FUN, getCallOptions()), request, responseObserver);
    }

    @Override
    public void serverSideStreamFun(Stream.RequestData request,
                                    io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SERVER_SIDE_STREAM_FUN, getCallOptions()), request, responseObserver);
    }

    @Override
    public io.grpc.stub.StreamObserver<Stream.RequestData> clientSideStreamFun(
        io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_CLIENT_SIDE_STREAM_FUN, getCallOptions()), responseObserver);
    }

    @Override
    public io.grpc.stub.StreamObserver<Stream.RequestData> twoWayStreamFun(
        io.grpc.stub.StreamObserver<Stream.ResponseData> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_TWO_WAY_STREAM_FUN, getCallOptions()), responseObserver);
    }
  }

  public static class StreamServiceBlockingStub extends io.grpc.stub.AbstractStub<StreamServiceBlockingStub>
      implements StreamServiceBlockingClient {
    private StreamServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StreamServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamServiceBlockingStub(channel, callOptions);
    }

    @Override
    public Stream.ResponseData simpleFun(Stream.RequestData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIMPLE_FUN, getCallOptions(), request);
    }

    @Override
    public java.util.Iterator<Stream.ResponseData> serverSideStreamFun(
        Stream.RequestData request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SERVER_SIDE_STREAM_FUN, getCallOptions(), request);
    }
  }

  public static class StreamServiceFutureStub extends io.grpc.stub.AbstractStub<StreamServiceFutureStub>
      implements StreamServiceFutureClient {
    private StreamServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StreamServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamServiceFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<Stream.ResponseData> simpleFun(
        Stream.RequestData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIMPLE_FUN, getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_FUN = 0;
  private static final int METHODID_SERVER_SIDE_STREAM_FUN = 1;
  private static final int METHODID_CLIENT_SIDE_STREAM_FUN = 2;
  private static final int METHODID_TWO_WAY_STREAM_FUN = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamService serviceImpl;
    private final int methodId;

    public MethodHandlers(StreamService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_FUN:
          serviceImpl.simpleFun((Stream.RequestData) request,
              (io.grpc.stub.StreamObserver<Stream.ResponseData>) responseObserver);
          break;
        case METHODID_SERVER_SIDE_STREAM_FUN:
          serviceImpl.serverSideStreamFun((Stream.RequestData) request,
              (io.grpc.stub.StreamObserver<Stream.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_SIDE_STREAM_FUN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreamFun(
              (io.grpc.stub.StreamObserver<Stream.ResponseData>) responseObserver);
        case METHODID_TWO_WAY_STREAM_FUN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.twoWayStreamFun(
              (io.grpc.stub.StreamObserver<Stream.ResponseData>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final StreamService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_SIMPLE_FUN,
          asyncUnaryCall(
            new MethodHandlers<
              Stream.RequestData,
              Stream.ResponseData>(
                serviceImpl, METHODID_SIMPLE_FUN)))
        .addMethod(
          METHOD_SERVER_SIDE_STREAM_FUN,
          asyncServerStreamingCall(
            new MethodHandlers<
              Stream.RequestData,
              Stream.ResponseData>(
                serviceImpl, METHODID_SERVER_SIDE_STREAM_FUN)))
        .addMethod(
          METHOD_CLIENT_SIDE_STREAM_FUN,
          asyncClientStreamingCall(
            new MethodHandlers<
              Stream.RequestData,
              Stream.ResponseData>(
                serviceImpl, METHODID_CLIENT_SIDE_STREAM_FUN)))
        .addMethod(
          METHOD_TWO_WAY_STREAM_FUN,
          asyncBidiStreamingCall(
            new MethodHandlers<
              Stream.RequestData,
              Stream.ResponseData>(
                serviceImpl, METHODID_TWO_WAY_STREAM_FUN)))
        .build();
  }
}
