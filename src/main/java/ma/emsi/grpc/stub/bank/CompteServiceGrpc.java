package ma.emsi.grpc.stub.bank;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final String SERVICE_NAME = "ma.emsi.grpc.CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.Empty,
      ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getGetAllComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllComptes",
      requestType = ma.emsi.grpc.stub.bank.Bank.Empty.class,
      responseType = ma.emsi.grpc.stub.bank.Bank.FindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.Empty,
      ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getGetAllComptesMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.Empty, ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getGetAllComptesMethod;
    if ((getGetAllComptesMethod = CompteServiceGrpc.getGetAllComptesMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetAllComptesMethod = CompteServiceGrpc.getGetAllComptesMethod) == null) {
          CompteServiceGrpc.getGetAllComptesMethod = getGetAllComptesMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpc.stub.bank.Bank.Empty, ma.emsi.grpc.stub.bank.Bank.FindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpc.CompteService", "GetAllComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.FindAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetAllComptes"))
                  .build();
          }
        }
     }
     return getGetAllComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.TypeCompte_req,
      ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getGetAllCompteswithtypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCompteswithtype",
      requestType = ma.emsi.grpc.stub.bank.Bank.TypeCompte_req.class,
      responseType = ma.emsi.grpc.stub.bank.Bank.FindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.TypeCompte_req,
      ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getGetAllCompteswithtypeMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.TypeCompte_req, ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getGetAllCompteswithtypeMethod;
    if ((getGetAllCompteswithtypeMethod = CompteServiceGrpc.getGetAllCompteswithtypeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetAllCompteswithtypeMethod = CompteServiceGrpc.getGetAllCompteswithtypeMethod) == null) {
          CompteServiceGrpc.getGetAllCompteswithtypeMethod = getGetAllCompteswithtypeMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpc.stub.bank.Bank.TypeCompte_req, ma.emsi.grpc.stub.bank.Bank.FindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpc.CompteService", "GetAllCompteswithtype"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.TypeCompte_req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.FindAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetAllCompteswithtype"))
                  .build();
          }
        }
     }
     return getGetAllCompteswithtypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest,
      ma.emsi.grpc.stub.bank.Bank.Compte> getGetCompteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompteById",
      requestType = ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest.class,
      responseType = ma.emsi.grpc.stub.bank.Bank.Compte.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest,
      ma.emsi.grpc.stub.bank.Bank.Compte> getGetCompteByIdMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest, ma.emsi.grpc.stub.bank.Bank.Compte> getGetCompteByIdMethod;
    if ((getGetCompteByIdMethod = CompteServiceGrpc.getGetCompteByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetCompteByIdMethod = CompteServiceGrpc.getGetCompteByIdMethod) == null) {
          CompteServiceGrpc.getGetCompteByIdMethod = getGetCompteByIdMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest, ma.emsi.grpc.stub.bank.Bank.Compte>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpc.CompteService", "GetCompteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.Compte.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetCompteById"))
                  .build();
          }
        }
     }
     return getGetCompteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.Empty,
      ma.emsi.grpc.stub.bank.Bank.SoldeStats> getGetTotalSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalSolde",
      requestType = ma.emsi.grpc.stub.bank.Bank.Empty.class,
      responseType = ma.emsi.grpc.stub.bank.Bank.SoldeStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.Empty,
      ma.emsi.grpc.stub.bank.Bank.SoldeStats> getGetTotalSoldeMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.Empty, ma.emsi.grpc.stub.bank.Bank.SoldeStats> getGetTotalSoldeMethod;
    if ((getGetTotalSoldeMethod = CompteServiceGrpc.getGetTotalSoldeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetTotalSoldeMethod = CompteServiceGrpc.getGetTotalSoldeMethod) == null) {
          CompteServiceGrpc.getGetTotalSoldeMethod = getGetTotalSoldeMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpc.stub.bank.Bank.Empty, ma.emsi.grpc.stub.bank.Bank.SoldeStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpc.CompteService", "GetTotalSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.SoldeStats.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetTotalSolde"))
                  .build();
          }
        }
     }
     return getGetTotalSoldeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.CompteRequest,
      ma.emsi.grpc.stub.bank.Bank.Compte> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCompte",
      requestType = ma.emsi.grpc.stub.bank.Bank.CompteRequest.class,
      responseType = ma.emsi.grpc.stub.bank.Bank.Compte.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.CompteRequest,
      ma.emsi.grpc.stub.bank.Bank.Compte> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.CompteRequest, ma.emsi.grpc.stub.bank.Bank.Compte> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
          CompteServiceGrpc.getSaveCompteMethod = getSaveCompteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpc.stub.bank.Bank.CompteRequest, ma.emsi.grpc.stub.bank.Bank.Compte>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpc.CompteService", "SaveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.CompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.Compte.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SaveCompte"))
                  .build();
          }
        }
     }
     return getSaveCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest,
      ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse> getDeleteCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompte",
      requestType = ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest.class,
      responseType = ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest,
      ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse> getDeleteCompteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest, ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse> getDeleteCompteMethod;
    if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
          CompteServiceGrpc.getDeleteCompteMethod = getDeleteCompteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest, ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpc.CompteService", "DeleteCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("DeleteCompte"))
                  .build();
          }
        }
     }
     return getDeleteCompteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    return new CompteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CompteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllComptes(ma.emsi.grpc.stub.bank.Bank.Empty request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.FindAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllComptesMethod(), responseObserver);
    }

    /**
     */
    public void getAllCompteswithtype(ma.emsi.grpc.stub.bank.Bank.TypeCompte_req request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.FindAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCompteswithtypeMethod(), responseObserver);
    }

    /**
     */
    public void getCompteById(ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.Compte> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompteByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTotalSolde(ma.emsi.grpc.stub.bank.Bank.Empty request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.SoldeStats> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTotalSoldeMethod(), responseObserver);
    }

    /**
     */
    public void saveCompte(ma.emsi.grpc.stub.bank.Bank.CompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.Compte> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    /**
     */
    public void deleteCompte(ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllComptesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpc.stub.bank.Bank.Empty,
                ma.emsi.grpc.stub.bank.Bank.FindAllResponse>(
                  this, METHODID_GET_ALL_COMPTES)))
          .addMethod(
            getGetAllCompteswithtypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpc.stub.bank.Bank.TypeCompte_req,
                ma.emsi.grpc.stub.bank.Bank.FindAllResponse>(
                  this, METHODID_GET_ALL_COMPTESWITHTYPE)))
          .addMethod(
            getGetCompteByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest,
                ma.emsi.grpc.stub.bank.Bank.Compte>(
                  this, METHODID_GET_COMPTE_BY_ID)))
          .addMethod(
            getGetTotalSoldeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpc.stub.bank.Bank.Empty,
                ma.emsi.grpc.stub.bank.Bank.SoldeStats>(
                  this, METHODID_GET_TOTAL_SOLDE)))
          .addMethod(
            getSaveCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpc.stub.bank.Bank.CompteRequest,
                ma.emsi.grpc.stub.bank.Bank.Compte>(
                  this, METHODID_SAVE_COMPTE)))
          .addMethod(
            getDeleteCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest,
                ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse>(
                  this, METHODID_DELETE_COMPTE)))
          .build();
    }
  }

  /**
   */
  public static final class CompteServiceStub extends io.grpc.stub.AbstractStub<CompteServiceStub> {
    private CompteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllComptes(ma.emsi.grpc.stub.bank.Bank.Empty request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.FindAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCompteswithtype(ma.emsi.grpc.stub.bank.Bank.TypeCompte_req request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.FindAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCompteswithtypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompteById(ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.Compte> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalSolde(ma.emsi.grpc.stub.bank.Bank.Empty request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.SoldeStats> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTotalSoldeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCompte(ma.emsi.grpc.stub.bank.Bank.CompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.Compte> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCompte(ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompteServiceBlockingStub extends io.grpc.stub.AbstractStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.emsi.grpc.stub.bank.Bank.FindAllResponse getAllComptes(ma.emsi.grpc.stub.bank.Bank.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllComptesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpc.stub.bank.Bank.FindAllResponse getAllCompteswithtype(ma.emsi.grpc.stub.bank.Bank.TypeCompte_req request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCompteswithtypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpc.stub.bank.Bank.Compte getCompteById(ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCompteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpc.stub.bank.Bank.SoldeStats getTotalSolde(ma.emsi.grpc.stub.bank.Bank.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetTotalSoldeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpc.stub.bank.Bank.Compte saveCompte(ma.emsi.grpc.stub.bank.Bank.CompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse deleteCompte(ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCompteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompteServiceFutureStub extends io.grpc.stub.AbstractStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getAllComptes(
        ma.emsi.grpc.stub.bank.Bank.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllComptesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpc.stub.bank.Bank.FindAllResponse> getAllCompteswithtype(
        ma.emsi.grpc.stub.bank.Bank.TypeCompte_req request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCompteswithtypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpc.stub.bank.Bank.Compte> getCompteById(
        ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpc.stub.bank.Bank.SoldeStats> getTotalSolde(
        ma.emsi.grpc.stub.bank.Bank.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTotalSoldeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpc.stub.bank.Bank.Compte> saveCompte(
        ma.emsi.grpc.stub.bank.Bank.CompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse> deleteCompte(
        ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_COMPTES = 0;
  private static final int METHODID_GET_ALL_COMPTESWITHTYPE = 1;
  private static final int METHODID_GET_COMPTE_BY_ID = 2;
  private static final int METHODID_GET_TOTAL_SOLDE = 3;
  private static final int METHODID_SAVE_COMPTE = 4;
  private static final int METHODID_DELETE_COMPTE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_COMPTES:
          serviceImpl.getAllComptes((ma.emsi.grpc.stub.bank.Bank.Empty) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.FindAllResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_COMPTESWITHTYPE:
          serviceImpl.getAllCompteswithtype((ma.emsi.grpc.stub.bank.Bank.TypeCompte_req) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.FindAllResponse>) responseObserver);
          break;
        case METHODID_GET_COMPTE_BY_ID:
          serviceImpl.getCompteById((ma.emsi.grpc.stub.bank.Bank.GetCompteByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.Compte>) responseObserver);
          break;
        case METHODID_GET_TOTAL_SOLDE:
          serviceImpl.getTotalSolde((ma.emsi.grpc.stub.bank.Bank.Empty) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.SoldeStats>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((ma.emsi.grpc.stub.bank.Bank.CompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.Compte>) responseObserver);
          break;
        case METHODID_DELETE_COMPTE:
          serviceImpl.deleteCompte((ma.emsi.grpc.stub.bank.Bank.DeleteCompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpc.stub.bank.Bank.DeleteCompteResponse>) responseObserver);
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

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.emsi.grpc.stub.bank.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getGetAllComptesMethod())
              .addMethod(getGetAllCompteswithtypeMethod())
              .addMethod(getGetCompteByIdMethod())
              .addMethod(getGetTotalSoldeMethod())
              .addMethod(getSaveCompteMethod())
              .addMethod(getDeleteCompteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
