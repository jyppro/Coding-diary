public class Student2 {
	private int studentId;
	private String studentName;
	private String Major;
	
	public Student2(int studentId, String studentName, String major) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.Major = major;
	}
	
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMajor() {
		return Major;
	}
	public void getMahor(String Major) {
		this.Major = Major;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", + studentName= " + studentName + ", + Major= " + Major + "]";
	}
}
