package JavaSessions;

import java.util.ArrayList;

public class Arraylist_constructor {

	String name;
	double version;
	ArrayList<String> pluginList;

	public Arraylist_constructor(String name, double version, ArrayList<String> pluginList) {
		this.name = name;
		this.version = version;
		this.pluginList = pluginList;
	}

	public static void main(String[] args) {

		ArrayList<String> chPluginList = new ArrayList<String>();
		chPluginList.add("Video Maker");
		chPluginList.add("firepath");
		chPluginList.add("blog reviews");

		Arraylist_constructor ch = new Arraylist_constructor("Chrome", 81.23, chPluginList);

		System.out.println(ch.name);
		System.out.println(ch.version);
		System.out.println(ch.pluginList);

		System.out.println(ch.pluginList.get(1));

	}

}