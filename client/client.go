// package main

// import (
//     "context"
//     "log"
//     "os"
//     "time"

//     pb "github.com/rishiraj-intel/grpc-demo/protofile" // Import path for the generated Protobuf files
//     "google.golang.org/grpc"
// )

// const (
// 	address     = "mi-onboarding-manager:50054"
//     defaultName = "world"
// )

// func main() {
//     log.Printf("Connecting to gRPC server at %s", address)

//     // Set up a connection to the server.
//     conn, err := grpc.Dial(address, grpc.WithInsecure(), grpc.WithBlock())
//     if err != nil {
//         log.Fatalf("Failed to connect to gRPC server: %v", err)
//     }
//     defer conn.Close()

//     log.Printf("Connected to gRPC server at %s", address)

//     c := pb.NewNodeArtifactServiceNBClient(conn)

//     // Contact the server and print out its response.
//     name := defaultName
//     if len(os.Args) > 1 {
//         name = os.Args[1]
//     }
//     log.Printf("Sending request to server: %s", name)

//     ctx, cancel := context.WithTimeout(context.Background(), time.Second)
//     defer cancel()

//     r, err := c.FdoOnboardingTo2Req(ctx, &pb.FdoOnboardingReq{Request: name})
//     if err != nil {
//         log.Fatalf("Failed to send request: %v", err)
//     }

//     log.Printf("Received response from server: %s", r.Response)
// }

package main

import (
	"context"
	"log"

	pb "github.com/rishiraj-intel/grpc-demo/protofile" // Import path for the generated Protobuf files
	"google.golang.org/grpc"
)

const (
	address = "mi-onboarding-manager:50054"
)

func main() {
	// Set up a connection to the server.
	conn, err := grpc.Dial(address, grpc.WithInsecure(), grpc.WithBlock())
	if err != nil {
		log.Fatalf("Failed to connect to gRPC server: %v", err)
	}
	defer conn.Close()

	// Create a client instance
	c := pb.NewNodeArtifactServiceNBClient(conn)

	// Example: Call CreateArtifacts RPC
	createArtifactsResponse, err := c.CreateArtifacts(context.Background(), &pb.ArtifactRequest{
		Payload: []*pb.ArtifactData{
			{
				Name:         "Sample Artifact 1",
				Version:      "1.0",
				Platform:     "Linux",
				Category:     pb.ArtifactData_APPLICATION,
				Description:  "Sample application artifact",
				PackageUrl:   "https://example.com/sample_app.tar.gz",
				Author:       "John Doe",
				State:        true,
				License:      "MIT",
				Vendor:       "Acme Corp",
				Manufacturer: "Acme Manufacturing",
				ReleaseData:  "2024-07-08",
				ArtifactId:   "12345",
				Result:       pb.ArtifactData_SUCCESS,
			},
		},
	})
	if err != nil {
		log.Fatalf("Failed to call CreateArtifacts RPC: %v", err)
	}
	log.Printf("CreateArtifacts response: %+v", createArtifactsResponse)

	// Example: Call FdoOnboardingTo2Req RPC
	fdoOnboardingResponse, err := c.FdoOnboardingTo2Req(context.Background(), &pb.FdoOnboardingReq{
		Request: "Sample FDO request",
	})
	if err != nil {
		log.Fatalf("Failed to call FdoOnboardingTo2Req RPC: %v", err)
	}
	log.Printf("FdoOnboardingTo2Req response: %+v", fdoOnboardingResponse)
}
