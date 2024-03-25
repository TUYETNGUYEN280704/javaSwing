package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.Principal;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import view.MyNotePadView;

public class MyNotePadController implements ActionListener {

	private MyNotePadView myNotePadView;

	public MyNotePadController(MyNotePadView myNotePadView) {
		this.myNotePadView = myNotePadView;
	}

//APPROVE_OPTION -> CHỌn đc 1 cái file
//cancle -> bỏ đi

// làm sự kiện cho nút ấn
	@Override
	public void actionPerformed(ActionEvent e) {
		String commad = e.getActionCommand();
		JFileChooser fc = new JFileChooser();

		if (commad.equals("Open")) {
			int returnVal = fc.showOpenDialog(this.myNotePadView);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getName();
				this.myNotePadView.model.setFileName(file.getAbsolutePath());;

				this.myNotePadView.lblNewLabel.setText(	this.myNotePadView.model.getFileName());
				if (fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";
						for (String line : allText) {
							result += line;
							result += "\n";
						}
						this.myNotePadView.model.setContent(result);
						this.myNotePadView.textArea.setText(this.myNotePadView.model.getContent());
					} catch (Exception e2) {
						e2.printStackTrace();
					}

				}
			}//  CÓ GÌ XEM LẠI BÀI 71 MÀ BÀI 71 CHƯA CÓ HC HEHE
		} else if (commad.equals("Save"))
			// file đã tồn tại or chưa
			if(this.myNotePadView.model.getFileName().length()>0){
				save(this.myNotePadView.model.getFileName());
				

//				try {
//					PrintWriter pw = new PrintWriter(this.myNotePadView.model.getFileName(), "UTF-8");
//					String data = this.myNotePadView.textArea.getText();
//					pw.print(data);
//					pw.flush();
//					pw.close();
//				} catch (FileNotFoundException e1) {
// 					e1.printStackTrace();
//				} catch (UnsupportedEncodingException e1) {
// 					e1.printStackTrace();
//				}
				
			}else{ // nếu save mà ko có file thì phải làm như này
				int returnVal = fc.showSaveDialog(this.myNotePadView);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
//					try {
					File file = fc.getSelectedFile();
//						PrintWriter pw = new PrintWriter(file.getAbsolutePath(), "UTF-8");
//						String data = this.myNotePadView.textArea.getText();
//						pw.print(data);
//						pw.flush();
//						pw.close();
//					} catch (FileNotFoundException e1) {
//						e1.printStackTrace();
//					} catch (UnsupportedEncodingException e1) {
//						e1.printStackTrace();
//					}
					save(file.getAbsolutePath());
					
					
					
					
					
					
//					String fileName = file.getName();
//					this.myNotePadView.model.setFileName(file.getAbsolutePath());;
//
//					this.myNotePadView.lblNewLabel.setText(	this.myNotePadView.model.getFileName());
//					if (fileName.endsWith(".txt")) {
//						try {
//							List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
//							String result = "";
//							for (String line : allText) {
//								result += line;
//								result += "\n";
//							}
//							this.myNotePadView.model.setContent(result);
//							this.myNotePadView.textArea.setText(this.myNotePadView.model.getContent());
//						} catch (Exception e2) {
//							e2.printStackTrace();
//						}

					}
				}
				
			}
	// tránh để ccode bị trùng 
	public void save(String fileName) {
		try {
		//	File file = fc.getSelectedFile();
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.myNotePadView.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
		 
	}

