package com.pickshell.domain;
public class Greeting {

	private long id;
	private String content;

	public Greeting() {
		super();
	}

	public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}