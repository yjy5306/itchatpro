package com.yokipa.itchat.user.bd.vo;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class BRDPageMaker {
	private int totalCount;
	private int startPage;
	private int endPage;
	private int totalPage;
	private boolean next;
	private int start = 1;
	
	private int limit = 10;		// 한 화면에 출력할 레코드 수
	
	private BRDVO brd;
	
	public void page() {
		// 총 페이지 수
		totalPage = (int)(Math.ceil(brd.getPage() / (double)limit) * limit);
		
		// 시작 페이지 1, 11, 21...
		startPage = (totalPage - limit) + 1;
		
		// 마지막 페이지 10, 20, 30...
		endPage = (int) (Math.ceil(totalCount / (double) brd.getPerPageNum()));
		
		if (totalPage > endPage) {
			totalPage = endPage;
		}
		
		next = totalPage * brd.getPerPageNum() >= totalCount ? false : true;
	
	}
	
	public String uri(int page) {
		UriComponents uriComponets = UriComponentsBuilder.newInstance()
													.queryParam("page", page)												
													.build();
		if(page == 0) {
			UriComponents uriComponets1 = UriComponentsBuilder.newInstance()
					.queryParam("page", 1)
					.build();
			return uriComponets1.toUriString();
		}
		return uriComponets.toUriString();
	}
	
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		
		page();
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public BRDVO getBrd() {
		return brd;
	}

	public void setBrd(BRDVO brd) {
		this.brd = brd;
	}

	@Override
	public String toString() {
		return "BRDPageMaker [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage
				+ ", totalPage=" + totalPage + ", next=" + next + ", start=" + start + ", limit=" + limit + ", brd="
				+ brd + "]";
	}
	
}
