package net.myinfosys.contact.enumeration;

public enum Sex {
	LAKI_LAKI(1),
	PEREMPUAN(2);
	
	private int code;
	Sex(int code){
		this.code = code;
	}
	
	public int getCode(){
		return this.code;
	}
}
