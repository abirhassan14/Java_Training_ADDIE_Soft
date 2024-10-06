package NIOandNIO2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class NIOWriteExample {

	public static void main(String[] args) {
		
		try {
			Path path = Path.of("abc.txt");
			FileChannel fileChannel = FileChannel.open
					(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
			String content = "Hello! Bangladesh \n";
			String content1 = "Tiger is a beautiful animal";
			ByteBuffer buffer = ByteBuffer.allocate(1024); 
			//  Here 1024 is capacity. Means we can store 1024 bytes of data in total
			buffer.put(content.getBytes());
			buffer.put(content1.getBytes());
			buffer.flip();
			fileChannel.write(buffer);
			System.out.println("Written Successfully");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
