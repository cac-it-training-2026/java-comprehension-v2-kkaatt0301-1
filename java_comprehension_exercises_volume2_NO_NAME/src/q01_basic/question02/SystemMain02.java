package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member Miura = new Member();

		Miura.setName("Miura Manabu");
		Miura.setAge(30);
		Miura.setRank(1);

		System.out.println("---SHOW DATA---");
		Miura.showMember();

		Miura.rankUp();

		System.out.println("---GET RANK---");
		Miura.getRank();
		System.out.println("newRank:" + Miura.getRank());
	}
}
