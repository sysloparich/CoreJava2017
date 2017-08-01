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
		
	}
}