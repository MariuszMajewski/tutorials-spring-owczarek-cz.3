package implementation;

import java.util.Date;

import api.Logger;

public class LoggerImp implements Logger{
	private String name;
	private int version;
	public void log(String message) {
		System.out.println(new Date()+" ["+name+"] "+ message+" ver: "+version);
		
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void setVersion(int version) {
		this.version= version;
		
	}

}
