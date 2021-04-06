package dto;

public class Member {

	private String id;
	private String pw;
//	private transient String pw;
	
	//** trainsient 키워드
	// -> 객체가 직렬화나 마샬링될 때 제외시킬 멤버필드에 적용한다
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}	
	
}
