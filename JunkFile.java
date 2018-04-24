import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JunkFile
{
	public static void main (String[] args)
	{
		try {
			final int BYTE_IN_MEGABYTE = 1048576;
			int fsize = BYTE_IN_MEGABYTE * 50;
			
			File f = new File("JunkFile.txt");
			f.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(f);
			
			// 1 char = 2 bytes
			while (f.length() < fsize)
			{
				// This array is 50 bytes.
				byte[] b = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
				fos.write(b);
				
				System.out.print("\rWrote " + f.length() + " / " + fsize);
			}
			
			System.out.println("\n\nFile: " + f.getAbsolutePath());
			System.out.println("Size (bytes): " + f.length());
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}