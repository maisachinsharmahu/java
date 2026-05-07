# Socket Programming in Java

This practical demonstrates the **Client-Server architecture** using the `java.net` package.

### Key Components:
- **ServerSocket (Server)**: Listens for incoming connection requests on a specific port (6666).
- **Socket (Client)**: Initiates a connection to the server's IP and port.
- **DataStreams**: Used to send and receive UTF-8 messages between client and server.

### How to Run:
1. Compile both files: `javac MyServer.java MyClient.java`
2. Start the Server first: `java MyServer`
3. In a new terminal, start the Client: `java MyClient`
