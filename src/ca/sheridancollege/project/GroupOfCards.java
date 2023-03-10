package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author sidrah malik , Yuvraj bhardwaj , Gagandeep Singh
 * Date - March 05 , 2023
 */


 public class GroupOfCards {
   
    private ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size){
        this.size = size;
    }

    public ArrayList<Card> showCards(){
        return this.cards;
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

}

