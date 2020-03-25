package cn.ncu.retest.pojo;

public class SearchVo {
	// 当前页
	private Integer pageNo;
	// 每页数
	private Integer pageSize = 20;
	// 开始行
	private Integer startRow = 0;

	private String keyWord;
	private String bkyxsm;

	public String getBkyxsm() {
		return bkyxsm;
	}

	public void setBkyxsm(String bkyxsm) {
		this.bkyxsm = bkyxsm;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
}
