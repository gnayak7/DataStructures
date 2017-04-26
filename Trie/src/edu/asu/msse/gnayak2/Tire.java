package edu.asu.msse.gnayak2;

import java.util.HashMap;
import java.util.Map;

public class Tire {
	private class TrieNode {
		Map<Character, TrieNode> map;
		boolean endOfWord;
		
		public TrieNode() {
			map = new HashMap<Character,TrieNode>();
			endOfWord = false;
		}
	}
	
	private TrieNode root;
	
	public Tire() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		char[] charWord = word.toCharArray();
		TrieNode currentNode = root;
		char curChar;
		for (int i=0; i<charWord.length;i++) {
			curChar = charWord[i];
			if (!currentNode.map.containsKey(curChar)) {
				currentNode.map.put(curChar, new TrieNode());
			}
			currentNode = currentNode.map.get(curChar);
		}
		currentNode.endOfWord = true;
	}
	
	public boolean search(String word) {
		char[] charWord = word.toCharArray();
		TrieNode currentNode = root;
		
		for (int i=0;i<charWord.length;i++) {
			if (!currentNode.map.containsKey(charWord[i])) {
				return false;
			}
			currentNode = currentNode.map.get(charWord[i]);
		}
		return currentNode.endOfWord;
	}
}
