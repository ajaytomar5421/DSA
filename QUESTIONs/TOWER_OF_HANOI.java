package QUESTIONs;
public class TOWER_OF_HANOI {
      static public long toh(int N, String from, String to, String aux) {
        long moves = 0L;
        if (N >= 1) {
            // recursive call to move top disk from "from"
            //to aux in the current call
             moves += toh(N - 1, from, aux, to);
            System.out.println("move disk " + N + " from rod " + from +" to rod " + to);
            // increment moves
            moves++;
            // recursive call to move top disk from aux to
            // "to" in the current call
            moves += toh(N - 1, aux, to, from);
        }
        return moves;
    }
    public static void main(String[] args) {
        toh(3, "A", "C", "B");
    }
}
