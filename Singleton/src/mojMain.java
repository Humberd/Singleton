
public class mojMain {

	public static void main(String[] args) {
		IPolaczenie a = Baza.getPolaczenie();
		IPolaczenie b = Baza.getPolaczenie();
		IPolaczenie c = Baza.getPolaczenie();
		IPolaczenie d = Baza.getPolaczenie();
		
		a.set(0, 'd');
		System.out.println(a.get(0));
		System.out.println(b.get(0));
		System.out.println(c.get(0));
		System.out.println(d.get(0));
		
		b.set(0, 'f');
		System.out.println("zab zupa zebowa dab dupa debowa");
		System.out.println(c.get(0));
		System.out.println(d.get(0));
		
		if (a == d) {
			System.out.println("takie same");
		}
		

	}

}
