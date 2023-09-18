class Truth_tabla{
    public static void main(String[] args) {
        int[] a = {0, 1};
        System.out.println("a. (p ᴧ ¬q ∨ r) → (¬p ∨ r)");
        System.out.println("  p  |  q  |  r  | ¬q  | p ᴧ ¬q ∨ r | ¬p ∨ r | (p ᴧ ¬q ∨ r) → (¬p ∨ r)");
        for (int p : a) {
            for (int q : a) {
                for (int r : a) {
                    int notQ = q == 0 ? 1 : 0;
                    int pandnotQOrR = (p & notQ) | r;
                    int notPOrR = (p == 0 ? 1 : 0) | r;
                    int result = pandnotQOrR == notPOrR ? 1 : 0;
                    System.out.printf("  %d  |  %d  |  %d  |  %d  |      %d     |   %d    |           %d\n", p, q, r, notQ, pandnotQOrR, notPOrR, result);
                }
            }
        }
        System.out.println("\nb. (p ᴧ ¬q ∨ r) ↔ (¬p ∨ r)");
        System.out.println("  p  |  q  |  r  | ¬q  | p ᴧ ¬q ∨ r | ¬p ∨ r | (p ᴧ ¬q ∨ r) ↔ (¬p ∨ r)");
        for (int p : a) {
            for (int q : a) {
                for (int r : a) {
                    int notQ = q == 0 ? 1 : 0;
                    int pandnotQOrR = (p & notQ) | r;
                    int notPOrR = (p == 0 ? 1 : 0) | r;
                    int result = pandnotQOrR == notPOrR ? 1 : 0;
                    System.out.printf("  %d  |  %d  |  %d  |  %d  |      %d     |   %d    |           %d \n", p, q, r, notQ, pandnotQOrR, notPOrR, result);
                }
            }
        }
    }
}
