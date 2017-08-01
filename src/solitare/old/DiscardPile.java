package solitare.old;

import java.util.Stack;

class DiscardPile extends CardPile {

	DiscardPile(int x, int y) {
		super(x, y);
	}

	@Override
	public void push(Card aCard) {
		if (!aCard.isFaceUp()) {
			aCard.flip();
		}
		super.push(aCard);
	}

	//@Override
	public Stack<Card> selectCardStack(int tx, int ty) {
		if (empty()) {
			return null;
		}
		
		Stack<Card> cp = new Stack<>();
		cp.push(pop());
		return cp;
//		Card topCard = pop();
//		for (int i = 0; i < 4; i++) {
//			if (Solitare.suitPile[i].canTake(topCard)) {
//				Solitare.suitPile[i].push(topCard);
//				return;
//			}
//		}
//		for (int i = 0; i < 7; i++) {
//			if (Solitare.tableau[i].canTake(topCard)) {
//				Solitare.tableau[i].push(topCard);
//				return;
//			}
//		}
//		// nobody can use it, put it back on our list
//		push(topCard);
	}
}