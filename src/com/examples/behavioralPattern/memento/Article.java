package com.examples.behavioralPattern.memento;

public class Article {

	private String id;
	private String title;
	private String content;
	
	
	public Article(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	public ArticleMemento createMemento(){
		ArticleMemento articleMemento = new ArticleMemento(
				this.id,
				this.title,
				this.content);
		return articleMemento;
		
	}
	
	public void restoreMemento(ArticleMemento articleMemento){
		this.id=articleMemento.getId();
		this.title=articleMemento.getTitle();
		this.content=articleMemento.getContent();
	}
	
}
