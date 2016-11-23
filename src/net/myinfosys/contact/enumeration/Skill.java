package net.myinfosys.contact.enumeration;

public enum Skill {
	JAVA(1),
	PHP(2),
	C_SHARP(3),
	C_PLUS_PLUS(4),
	PHYTON(5);
	
	private int code;
	Skill(int code){
		this.code = code;
	}
	
	public int getCode(){
		return this.code;
	}
}
