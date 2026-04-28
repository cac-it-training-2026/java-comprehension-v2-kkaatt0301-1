package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member Miura = new Member();
		Member Sato = new Member();

		Miura.name = "Miura Manabu";
		Miura.age = 24;
		Miura.rank = 1;

		Sato.name = "Sato kensuke";
		Sato.age = 36;
		Sato.rank = 2;

		System.out.println("---SHOW DATA---");
		Miura.showMember();
		Sato.showMember();
	}

}
