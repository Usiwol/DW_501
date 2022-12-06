package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import VO.venture;

public class venture_DAO extends init_DAO {
	
	public List<venture> Select_all(){
		List<venture> list = new ArrayList<>();
		String sql = "select * from venture";
	try {
		pt = conn.prepareStatement(sql);
		rs = pt.executeQuery();
		while(rs.next()) {
			venture data = new venture(
			rs.getInt("num"), rs.getString("company"), rs.getString("addr"), rs.getString("category").strip(),
			rs.getString("business_name"), rs.getString("product")
			);
			list.add(data);
		}
		return list;
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
	
		
}