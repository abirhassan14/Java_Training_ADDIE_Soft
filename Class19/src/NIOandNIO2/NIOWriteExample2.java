package NIOandNIO2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOWriteExample2 {

	public static void main(String[] args) {

		try {
			
			Path path = Path.of("Example.txt");
			FileChannel fileChannel = FileChannel.open
					(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
			
			String value1 = "Apple \n";
			String value2 = "Orange \n";
			String value3 = "Mango \n";
			String value4 = "500";
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			
			buffer.put(value1.getBytes());
			buffer.put(value2.getBytes());
			buffer.put(value3.getBytes());
			buffer.put(value4.getBytes());
			
			buffer.flip();
			fileChannel.write(buffer);

			System.out.println("Written Successfully");
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}
