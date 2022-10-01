package member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.ProductDTO;

@Service("memberservice")
public class MemberService_Impl implements MemberService {

	@Autowired
	MemberDAO dao;
	
	
	@Override
	public int login(String user_id, String user_password) {
		return dao.checkLogin(user_id , user_password);
	}
	
	@Override
	public int user_num(String user_id) {
		return dao.getUser_num(user_id);
	}
	// 임시 유저 고유 번호 확인

	@Override
	public String user_id(int user_num) {
		return dao.getUser_id(user_num);
	}
	// 임시 유저 아이디 호출




}
