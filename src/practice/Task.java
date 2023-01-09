package practice;

public class Task {
	// メンバー変数
	// 日付
	private int date; // インスタンス変数
	// タスク内容
	private String content; // インスタンス変数
	// 状態（trueで完了）
	private boolean done = false; // インスタンス変数

	public Task(int date, String content) {
		this.date = date;
		this.content = content;
	}

	public void done() {
		System.out.println("タスク「" + content + "」を完了します。");
		this.done = true;
	}

	public void print() {
		if (this.done == true) {
			System.out.println(this.date + "のタスク「" + this.content + "」は完了しています。");
		} else {
			System.out.println(this.date + "のタスク「" + this.content + "」は未完了です。");
		}
	}

}