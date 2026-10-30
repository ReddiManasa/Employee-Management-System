package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dbutil.DBUtil;
import com.dto.Employee;

public class DataAcces {

	public void insertData(Employee e) throws Exception {
		Connection con = DBUtil.establishConnection();
		String insertQuery=("insert into employee values(?,?,?,?)");
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, e.getEid());
		ps.setString(2, e.getEname());
		ps.setInt(3, e.getEsalary());
		ps.setString(4, e.getCity());
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	public List<Employee> readData() throws Exception{
		List<Employee> list=new ArrayList<Employee>();
		Connection con = DBUtil.establishConnection();
		String readData=("select * from employee");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(readData);
		while(rs.next()) {
			int eid=rs.getInt(1);
			String ename=rs.getString(2);
			int esalary=rs.getInt(3);
			String city=rs.getString(4);
			Employee e=new Employee(eid,ename,esalary,city);
			list.add(e);
		}
		rs.close();
		s.close();
		con.close();
		return list;
	}
	public void updateData(Employee e) throws Exception {
		Connection con = DBUtil.establishConnection();
		String updateQuery=("update employee set ename=?, esalary=?, city=? where eid=?");
		PreparedStatement ps = con.prepareStatement(updateQuery);
		ps.setString(1, e.getEname());
		ps.setInt(2, e.getEsalary());
		ps.setString(3, e.getCity());
		ps.setInt(4, e.getEid());
		ps.executeUpdate();
		ps.close();
		con.close();	
	}
	public void deleteData(int id) throws Exception {
		Connection con = DBUtil.establishConnection();
		String deleteQuery=("delete from employee where eid=?");
		PreparedStatement ps = con.prepareStatement(deleteQuery);
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
		con.close();
	}

}
