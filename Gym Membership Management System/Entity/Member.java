package Entity;
import java.lang.*;
import javax.swing.*; 
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Member
{
    private String s1, s3, s4, s5, s6, s9, s11;
    private int i2, i10;
    private double weight7, height8;
    private File file;
	private FileWriter fwriter;

    public Member(){}
    public Member(String s1, int i2, String s3, String s4,String s5,String s6,double weight7,double height8,String s9,int i10, String s11)
    {
        this.s1 = s1;
		this.i2 = i2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
        this.s6 = s6;
        this.weight7 = weight7;
        this.height8 = height8;
        this.s9 = s9;
        this.i10 = i10;
        this.s11 = s11;
    }
    public void insertInfo()
	{
		try 
		{
			file = new File("./Data/userdata.txt");
			if (!file.exists()) {
                file.getParentFile().mkdirs(); 
                file.createNewFile(); 
            }
			
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
			String timeAndDate = myDateObj.format(myFormatObj);
			
			
			fwriter = new FileWriter(file, true);
			fwriter.write("Date and Time: " +timeAndDate+"\n");
			fwriter.write("========================================================"+"\n");
			fwriter.write("Name: "+s1+"\n");
            fwriter.write("Phone Number: "+i2+"\n");
            fwriter.write("Gender: "+s3+"\n");
			fwriter.write("Email: "+s4+"\n");
			fwriter.write("Date of Birth: "+s6+"\n");
			fwriter.write("Weight: "+weight7+"\n");
            fwriter.write("Height: "+height8+"\n");
            fwriter.write("Blood Group: "+s9+"\n");
            fwriter.write("Emergency Contact: "+i10+"\n");
            fwriter.write("Address: "+s11+"\n");
			fwriter.write("--------------------------------------------------------"+"\n");
			fwriter.flush();
			fwriter.close();
        } 
        catch(IOException ioe) 
        {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error writing to file!");
        }
    }
}
