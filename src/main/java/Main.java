import java.util.Scanner;


class Gamer {

    int health;
    int mana;
    Card[] deck = new Card[30];
    int rune;
    int draw;
    public Gamer(int health, int mana, Card[] deck, int rune, int draw) {
        this.health = health;
        this.mana = mana;
        this.deck = deck;
        this.rune = rune;
        this.draw = draw;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Card[] getDeck() {
        return deck;
    }


    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public int getRune() {
        return rune;
    }

    public void setRune(int rune) {
        this.rune = rune;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}

class Card {
    int cardNumber = 0;
    int instanceId;
    int location;
    int cardType;
    int cost;
    int attack;
    int defense;
    int myHealthChange;
    int opponentHealthChange;
    int cardDraw;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMyHealthChange() {
        return myHealthChange;
    }

    public void setMyHealthChange(int myHealthChange) {
        this.myHealthChange = myHealthChange;
    }

    public int getOpponentHealthChange() {
        return opponentHealthChange;
    }

    public void setOpponentHealthChange(int opponentHealthChange) {
        this.opponentHealthChange = opponentHealthChange;
    }

    public int getCardDraw() {
        return cardDraw;
    }

    public void setCardDraw(int cardDraw) {
        this.cardDraw = cardDraw;
    }
}


class Player {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            for (int i = 0; i < 2; i++) {
                int playerHealth = in.nextInt();
                int playerMana = in.nextInt();
                int playerDeck = in.nextInt();
                int playerRune = in.nextInt();
                int playerDraw = in.nextInt();
            }
            int opponentHand = in.nextInt();
            int opponentActions = in.nextInt();
            if (in.hasNextLine()) {
                in.nextLine();
            }
            for (int i = 0; i < opponentActions; i++) {
                String cardNumberAndAction = in.nextLine();
            }
            int cardCount = in.nextInt();
            Card[] allcards = new Card[500];

            for (int i = 0; i < cardCount; i++) {
                int cardNumber = in.nextInt();
                int instanceId = in.nextInt();
                int location = in.nextInt();
                int cardType = in.nextInt();
                int cost = in.nextInt();
                int attack = in.nextInt();
                int defense = in.nextInt();
                String abilities = in.next();
                int myHealthChange = in.nextInt();
                int opponentHealthChange = in.nextInt();
                int cardDraw = in.nextInt();

            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");





        }
    }

    public int pickTheBestCard(Card[] cards) {
        Card chosen = null;
        int index  = -1;

        for (int i = 0; i < cards.length; i++) {

            if (chosen == null ||
                    Math.abs(cards[i].getAttack() - cards[i].getDefense()) < Math.abs(chosen.getAttack() - chosen.getDefense())) {
                chosen = cards[i];
                index = i;

            }
        }
        return index;
    }

/*
    public String pickCard(){
        int index = pickTheBestCard()

        return "PICK";
    }

 */
}


