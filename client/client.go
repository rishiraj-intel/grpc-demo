package main

import (
    "context"
    "log"
    "os"
    "time"

    pb "github.com/rishiraj-intel/grpc-demo/protofile" // Import path for the generated Protobuf files
    "google.golang.org/grpc"
)

const (
    address     = "localhost:9090"
    defaultName = "world"
)

func main() {
    // Set up a connection to the server.
    conn, err := grpc.Dial(address, grpc.WithInsecure(), grpc.WithBlock())
    if err != nil {
        log.Fatalf("did not connect: %v", err)
    }
    defer conn.Close()
    c := pb.NewNodeArtifactServiceNBClient(conn)

    // Contact the server and print out its response.
    name := defaultName
    if len(os.Args) > 1 {
        name = os.Args[1]
    }
    ctx, cancel := context.WithTimeout(context.Background(), time.Second)
    defer cancel()
    r, err := c.FdoOnboardingTo2Req(ctx, &pb.FdoOnboardingReq{Request: name})
    if err != nil {
        log.Fatalf("could not greet: %v", err)
    }
    log.Printf("Response: %s", r.Response)
}

