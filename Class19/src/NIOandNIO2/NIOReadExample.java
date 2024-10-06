package NIOandNIO2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOReadExample {

	public static void main(String[] args) {
		try {
			
			Path path = Path.of("Example.txt");
			FileChannel fileChannel = FileChannel.open
					(path,StandardOpenOption.READ);
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			fileChannel.read(buffer);
			buffer.flip();
			
			String result = new String(buffer.array(), 0, buffer.limit());

			System.out.println("File Content: "+result);
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}
