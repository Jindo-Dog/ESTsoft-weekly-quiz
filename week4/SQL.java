package chap08.quiz.week4;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class SQL {
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			// .env 파일 로드
			properties.load(new FileInputStream(".env"));

			// 환경 변수에서 값 읽기
			String url = properties.getProperty("DB_URL");
			String user = properties.getProperty("DB_USER");
			String password = properties.getProperty("DB_PASSWORD");

			try (
				// DB 연결
				Connection connection = DriverManager.getConnection(url, user, password);
				// SQL 작성
				PreparedStatement preparedStatement = connection.prepareStatement(
					"""
						SELECT *
						FROM students
						WHERE age BETWEEN 30 AND 39;"""
				);
				// SQL 실행
				ResultSet resultSet = preparedStatement.executeQuery()) {
				// 메타데이터 가져오기
				ResultSetMetaData metaData = preparedStatement.getMetaData();
				int columnCount = metaData.getColumnCount();

				// 속성 출력
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(metaData.getColumnName(i) + "\t");
				}
				System.out.println();

				// 결과 출력
				while (resultSet.next()) {
					System.out.println(resultSet.getString("name") + "\t" + resultSet.getInt("age") + "\t" + resultSet.getString("address"));
				}
			} catch (SQLException e) {
				System.out.println("SQLException 발생");
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("IOException 발생");
			System.out.println(e.getMessage());
		}

	}
}
