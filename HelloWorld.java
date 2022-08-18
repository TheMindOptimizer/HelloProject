

public class HelloWorld {
	public static void main(String[] args) {

		if(args.length > 0)
			System.out.println("Hello," + args[0]);
		if (args[0].equals("server")) {
			try (ServerSocket server = new ServerSocket(8080)) {
			while (server.isBound()) {
					try (Socket socket = server.accept();
						Scanner scanner = new  Scanner(socket.getInputStream());
						PrintWriter out = new PrintWriter(socket.getOutputStream());
  
					) {
						string name = scanner.nextLine();
						out.println(name);
						}
					}
				}
			}
		if(args.length == 0)
			System.out.println("Hello, World!");
	}
}
