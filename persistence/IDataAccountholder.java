package persistence;

import polymorphism.Accountholder;

public interface IDataAccountholder {
	public void Access() throws Exception;
	public void Write(Accountholder ach) throws Exception;
	public void Close() throws Exception;
}
