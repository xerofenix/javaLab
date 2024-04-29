import java.io.FileReader;
import java.io.IOException;

public class w10q2_CountCharFile {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("D:\\javaLab\\file.txt");
			try {
				int i, cntWithoutNewLine = 0, cntWithNewLine = 0;
				while ((i = file.read()) != -1) {
					char ch = (char) i;
					if (ch != '\n' && i != 13)
						cntWithoutNewLine++;
					if (i != 13)
						cntWithNewLine++;
				}
				System.out.println("Count with newline character included: " + cntWithNewLine);
				System.out.println("Count with newline character excluded: " + cntWithoutNewLine);
			} finally {
				System.out.println("Succesful termination");
				file.close();
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
