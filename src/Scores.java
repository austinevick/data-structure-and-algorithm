public class Scores {
    public static final int maxEntries = 10; //number of high scores we keep
    protected int numEntries; // number of actual entries
    protected GameEntry[] entries; // array of game entries

    public Scores(){
        entries = new GameEntry[maxEntries];
        numEntries = 0;
    }
    public String toString(){
        String s = "[";
        for (int i = 0; i <numEntries; i++) {
            if (i > 0) s += ", "; //separate entries by commas
            s += entries[i];
        }
        return s + "]";
    }
  public void add(GameEntry e){
        int newScore = e.getScore();
        if(numEntries == maxEntries){
            if (newScore <= entries[numEntries-1].getScore());
            return;
        }else
            numEntries++;
        int i = numEntries-1;
        for (; (i >= 1) && (newScore > entries[i-1].getScore()); i++)
            entries[i] = entries[i - 1];
        entries[i] = e;

  }
}
