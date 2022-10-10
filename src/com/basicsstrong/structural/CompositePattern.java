package com.basicsstrong.structural;

import java.util.ArrayList;
import java.util.List;

interface Data {
	public void doubleClick();
}

class File implements Data {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doubleClick() {
		System.out.println(this.getName() + " file is Opened in a program");
	}

}

class Folder implements Data {
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Data> getFolder() {
		return folder;
	}

	public void setFolder(List<Data> folder) {
		this.folder = folder;
	}

	private List<Data> folder = new ArrayList<Data>();

	@Override
	public void doubleClick() {
		System.out.println(this.getName() + " file is Opened");
		for (Data data : folder) {
			data.doubleClick();
		}
	}

	public void add(Data data) {
		folder.add(data);
	}

	public void remove(Data data) {
		folder.remove(data);
	}
}

public class CompositePattern {
	public static void main(String[] args) {

		Folder f1 = new Folder();
		f1.setName("Folder 1");
		Folder f2 = new Folder();
		f2.setName("Folder 2");

		File file1 = new File();
		file1.setName("File 1");
		File file2 = new File();
		file2.setName("File 2");

		File file3 = new File();
		file3.setName("File 3");
		File file4 = new File();
		file4.setName("File 4");

		f1.add(file1);
		f2.add(file2);
		f1.add(file3);
		f2.add(file4);

		f1.doubleClick();
		f2.doubleClick();

	}

}
