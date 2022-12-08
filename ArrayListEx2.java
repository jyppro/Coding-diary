import java.util.ArrayList;

class Board{
	String subject; //제목
	String content; //내용
	String writer; //글쓴이
	Board(String subject, String content, String writer){
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return this.subject + " " 
	+ this.content + " " + this.writer;
	}
}
public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Board> ab = new ArrayList<>();
		Board b1 = new Board("제목1", "내용1", "글쓴이1");
		ab.add(b1);
		ab.add(new Board("제목2", "내용2", "글쓴이2"));
		ab.add(new Board("제목3", "내용3", "글쓴이3"));
		for (Board bitem : ab) {
			System.out.println(bitem.toString());
		}

	}

}
