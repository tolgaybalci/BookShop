
public class Ebook extends Book{

	private int fileSize;
	private String encodingFormat;
	private int numOfDevicesBeingUsed;
	
	public Ebook(String name, String author, String bookId, int price, int fileSize, String encodingFormat, int numofDevicesBeingUsed) {
		super(name, author, bookId, price);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
		this.numOfDevicesBeingUsed = numOfDevicesBeingUsed;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public int getNumOfDevicesBeingUsed() {
		return numOfDevicesBeingUsed;
	}

	public void setNumOfDevicesBeingUsed(int numOfDevicesBeingUsed) {
		this.numOfDevicesBeingUsed = numOfDevicesBeingUsed;
	}
	
	
	
}
