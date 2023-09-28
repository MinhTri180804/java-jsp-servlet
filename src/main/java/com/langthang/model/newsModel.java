package com.langthang.model;

public class newsModel extends AbstractModel {
	private String title;
	private String shortDescription;
	private String description;
	private String thumbneil;
	private Long category_id;
	private int view;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbneil() {
		return thumbneil;
	}

	public void setThumbneil(String thumbneil) {
		this.thumbneil = thumbneil;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

}
