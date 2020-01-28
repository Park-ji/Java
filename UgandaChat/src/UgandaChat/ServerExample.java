package UgandaChat;


import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.imageio.ImageIO;

public class ServerExample {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();

	void startServer() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println(executorService);
		try {
			serverSocket = new ServerSocket(9009);
			System.out.println(serverSocket.getInetAddress());
			System.out.println(InetAddress.getLocalHost());
			System.out.println("��������");
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}

		Runnable runnable = new Runnable() {
			@Override
			public void run() {

				while (true) {
					try {
						Socket socket = serverSocket.accept();
						String message = "[���� ����: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";

						System.out.println(message);
						Client client = new Client(socket);
						connections.add(client);
					} catch (Exception e) {
						if (!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		executorService.submit(runnable);
	}

	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}

		} catch (Exception e) {
		}
	}

	class Client {
		Socket socket;

		Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while (true) {
							byte[] byteArr = new byte[1024];
							InputStream inputStream = socket.getInputStream();
							//BufferedImage bimg = ImageIO.read(inputStream);
							//FileOutputStream fout = new FileOutputStream("d:/test/upload.png");
							//ImageIO.write(bimg, "png", fout);
							//fout.close();

							// Ŭ���̾�Ʈ�� ������ ���Ḧ ���� ��� IOException �߻�
							int readByteCount = inputStream.read(byteArr);

							// Ŭ���̾�Ʈ�� ���������� Socket�� close()�� ȣ������ ���
							if (readByteCount == -1) {
								throw new IOException();
							}

							String message = "[��û ó��: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";

							String data = new String(byteArr, 0, readByteCount, "UTF-8");
							data += " /" + socket.getRemoteSocketAddress();
							System.out.println(data);
							for (Client client : connections) {
								System.out.println(client.socket.getInetAddress());
								client.send(data);
							}
							System.out.println();
						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this);
							String message = "[Ŭ���̾�Ʈ ��� �ȵ�: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							socket.close();
						} catch (IOException e2) {
						}
					}
				}
			};
			executorService.submit(runnable);
		}

		void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
					} catch (Exception e) {
						try {
							String message = "[Ŭ���̾�Ʈ ��� �ȵ�: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							connections.remove(Client.this);
							System.out.println(message);
							socket.close();
						} catch (IOException e2) {
						}
					}
				}
			};
			executorService.submit(runnable);
		}
	}

	//////////////////////////////////////////////////////

	public static void main(String[] args) {
		new ServerExample().startServer();
	}
}
