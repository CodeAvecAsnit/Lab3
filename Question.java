class qustion2{
    public static void main(String[] args) {
        int[] values = {0, 1};
        System.out.println("Truth Table for the Argument:");
        System.out.println("  p  |  q  |  r  | p → q | ¬q  | ¬p | Validity");
        for (int p : values) {
            for (int q : values) {
                for (int r : values) {
                    int implication = (p == 1 && q == 0) ? 0 : 1;
                    int notQ = (q == 0) ? 1 : 0;
                    int notP = (p == 0) ? 1 : 0;
                    int validity = (implication == 1 && notQ == 1 && notP == 1) ? 1 : 0;
                    System.out.printf("  %d  |  %d  |  %d  |   %d   |  %d  |  %d |     %d\n", p, q, r, implication, notQ, notP, validity);
                }
            }
        }
    }
}
