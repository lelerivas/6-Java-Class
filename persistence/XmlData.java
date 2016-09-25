package persistence;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
 
import polymorphism.Accountholder;

public class XmlData implements IDataAccountholder{

	private File file;
	private OutputStream out;
	
	@Override
	public void Access() throws Exception {
		file = new File("C:/workspace/SixthJavaClass/","Accountholder.xml");
		if (!file.exists()){
			file.createNewFile();
		}
	}

	@Override
	public void Write(Accountholder ach) throws Exception {
		out = new FileOutputStream("C:/workspace/SixthJavaClass/Accountholder.xml");
		XStream xtream = new XStream(new DomDriver());
		xtream.toXML(ach , out);
	}

	@Override
	public void Close() throws Exception {
		if(out != null){
			out.flush();
			out.close();
		}
	}
}
