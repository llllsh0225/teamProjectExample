package tommy.spring.guestbook.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tommy.spring.guestbook.vo.GuestMessage;

public class GuestMessageRowMapper implements RowMapper<GuestMessage> {

	public GuestMessage mapRow(ResultSet rs, int rowNum) throws SQLException {
		GuestMessage message = new GuestMessage();
		message.setId(rs.getInt("message_id"));
		message.setGuestName(rs.getString("guest_name"));
		message.setMessage(rs.getString("message"));
		message.setRegistryDate(rs.getDate("registry_date"));
		return message;
	}

}
