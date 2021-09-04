package kopiranje_bajtova;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KopiranjeBajtova {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader ulaz = null;
		BufferedWriter izlaz = null;
		try {
			ulaz = new BufferedReader(new FileReader("UlazBajt.txt"));
			izlaz = new BufferedWriter(new FileWriter("IzlazBajt.txt"));
			int c;
			while ((c = ulaz.read()) != -1) {
				izlaz.write(c);
				System.out.println(c);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (ulaz != null) {
				ulaz.close();
			}
			if (izlaz != null) {
				izlaz.close();
			}
		}
	}

}
