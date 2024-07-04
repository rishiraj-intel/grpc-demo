package main

import (
	"context"
	"log"
	"net"

	pb "github.com/rishiraj-intel/grpc-demo/protofile" // Import path for the generated Protobuf files
	"google.golang.org/grpc"
)

// type server struct {
//     pb.UnimplementedHelloWorldServiceServer
// }

// func (s *server) SayHello(ctx context.Context, in *pb.HelloWorldRequest) (*pb.HelloWorldResponse, error) {
//     log.Printf("Received: %v", in.Message)
//     return &pb.HelloWorldResponse{Message: "Hello, " + in.Message}, nil
// }

// func main() {
//     lis, err := net.Listen("tcp", ":9090")
//     if err != nil {
//         log.Fatalf("failed to listen: %v", err)
//     }
//     s := grpc.NewServer()
//     pb.RegisterHelloWorldServiceServer(s, &server{})
//     log.Println("Server started at :9090")
//     if err := s.Serve(lis); err != nil {
//         log.Fatalf("failed to serve: %v", err)
//     }
// }

type server struct {
	pb.UnimplementedNodeArtifactServiceNBServer
}

// FdoOnboardingTo2Req implements NodeArtifactServiceNB.FdoOnboardingTo2Req
func (s *server) FdoOnboardingTo2Req(ctx context.Context, req *pb.FdoOnboardingReq) (*pb.FdoOnboardingResponse, error) {
	log.Printf("Received request: %s", req.Request)
	return &pb.FdoOnboardingResponse{Response: "Response from server"}, nil
}

func main() {
	lis, err := net.Listen("tcp", ":9090")
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}
	s := grpc.NewServer()
	pb.RegisterNodeArtifactServiceNBServer(s, &server{}) // Register the service implementation
	log.Println("Server started at :9090")
	if err := s.Serve(lis); err != nil {
		log.Fatalf("failed to serve: %v", err)
	}
}
