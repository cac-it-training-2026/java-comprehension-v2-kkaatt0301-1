package q02_advanced.question02;

import java.io.IOException;

import q02_advanced.question01.Member;

public class SystemMain02 {

	public static void main(String[] args) {

		ConsoleReader reader = new ConsoleReader();

		Member memberBase = new Member();
		Member member1 = memberBase.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = memberBase.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		System.out.println("===パスワードを変更します===");

		int targetId;
		String newPassword;

		try {
			System.out.print("input target id>>");
			targetId = reader.inputNumber();

			System.out.print("input new password>>");
			newPassword = reader.inputString();

		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// パスワード更新
		MemberManager.updatePassword(members, targetId, newPassword);
	}

}
