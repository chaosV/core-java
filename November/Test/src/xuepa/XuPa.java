package xuepa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="XuPa")
@XmlAccessorType(XmlAccessType.FIELD)
public class XuPa {
	@XmlElementWrapper(name="users")
	@XmlElement(name="user")
	private List<User> users;
	
	@XmlElementWrapper(name="questions")
	@XmlElement(name="question")
	private List<Question> questions;
	
	@XmlElementWrapper(name="answer")
	@XmlElement(name="names")
	private List <Answer> answers;
	
	public XuPa(){
		users=new ArrayList<>();
		questions=new ArrayList<>();
		answers=new ArrayList<>();
	}
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
}

@XmlAccessorType(XmlAccessType.FIELD)
class User{
	@XmlElement(name="name")
	private String name;
	@XmlElement(name="score")
	private String score;
	@XmlElement(name="password")
	private int password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}
@XmlAccessorType(XmlAccessType.FIELD)
class Question{
	@XmlAttribute(name="id")
	private String id;
	@XmlAttribute(name="asker")
	private String asker;
	@XmlAttribute(name="solve")
	private boolean solve;
	@XmlValue
	private String content;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAsker() {
		return asker;
	}
	public void setAsker(String asker) {
		this.asker = asker;
	}
	public boolean isSolve() {
		return solve;
	}
	public void setSolve(boolean solve) {
		this.solve = solve;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		String template="[%s] %s. [%s] from %s";
		String solvedLabel=isSolve() ?"SOLVED":"UNSOLVED";
		return String.format(template, solvedLabel,content,asker);
	}
	
	
}

@XmlAccessorType(XmlAccessType.FIELD)
class Answer{
	@XmlAttribute(name="id")
	private String id;
	@XmlAttribute(name="answerer")
	private String answerer;
	@XmlValue
	private String content;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnswerer() {
		return answerer;
	}
	public void setAnswerer(String answerer) {
		this.answerer = answerer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answerer=" + answerer + ", content=" + content + "]";
	}
	
	
}