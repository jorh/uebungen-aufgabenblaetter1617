package aufgabenblatt6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CorpusCount {
	
	//sehr gut!

	ArrayList<Entry> woerter = new ArrayList<Entry>();
	
	public static void main(String[] args) throws IOException {
		new CorpusCount().run();
	}

	void run() throws IOException {
		readFile("src/klausurtestklassen/testtext.txt");
//		readFile("src/aufgabenblatt6/bibel.txt");
		sort();
		write();
	}

	private void readFile(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			String[] words = line.split(" +");
			for (String word : words) {
				countWord(word);
			}
		}
		br.close();
	}

	private void countWord(String word) {
		for (Entry wort : woerter){
			if(wort.getWort().equals(word)){
				wort.counter();
				return;
			}
		}
		woerter.add(new Entry (word));
	}

	private void sort() {
		Collections.sort((List<Entry>) woerter);
	}

	private void write() {
		for(Entry wort : woerter){
			System.out.println(wort);
		}
	}
}
