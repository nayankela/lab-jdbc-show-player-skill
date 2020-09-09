package controller;

import java.sql.SQLException;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main{
	
	public static void main(String[] args) throws SQLException {
		//Skill skill = new Skill();
		SkillDAO skillDAO = new SkillDAO();
		
		 List<Skill> list= skillDAO.listAllSkills();
		 
		 System.out.println("---------------------------");
		 System.out.println("SkillId     SkillName");
		 System.out.println("---------------------------");
		 for(Skill skill2 : list) {
			 System.out.print(+skill2.getSkilld()+"            "+ skill2.getSkillName());
			 System.out.println();
		 }
		 System.out.println("---------------------------");
	}
}
