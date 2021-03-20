package dao.face;

import java.util.List;

import dto.User;

public interface UserDao {

	/**
	 * 유저 정보 전부 조회
	 * @return
	 */
	public List<User> selectAll();

	/**
	 * 유정 정보 삽입
	 * @param insertUser
	 */
	public void insertUser(User insertUser);

	/**
	 * 키값 유저 정보 조회
	 * @param i
	 * @return
	 */
	public User selectByIdx(int i);

	
	/**
	 * 유저 정보 키값으로 삭제
	 * @param i
	 */
	public void deleteByIdx(int i);

}
