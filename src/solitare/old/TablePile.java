package solitare.old;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Stack;

class TablePile extends CardPile {

	TablePile(int x, int y, int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			push(Solitare.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	@Override
	public boolean canTake(Card aCard) {
		if (empty()) {
			return aCard.getRank() == 12;
		}
		Card topCard = top();
		return (aCard.getColor() != topCard.getColor())
				&& (aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		
		if(top() == null) return false;
		
		Card tmp = top();
		int i = 0;
		while(tmp.link != null) {
			tmp = tmp.link;
			++i;
		}
		
		return(x <= tx && tx <= x + Card.width && y <= ty && ty <= y + 35*i + Card.height);

	}

	//@Override
	public Stack<Card> selectCardStack(int tx, int ty) {
		if (empty()) {
			return null;
		}
		
		Card topCard = top();
		int j = 0;
		while(topCard.link != null){
			topCard = topCard.link;
			++j;
		}
		int k = j;
		topCard = top();
		while(!(x <= tx && tx <= x + Card.width && y + 35*j <= ty && ty <= y + 35*j + Card.height)){
			topCard = topCard.link;
			--j;
		}
		
		Stack<Card> cp = new Stack();
		if(topCard.isFaceUp()) {
			int counter = 0;
			while(counter != k-j+1){
				cp.push(pop());
				++counter;
			}
			
			System.out.println("STACK SIZE: " + cp.size());
			System.out.println("Bottom Card Rank: " + topCard.getRank());
			System.out.println("=======================");
			
			return cp;
			
		}
		else return null;
		
//		// if face down, then flip
//		Card topCard = top();
//		if (!topCard.isFaceUp()) {
//			topCard.flip();
//			return;
//		}

		// else see if any suit pile can take card
//		topCard = pop();
	
		
//		for (int i = 0; i < 4; i++) {
//			if (Solitare.suitPile[i].canTake(topCard)) {
//				//Solitare.suitPile[i].push(topCard);
//				
//				while(!cp.isEmpty()) {
//					Solitare.suitPile[i].push(cp.pop());
//				}
//				
//				if(top() != null){					
//					if(!top().isFaceUp()) top().flip();
//				}
//				
//				return;
//			}
//		}
//		// else see if any other table pile can take card
//		for (int i = 0; i < 7; i++) {
//			if (Solitare.tableau[i].canTake(topCard)) {
//				//Solitare.tableau[i].push(topCard);
//				
//				while(!cp.isEmpty()){
//					Solitare.tableau[i].push(cp.pop());
//				}
//				
//				if(top() != null){					
//					if(!top().isFaceUp()) top().flip();
//				}
//				
//				return;
//			}
//		}		
//		// else put it back on our pile
//		while(!cp.isEmpty()) push(cp.pop());
		
	
		
		//push(topCard);
		
	}

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + 35;
	}

	@Override
	public void display(Graphics g) {
		stackDisplay(g, top());
	}

}