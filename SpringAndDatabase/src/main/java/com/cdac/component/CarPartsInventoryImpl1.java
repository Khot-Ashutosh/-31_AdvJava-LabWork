package com.cdac.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

//Create table tbl_carpat before running this code
@Component("carParts1")
public class CarPartsInventoryImpl1 implements CarPartsInventory {

	public void addNewPart(CarPart carPart) {
		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			long ms1 = System.currentTimeMillis();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "ashutosh", "cdac123");
			long ms2 = System.currentTimeMillis();
			System.out.println("Approx time taken to connect : "+ (ms2 - ms1) + " ms");
			
			PreparedStatement st = conn.prepareStatement("insert into carpart(part_name,car_model,price,quantity) values (?,?,?,?)");
			st.setString(1,carPart.getPartName());
			st.setString(2,carPart.getCarModel());
			st.setDouble(3,carPart.getPrice());
			st.setInt(4,carPart.getQuantity());
			st.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e ) {
			e.printStackTrace();
		}finally {
			try{conn.close();}
			catch(Exception e) {}
		}
	}

	public List<CarPart> getAvailableParts() {
		return null;
	}

}
