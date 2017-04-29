package edu.asu.msse.gnayak2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
	}
	
	public static void test1() {
		Tire trie = new Tire();
		System.out.println("Inserting cab");
		trie.insert("cab");
		System.out.println("Inserting cabin");
		trie.insert("cabbin");
		System.out.println("searching for cab: " + trie.search("cab"));
		System.out.println("serching for cabbin: " + trie.search("cabbin"));
		System.out.println("Deleting cabbin");
		trie.delete("cabbin");
		System.out.println("searcing for cabbin: " + trie.search("cabbin"));
		System.out.println("searcing for cab: " + trie.search("cab"));
//		trie.delete("cab");
	}
	
	public static void test2() {
		String[] words =  {"the", "a", "there", "answer", "any", "by", "bye", "their"};
		Tire trie = new Tire();
		
		for (int i = 0; i < words.length; i++)
	        trie.insert(words[i]);
		
		System.out.println("Searching for \"the\": " + trie.search("the"));
		System.out.println("Searching for \"these\": " + trie.search("these"));
		System.out.println("Searching for \"their\": " + trie.search("their"));
		System.out.println("Searching for \"thaw\": " + trie.search("thaw"));
	}

}
