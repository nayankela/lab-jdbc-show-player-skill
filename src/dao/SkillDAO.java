package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {

	List<Skill> skills = new ArrayList<Skill>();

	public List<Skill> listAllSkills() throws SQLException {
		String sql = "SELECT * FROM SKILL ORDER BY NAME ASC";
		Connection con = null;

		try {
			con = ConnectionManager.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			Long skilld = resultSet.getLong(1);
			String skillName = resultSet.getString(2);

			Skill skill = new Skill(skilld, skillName);
			skills.add(skill);
		}

		return skills;

	}
}
