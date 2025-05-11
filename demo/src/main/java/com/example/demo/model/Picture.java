package com.example.demo.model;

public class Picture {
    private String filePath;
	private Integer widthInPixel;
	private Integer heightInPixel;
	private byte[] pictureBytes;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Integer getWidthInPixel() {
		return widthInPixel;
	}

	public void setWidthInPixel(Integer widthInPixel) {
		this.widthInPixel = widthInPixel;
	}

	public Integer getHeightInPixel() {
		return heightInPixel;
	}

	public void setHeightInPixel(Integer heightInPixel) {
		this.heightInPixel = heightInPixel;
	}

	public byte[] getPictureBytes() {
		return pictureBytes;
	}

	public void setPictureBytes(byte[] pictureBytes) {
		this.pictureBytes = pictureBytes;
	}

}
