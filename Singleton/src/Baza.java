interface IPolaczenie {
    char get(int indeks);
    void set(int indeks, char c);
    int length();
}
class Baza {
    private char[] tab = new char[100]; /* ... */
    
    
    private Baza() {};
    
    public static IPolaczenie getPolaczenie() {
        return Polaczenie.getInstance();
    }
    
    private static Baza bazunia = new Baza();
    
    private static Baza getInstance() {
    	return bazunia;
    }
    private static class Polaczenie implements IPolaczenie {
        private Baza baza; /* ... */
        private static Polaczenie[] polaczenia = {new Polaczenie(), new Polaczenie(), new Polaczenie()};
        private static int kolejnosc = 0;
        private Polaczenie() {
        	baza = Baza.getInstance();
        };
        public static IPolaczenie getInstance() {
            kolejnosc = (kolejnosc+1) % polaczenia.length;
            return polaczenia[kolejnosc];
        }
        public char get(int indeks) {
            return baza.tab[indeks];
        }
        public void set(int indeks, char c) {
            baza.tab[indeks] = c;
        }
        public int length() {
            return baza.tab.length;
        }
    }
}