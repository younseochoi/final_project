package member;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("memberdao")
public interface MemberDAO {
	
	public int checkLogin(String user_id , String user_password);
	// 유저 로그인
	public int getUser_num(String user_id);
	// 임시 유저 고유 번호 호출
	public String getUser_id(int user_num);
	// 임시 유저 아이디 호출

}