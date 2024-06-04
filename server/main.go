package main

import (
    "context"
    "log"
    "net"

    "google.golang.org/grpc"
    pb "github.com/rishiraj-intel/grpc-demo/protofile" // Import path for the generated Protobuf files
)

type server struct {
    pb.UnimplementedHelloWorldServiceServer
}

func (s *server) SayHello(ctx context.Context, in *pb.HelloWorldRequest) (*pb.HelloWorldResponse, error) {
    log.Printf("Received: %v", in.Message)
    return &pb.HelloWorldResponse{Message: "Hello, " + in.Message}, nil
}

func main() {
    lis, err := net.Listen("tcp", ":9090")
    if err != nil {
        log.Fatalf("failed to listen: %v", err)
    }
    s := grpc.NewServer()
    pb.RegisterHelloWorldServiceServer(s, &server{})
    log.Println("Server started at :9090")
    if err := s.Serve(lis); err != nil {
        log.Fatalf("failed to serve: %v", err)
    }
}

