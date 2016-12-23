package qktravel;

public class travelBooks {
	private String bookUrl;
	private String title;
	private String headlmage;
	private String userName;
	private String startTime;
	private int routeDays;
	private int booklmgNum;
	private String viewCount;
	private String likeCount;
	private int commentCount;
	private String text;
	private boolean elite;
	
	
	public String getBookUrl() {
		return bookUrl;
	}
	public void setBookUrl(String bookUrl) {
		this.bookUrl = bookUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHeadlmage() {
		return headlmage;
	}
	public void setHeadlmage(String headlmage) {
		this.headlmage = headlmage;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getRouteDays() {
		return routeDays;
	}
	public void setRouteDays(int routeDays) {
		this.routeDays = routeDays;
	}
	public int getBooklmgNum() {
		return booklmgNum;
	}
	public void setBooklmgNum(int booklmgNum) {
		this.booklmgNum = booklmgNum;
	}
	public String getViewCount() {
		return viewCount;
	}
	public void setViewCount(String viewCount) {
		this.viewCount = viewCount;
	}
	public String getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isElite() {
		return elite;
	}
	public void setElite(boolean elite) {
		this.elite = elite;
	}
	@Override
	public String toString() {
		return "travelBooks [bookUrl=" + bookUrl + ", title=" + title + ", headlmage=" + headlmage + ", userName="
				+ userName + ", startTime=" + startTime + ", routeDays=" + routeDays + ", booklmgNum=" + booklmgNum
				+ ", viewCount=" + viewCount + ", likeCount=" + likeCount + ", commentCount=" + commentCount + ", text="
				+ text + ", elite=" + elite + "]";
	}
	
	
}
