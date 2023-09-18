class maine{
    public static void main(String[] args) {
        int[] values = {0, 1};
        System.out.println("Truth Table for the Argument:");
        System.out.println("  p  |  q  |  r  |  s  | p ∨ q | (p ∧ q) → r |  q ∧ ¬r |  s  | Validity");
        for (int p : values) {
            for (int q : values) {
                for (int r : values) {
                    for (int s : values) {
                        int pOrQ = (p == 1 || q == 1) ? 1 : 0;
                        int pAndQImpliesR = ((p == 1 && q == 1) ? r : 1);
                        int qAndNotR = (q == 1 && r == 0) ? 1 : 0;
                        int validity = (pOrQ == 1 && pAndQImpliesR == 1 && qAndNotR == 1 && s == 1) ? 1 : 0;
                        System.out.printf("  %d  |  %d  |  %d  |  %d  |   %d   |      %d      |    %d    |  %d  |     %d\n", p, q, r, s, pOrQ, pAndQImpliesR, qAndNotR, s, validity);
                    }
                }
            }
        }
    }
}
