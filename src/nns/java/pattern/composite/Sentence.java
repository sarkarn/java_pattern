package nns.java.pattern.composite;

import java.util.List;

public class Sentence extends LetterComposite {

	public Sentence(List<Word> wordList) {
		for (Word word : wordList) {
			this.add(word);
		}
	}

	@Override
	protected void printThisBefore() {
		System.out.print(" ");
	}

}
