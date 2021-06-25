package objects;



public class OlapObjects {
	
	private String row;
	private String column;
	private String value;
	
	/* Rows Initialized */
	public String getRow() {
		return row;
		
	}
	public void setRow(String row) {
		this.row = row;
		
	}
	/* Columns Initialized */
	public String getColumn() {
		
		return this.column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	/* Values Initializing */
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	/* A Main Constructor */
	public OlapObjects() {}
	

}
