package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File wordssherlock = new File("sherlock.txt");

		System.out.println(wordssherlock.exists());

		TreeSet<String> sherlist = loadWords(wordssherlock);

		displayWords(sherlist);

	}

	public static TreeSet<String> loadWords(File file) throws FileNotFoundException, IOException {

		TreeSet<String> wordSet = new TreeSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-z]+");

				for (var word : words) {
					wordSet.add(word.toLowerCase());
				}
			}
		}

		return wordSet;

	}
	public static void displayWords(TreeSet<String> words) {
		int count = 0;
		for(String w : words) {
			if (w.length() >=6) {
				System.out.printf("%-10s \t", w);
				count++;
				if(count ==6) {
					System.out.println();
					count =0;
				}
			}
		}
	}

}
