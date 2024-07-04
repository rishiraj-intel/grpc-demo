import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Artifact &amp; Node Endpoints towards Inventory Manager
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: fdoonboarding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NodeArtifactServiceNBGrpc {

  private NodeArtifactServiceNBGrpc() {}

  public static final java.lang.String SERVICE_NAME = "NodeArtifactServiceNB";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Fdoonboarding.FdoOnboardingReq,
      Fdoonboarding.FdoOnboardingResponse> getFdoOnboardingTo2ReqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FdoOnboardingTo2Req",
      requestType = Fdoonboarding.FdoOnboardingReq.class,
      responseType = Fdoonboarding.FdoOnboardingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Fdoonboarding.FdoOnboardingReq,
      Fdoonboarding.FdoOnboardingResponse> getFdoOnboardingTo2ReqMethod() {
    io.grpc.MethodDescriptor<Fdoonboarding.FdoOnboardingReq, Fdoonboarding.FdoOnboardingResponse> getFdoOnboardingTo2ReqMethod;
    if ((getFdoOnboardingTo2ReqMethod = NodeArtifactServiceNBGrpc.getFdoOnboardingTo2ReqMethod) == null) {
      synchronized (NodeArtifactServiceNBGrpc.class) {
        if ((getFdoOnboardingTo2ReqMethod = NodeArtifactServiceNBGrpc.getFdoOnboardingTo2ReqMethod) == null) {
          NodeArtifactServiceNBGrpc.getFdoOnboardingTo2ReqMethod = getFdoOnboardingTo2ReqMethod =
              io.grpc.MethodDescriptor.<Fdoonboarding.FdoOnboardingReq, Fdoonboarding.FdoOnboardingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FdoOnboardingTo2Req"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Fdoonboarding.FdoOnboardingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Fdoonboarding.FdoOnboardingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeArtifactServiceNBMethodDescriptorSupplier("FdoOnboardingTo2Req"))
              .build();
        }
      }
    }
    return getFdoOnboardingTo2ReqMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeArtifactServiceNBStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeArtifactServiceNBStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeArtifactServiceNBStub>() {
        @java.lang.Override
        public NodeArtifactServiceNBStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeArtifactServiceNBStub(channel, callOptions);
        }
      };
    return NodeArtifactServiceNBStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeArtifactServiceNBBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeArtifactServiceNBBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeArtifactServiceNBBlockingStub>() {
        @java.lang.Override
        public NodeArtifactServiceNBBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeArtifactServiceNBBlockingStub(channel, callOptions);
        }
      };
    return NodeArtifactServiceNBBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeArtifactServiceNBFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeArtifactServiceNBFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeArtifactServiceNBFutureStub>() {
        @java.lang.Override
        public NodeArtifactServiceNBFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeArtifactServiceNBFutureStub(channel, callOptions);
        }
      };
    return NodeArtifactServiceNBFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Artifact &amp; Node Endpoints towards Inventory Manager
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void fdoOnboardingTo2Req(Fdoonboarding.FdoOnboardingReq request,
        io.grpc.stub.StreamObserver<Fdoonboarding.FdoOnboardingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFdoOnboardingTo2ReqMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NodeArtifactServiceNB.
   * <pre>
   * Artifact &amp; Node Endpoints towards Inventory Manager
   * </pre>
   */
  public static abstract class NodeArtifactServiceNBImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NodeArtifactServiceNBGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NodeArtifactServiceNB.
   * <pre>
   * Artifact &amp; Node Endpoints towards Inventory Manager
   * </pre>
   */
  public static final class NodeArtifactServiceNBStub
      extends io.grpc.stub.AbstractAsyncStub<NodeArtifactServiceNBStub> {
    private NodeArtifactServiceNBStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeArtifactServiceNBStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeArtifactServiceNBStub(channel, callOptions);
    }

    /**
     */
    public void fdoOnboardingTo2Req(Fdoonboarding.FdoOnboardingReq request,
        io.grpc.stub.StreamObserver<Fdoonboarding.FdoOnboardingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFdoOnboardingTo2ReqMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NodeArtifactServiceNB.
   * <pre>
   * Artifact &amp; Node Endpoints towards Inventory Manager
   * </pre>
   */
  public static final class NodeArtifactServiceNBBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NodeArtifactServiceNBBlockingStub> {
    private NodeArtifactServiceNBBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeArtifactServiceNBBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeArtifactServiceNBBlockingStub(channel, callOptions);
    }

    /**
     */
    public Fdoonboarding.FdoOnboardingResponse fdoOnboardingTo2Req(Fdoonboarding.FdoOnboardingReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFdoOnboardingTo2ReqMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NodeArtifactServiceNB.
   * <pre>
   * Artifact &amp; Node Endpoints towards Inventory Manager
   * </pre>
   */
  public static final class NodeArtifactServiceNBFutureStub
      extends io.grpc.stub.AbstractFutureStub<NodeArtifactServiceNBFutureStub> {
    private NodeArtifactServiceNBFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeArtifactServiceNBFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeArtifactServiceNBFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Fdoonboarding.FdoOnboardingResponse> fdoOnboardingTo2Req(
        Fdoonboarding.FdoOnboardingReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFdoOnboardingTo2ReqMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FDO_ONBOARDING_TO2REQ = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FDO_ONBOARDING_TO2REQ:
          serviceImpl.fdoOnboardingTo2Req((Fdoonboarding.FdoOnboardingReq) request,
              (io.grpc.stub.StreamObserver<Fdoonboarding.FdoOnboardingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFdoOnboardingTo2ReqMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Fdoonboarding.FdoOnboardingReq,
              Fdoonboarding.FdoOnboardingResponse>(
                service, METHODID_FDO_ONBOARDING_TO2REQ)))
        .build();
  }

  private static abstract class NodeArtifactServiceNBBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeArtifactServiceNBBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Fdoonboarding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NodeArtifactServiceNB");
    }
  }

  private static final class NodeArtifactServiceNBFileDescriptorSupplier
      extends NodeArtifactServiceNBBaseDescriptorSupplier {
    NodeArtifactServiceNBFileDescriptorSupplier() {}
  }

  private static final class NodeArtifactServiceNBMethodDescriptorSupplier
      extends NodeArtifactServiceNBBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NodeArtifactServiceNBMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NodeArtifactServiceNBGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeArtifactServiceNBFileDescriptorSupplier())
              .addMethod(getFdoOnboardingTo2ReqMethod())
              .build();
        }
      }
    }
    return result;
  }
}
