package br.com.cursosja.controlecursoja.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.com.cursosja.controlecursoja.controller.moddel.entidade.Curso;

public class CursoDao {
	public boolean incluir(Curso curso) {
		boolean ok=false;
		String sql="inser into curso(nome, valor)"+"values(?,?)";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/cursoja", "root","");
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,curso.getNome());
		ps.setDouble(2, 0);
		ok=ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
			ok=false;
		}
		return false;
	}

}
