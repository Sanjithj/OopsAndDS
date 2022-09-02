package com.bridgelabz;

public class DeckOfCards {
 
	public static void main(String[] args) {
	System.out.println("Welcome to deck of Cards");
	}
		public static final String[] RANKS = {"2", "3", "4", "5", "6", "7","8", "9", "10", "Jack", "Queen", "King","Ace"};

	    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

	    private final int rank;

	    private final int suit;

	    public DeckOfCards(int rank, int suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	    public int compareTo(DeckOfCards that) {
	        if (this.suit < that.suit) {
	            return -1;
	        }
	        if (this.suit > that.suit) {
	            return 1;
	        }
	        if (this.rank < that.rank) {
	            return -1;
	        }
	        if (this.rank > that.rank) {
	            return 1;
	        }
	        return 0;
	    }
	    public boolean equals(DeckOfCards that) {
	        return this.rank == that.rank
	            && this.suit == that.suit;
	    }

	    
	    public int getRank() {
	        return this.rank;
	    }

	    
	    public int getSuit() {
	        return this.suit;
	    }

	    public int position() {
	        return this.suit * 13 + this.rank - 1;
	    }

	    public String toString() {
	        return RANKS[this.rank] + " of " + SUITS[this.suit];
	       
}
}
