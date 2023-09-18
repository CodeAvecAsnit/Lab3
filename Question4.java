class okc{
    public static void main(String[] args) {
        int[] values = {0, 1};
        System.out.println("Truth Table for the Argument:");
        System.out.println("  p  |  q  |  r  | p → q | q → r | p → r | Validity");

        for (int p : values) {
            for (int q : values) {
                for (int r : values) {
                    int pImpliesQ = (p == 0 || q == 1) ? 1 : 0;
                    int qImpliesR = (q == 0 || r == 1) ? 1 : 0;
                    int pImpliesR = (p == 0 || r == 1) ? 1 : 0;
                    int validity = (pImpliesQ == 1 && qImpliesR == 1 && pImpliesR == 1) ? 1 : 0;
                    System.out.printf("  %d  |  %d  |  %d  |   %d   |   %d   |   %d   |     %d \n", p, q, r, pImpliesQ, qImpliesR, pImpliesR, validity);
                }
            }
        }
    }
}
