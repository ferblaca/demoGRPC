package com.example.grpc.demoGrpc;

import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import com.inditex.example.grpc.v1.ProductEndPointGrpc;
import com.inditex.example.grpc.v1.Service;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class ProductService extends ProductEndPointGrpc.ProductEndPointImplBase {

    @Override
    public void findAllProducts(Empty request, StreamObserver<Service.ProductResponseList> responseObserver) {
        super.findAllProducts(request, responseObserver);
    }

    @Override
    public void findAllProductsStreaming(Empty request, StreamObserver<Service.Product> responseObserver) {
        super.findAllProductsStreaming(request, responseObserver);
    }

    @Override
    public void count(Empty request, StreamObserver<Int64Value> responseObserver) {
        super.count(request, responseObserver);
    }

    @Override
    public void findProductById(StringValue request, StreamObserver<Service.ProductResponse> responseObserver) {
        super.findProductById(request, responseObserver);
    }

    @Override
    public void createProduct(Service.CreateProductRequest request, StreamObserver<Service.ProductResponse> responseObserver) {
        super.createProduct(request, responseObserver);
    }

    @Override
    public void modifyProduct(Service.ModifyProductRequest request, StreamObserver<Service.ProductResponse> responseObserver) {
        super.modifyProduct(request, responseObserver);
    }

    @Override
    public void deleteProduct(StringValue request, StreamObserver<Empty> responseObserver) {
        super.deleteProduct(request, responseObserver);
    }
}
