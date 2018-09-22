package com.SwoTec.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JOptionPane;

public class Writer {
	public void codingFile(String vCode,String xp,String m,String d,String gw,String s,String gen,String c,String save) {
		File file = new File("UA3.SC2Bank");
		try {
			FileOutputStream fos =new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
			bw.write("<Bank version=\"1\">\n");
			bw.write("    <Section name=\"Un\">\n");
			bw.write("        <Key name=\"VC\">\n");
			bw.write("            <Value string=\""+vCode+"\"/>\n");
			bw.write("        </Key>\n");
			bw.write("        <Key name=\"XP\">\n");
			bw.write("            <Value string=\""+xp+"\"/>\n");
			bw.write("        </Key>\n");
			bw.write("        <Key name=\"M\">\n");
			bw.write("            <Value string=\""+m+"\"/>\n");
			bw.write("        </Key>\n");
			bw.write("        <Key name=\"D\">\n");
			bw.write("            <Value string=\""+d+"\"/>\n");
			bw.write("        </Key>\n");
			bw.write("        <Key name=\"GW\">\n");
			bw.write("            <Value string=\""+gw+"\"/>\n");
			bw.write("        </Key>\n");
			bw.write("        <Key name=\"S\">\n");
			bw.write("            <Value string=\""+s+"\"/>\n");
			bw.write("        </Key>\n");
			bw.write("        <Key name=\"Gen\">\n");
			bw.write("            <Value string=\""+gen+" "+save+" "+gen+" 350 -5\"/>\n");
			bw.write("        </Key>\n");
			bw.write("        <Key name=\"C\">\n");
			bw.write("            <Value string=\""+c+"\"/>\n");
			bw.write("        </Key>\n");
			bw.write("    </Section>\n");
			bw.write("    <Signature value=\"EnjoyIt~AND HaveFun!\"/>\n");
			bw.write("</Bank>\n");
			
			
			
			bw.close();
			osw.close();
			fos.close();
			
			JOptionPane.showMessageDialog(null, "写入完毕，在本文件夹下找到UA3.SC2Bank文件，自己检查一下，上游戏试验一下。");
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
