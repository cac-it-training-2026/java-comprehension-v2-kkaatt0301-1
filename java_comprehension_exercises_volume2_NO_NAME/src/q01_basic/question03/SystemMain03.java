package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member s = new Member();
		Member Miura = new Member("Miura Manabu", 28, 2);

		System.out.println("---SHOW DATA(NULL)---");
		s.showMember();

		System.out.println("---SHOW DATA(Miura)---");
		Miura.showMember();
	}

}
