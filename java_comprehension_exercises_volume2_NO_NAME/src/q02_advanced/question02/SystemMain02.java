package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		ConsoleReader reader = new ConsoleReader();

		System.out.println("===会員情報を表示します=== ");

		List<Member> members = new ArrayList<>();
		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		MemberManager.showAllMembers(members);

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

		System.out.println("---SHOW DATA---");

		// パスワード更新
		MemberManager.updatePassword(members, targetId, newPassword);

		MemberManager.showAllMembers(members);
	}

}
