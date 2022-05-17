package practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DriverLoadDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			// JDBCドライバの登録
			Class.forName("org.postgresql.Driver");
			System.out.println("ドライバーのロードに成功しました");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("ドライバーのロードに失敗しました");
		}

		Connection connection = null;

		try {
			// 接続パラメータの定義
			String url = "jdbc:postgresql://localhost:5432/jdbc";
			String user = "postgres";
			String password = "jdbc";

			// データベースの接続
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("データベースの接続に成功しました");

			PreparedStatement statement = null;

			try {
				// SQLの定義
				String sql = "INSERT INTO DEPARTMENT (DEPT_NO, DEPT_NAME) VALUES (?, ?)";
				// ステートメントの作成
				statement = connection.prepareStatement(sql);
				// SQLバインド変数への値設定
				statement.setInt(1, 1110);
				statement.setString(2, "システム開発部");
				// SQLの実行
				statement.executeUpdate();

			} catch (SQLException e) {
				throw new RuntimeException("SQLの実行に失敗しました", e);
			} finally {
				try {
					// SQL実行の後処理
					if (statement != null) {
						statement.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException("SQLの実行の後処理に失敗しました", e);
				}
			}

		} catch (SQLException e) {
			throw new RuntimeException("データベースの接続に失敗しました", e);
		} finally {
			try {
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}
				System.out.println("データベースの切断に成功しました");
			} catch (SQLException e) {
				throw new RuntimeException("データベース接続の解除に失敗しました", e);
			}
		}

	}

}
