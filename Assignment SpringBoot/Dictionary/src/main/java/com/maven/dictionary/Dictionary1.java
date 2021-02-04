package com.maven.dictionary;

public class Dictionary1 {

	private String word;

	public Dictionary1() {
		// TODO Auto-generated constructor stub
	}

	public Dictionary1(String word) {
		super();
		this.word = word;
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + "]";
	}
	

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionary1 other = (Dictionary1) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

}
