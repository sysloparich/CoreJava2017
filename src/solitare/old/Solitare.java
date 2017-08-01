package solitare.old;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseEvent;


import java.awt.event.MouseListener;
import java.util.Stack;

public class Solitare extends Applet implements MouseListener {
	
	static Stack<Card> cardStack = null;
	int pressedCardPile = -1;
	
	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	static CardPile allPiles[];

	@Override
	public void init() {
		// first allocate the arrays
		
		addMouseListener(this);
		
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
	}

	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		
		if (Solitare.deckPile.includes(x, y)) {
			Solitare.deckPile.select(x, y);
			repaint();
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		
		for (int i = 1; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
				pressedCardPile = i;
				cardStack = allPiles[i].selectCardStack(x, y);
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {	
		
		if(cardStack == null) return;
		
		for(int i = 0; i < 13; ++i){
			
			if(allPiles[i].includes(e.getX(), e.getY())){
				
				if(i < 2){
					
					putStackToCardPile(pressedCardPile);
					pressedCardPile = -1;
					
					repaint();
					return;
				}
				
				Card topCard = cardStack.peek();
				
				if (Solitare.allPiles[i].canTake(topCard)) {
					
					putStackToCardPile(i);
					
					if(Solitare.allPiles[pressedCardPile].top() != null){					
						if(!Solitare.allPiles[pressedCardPile].top().isFaceUp()){
							Solitare.allPiles[pressedCardPile].top().flip();
						}
					}
					
					pressedCardPile = -1;
					
					repaint();
					return;	
					
				}
			}	
			
		}
		
		putStackToCardPile(pressedCardPile);
		pressedCardPile = -1;

		repaint();
		
	}

	private void putStackToCardPile(int to) {
		while(!cardStack.isEmpty()){
			Solitare.allPiles[to].push(cardStack.pop());
		}					
		cardStack = null;
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}