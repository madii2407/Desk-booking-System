package com.example.group11officedeskbooking.repository;

import com.example.group11officedeskbooking.DTO.UserTaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserTaskRepository implements UserTaskDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    public int updateCancelTable(int id) {
        return jdbcTemplate.update("INSERT INTO Cancel (booking_id, booking_date,User_user_id,Desk_desk_id,User_UserName,Location)" +
                "SELECT * FROM booking WHERE booking_id =?", new Object[]{id});
        /* jdbcTemplate.update("DELETE FROM Booking where booking_id =?", new Object[]{id});*/
    }


    @Override
    public int deleteBooking(int id) {
        return jdbcTemplate.update("DELETE FROM Booking where booking_id =?", new Object[]{id});
    }

    @Override
    public Object getDailyBooking(String deskLocation) {
        return null;
    }

    @Override
    public int setAttendance(int id) {
        return 0;
    }

    @Override
    public Object attendanceStatus(int id) {
        return null;
    }


}

