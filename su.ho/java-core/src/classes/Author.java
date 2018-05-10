package classes;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return String.format("Author[name=%s, email=%s, gender=%s]", getName(), getEmail(), getGender());
	}
	
	public static Author dummy() {
		return new Author("Su Ho", "su.ho@gmail.vn", 'm');
	}
	
	public static void main(String[] args) {
		Author author = Author.dummy();
		System.out.println(author.toString());
	}
}
