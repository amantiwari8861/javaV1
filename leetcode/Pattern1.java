class Pattern1{
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print(65+j); not working
                // System.out.print(('A'+j)); not working
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }

    }
}