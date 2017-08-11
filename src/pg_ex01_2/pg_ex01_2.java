package pg_ex01_2;

public class pg_ex01_2 {

	public Object test(int value) {

		String ans[] = new String[21];

		for (int i = 0; i < ans.length;i++) {

			if ((0 < i) && (i < 21)) {
				// 変換処理呼び出し
				henkan(i, ans);
			}
		}
		// 出力
		if((0 < value) && (value < 21)){
		return ans[value];
		}else{
		// 1～20以外
		return "変換出来ません";
		}
	}

	public static  void henkan(int i, String ans[]) {

		// 変換内容
		String roma1 = "I";
		String roma5 = "V";
		String roma10 = "X";

		// 1～10の値
		if (i < 11) {
			if (i == 1) {
				ans[i] = roma1;
			} else {

				ans[i] = ans[i - 1] + roma1;

				if ((i + 1) % 5 == 0) {
					// 1の位が9の場合
					if ((i + 1) % 10 == 0) {
						ans[i] = roma1 + roma10;
					} else {
						ans[i] = roma1 + roma5;
					}
				}
				// 1の位が5の場合
				if (i % 5 == 0) {
					// 1の位が0の場合
					if (i % 10 == 0) {

						ans[i] = roma10;
					} else {
						ans[i] = roma5;
					}

				}
			}
		}
		// 11～20の値
		if (10 < i) {
			ans[i] = roma10 + ans[i - 10];
		}
	}
}
