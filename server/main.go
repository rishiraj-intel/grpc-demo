// package main

// import (
// 	"context"
// 	"log"
// 	"net"

// 	pb "github.com/rishiraj-intel/grpc-demo/protofile" // Import path for the generated Protobuf files
// 	"google.golang.org/grpc"
// )

// // type server struct {
// //     pb.UnimplementedHelloWorldServiceServer
// // }

// // func (s *server) SayHello(ctx context.Context, in *pb.HelloWorldRequest) (*pb.HelloWorldResponse, error) {
// //     log.Printf("Received: %v", in.Message)
// //     return &pb.HelloWorldResponse{Message: "Hello, " + in.Message}, nil
// // }

// // func main() {
// //     lis, err := net.Listen("tcp", ":9090")
// //     if err != nil {
// //         log.Fatalf("failed to listen: %v", err)
// //     }
// //     s := grpc.NewServer()
// //     pb.RegisterHelloWorldServiceServer(s, &server{})
// //     log.Println("Server started at :9090")
// //     if err := s.Serve(lis); err != nil {
// //         log.Fatalf("failed to serve: %v", err)
// //     }
// // }

// type server struct {
// 	pb.UnimplementedNodeArtifactServiceNBServer
// }

// // FdoOnboardingTo2Req implements NodeArtifactServiceNB.FdoOnboardingTo2Req
// func (s *server) FdoOnboardingTo2Req(ctx context.Context, req *pb.FdoOnboardingReq) (*pb.FdoOnboardingResponse, error) {
// 	log.Printf("Received request: %s", req.Request)
// 	return &pb.FdoOnboardingResponse{Response: "Response from server"}, nil
// }

// func main() {
// 	lis, err := net.Listen("tcp", ":9090")
// 	if err != nil {
// 		log.Fatalf("failed to listen: %v", err)
// 	}
// 	s := grpc.NewServer()
// 	pb.RegisterNodeArtifactServiceNBServer(s, &server{}) // Register the service implementation
// 	log.Println("Server started at :9090")
// 	if err := s.Serve(lis); err != nil {
// 		log.Fatalf("failed to serve: %v", err)
// 	}
// }

package main

import (
	"context"
	"log"
	"net"

	pb "github.com/rishiraj-intel/grpc-demo/protofile" // Import path for the generated Protobuf files
	"google.golang.org/grpc"
)

type server struct {
	pb.UnimplementedNodeArtifactServiceNBServer
}

// CreateArtifacts implements NodeArtifactServiceNB.CreateArtifacts
func (s *server) CreateArtifacts(ctx context.Context, req *pb.ArtifactRequest) (*pb.ArtifactResponse, error) {
	log.Printf("Received CreateArtifacts request with %d artifacts", len(req.Payload))

	// Here you can implement your logic to handle the CreateArtifacts request
	// For demonstration, we'll just return a success response echoing back the request
	resp := &pb.ArtifactResponse{
		Payload: req.Payload,
	}
	return resp, nil
}

// FdoOnboardingTo2Req implements NodeArtifactServiceNB.FdoOnboardingTo2Req
func (s *server) FdoOnboardingTo2Req(ctx context.Context, req *pb.FdoOnboardingReq) (*pb.FdoOnboardingResponse, error) {
	log.Printf("Received FdoOnboardingTo2Req request: %s", req.Request)

	// Here you can implement your logic to handle the FdoOnboardingTo2Req request
	// For demonstration, we'll just return a fixed response
	resp := &pb.FdoOnboardingResponse{
		Response: "Hello, " + req.Request,
	}
	return resp, nil
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
