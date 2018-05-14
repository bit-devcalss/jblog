package com.javaex.vo;

import org.springframework.web.multipart.MultipartFile;

public class BlogVo {

	private String id;
	private String blogTitle;
	private String logoFile;
	
	private MultipartFile file;

	public BlogVo() {
	}

	public BlogVo(String id, String blogTitle, String logoFile) {
		this.id = id;
		this.blogTitle = blogTitle;
		this.logoFile = logoFile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getLogoFile() {
		return logoFile;
	}

	public void setLogoFile(String logoFile) {
		this.logoFile = logoFile;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "BlogVo [id=" + id + ", blogTitle=" + blogTitle + ", logoFile=" + logoFile + ", file=" + file + "]";
	}

}
