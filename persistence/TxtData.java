package persistence;

import java.io.RandomAccessFile;

import polymorphism.Accountholder;

public class TxtData implements IDataAccountholder {

	private RandomAccessFile raf;	
	
	@Override
	public void Access() throws Exception {
		raf = new RandomAccessFile("C:/workspace/SixthJavaClass/Accountholder.txt", "rw");
		raf.seek(raf.length());
	}

	@Override
	public void Write(Accountholder ach) throws Exception {
		raf.writeBytes(ach.toString()+"\n");
	}

	@Override
	public void Close() throws Exception {
		raf.close();
	}
}
