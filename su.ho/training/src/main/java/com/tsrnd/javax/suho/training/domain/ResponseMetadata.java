package com.tsrnd.javax.suho.training.domain;

public class ResponseMetadata {
	private int currentPage;
	private int totalCount;

	public ResponseMetadata(int currentPage, int totalCount) {
		this.currentPage = currentPage;
		this.totalCount = totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
