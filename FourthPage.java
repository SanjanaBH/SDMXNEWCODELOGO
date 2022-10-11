import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.util.File;

class FourthPage
    extends JFrame
    implements ActionListener {
 
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name1;
    private JTextField tname2;
    private JLabel mno2;
    private JTextField tmno2;
    private JLabel selectOne;
    private JRadioButton mapping;
    private JRadioButton filSubmission;
    private ButtonGroup gengp;
    private JLabel elementname;
    //private JComboBox Elementnm;
    private JComboBox version2;
    //private JComboBox year;
    //private JLabel add;
    //private JTextArea tadd;
    private JCheckBox term;
    private JButton sub2;
    //private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
	private JComboBox elementname1;
	//private ImageIcon image1;
	//private ImageIO io;
	//private JLabel lable1;
	//private String File;
	//private RenderedImage rendered;
	
	/*JButton btOpen = new JButton("Open");
btOpen.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		if (JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(null)) {
			label.setIcon(new ImageIcon(chooser.getSelectedFile().getAbsolutePath()));
		}
	}
});*/
	
	
 
   /* private String Elementnms[]
        = { "Loans and Advances", "Asset Quality Migration", "Netting Items for NPA - Loans and Advances", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };*/
    private String versions[]
        ={"Audited", "Unaudited"}; /*{ "version1", "version2", "version3", "version4",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };*/
    /*private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };*/
			
		public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit(); 
	    Image i=t.getImage("C:\\Users\\dhanashree.sonawane\\Desktop\\logo1.png");  
		g.drawImage(i,25,35,this);
		
    }  

 
    // constructor, to initialize the components
    // with default values.
    public FourthPage()
    {
        setTitle("SDMX CONVERTER");
        setBounds(50, 50, 1200, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
		
		//initComponents();
		ImageIcon img = new ImageIcon("C:\\Users\\dhanashree.sonawane\\Desktop\\pastedImage.jpg");
		this.setIconImage(img.getImage());
		
		/*ImageIcon = Toolkit.getDefaultToolkit().getImageIcon("This PC\\Desktop\\logo.jpg"); 
		ImageIcon image1 = new ImageIcon(getClass().getResource("C:\\Users\\dhanashree.sonawane\\Desktop\\logo.jpg"));
		JLabel label1 = new JLabel("image1");
		c.add(label1);*/
		
 
        c = getContentPane();
        c.setLayout(null);
        title = new JLabel("Data File Submission");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
		/*Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\dhanashree.sonawane\\Desktop\\logo.jpg"); 
		//JFrame title1 = new JFrame();
		title1.setIconImage(icon);    
		title1.setLayout(null);     
		title1.setSize(400,400);     
		title1.setVisible(true);
		c.add(title1);*/
		/*JPanel panel = new JPanel();
		panel.setBounds(50, 50, 250, 250);
		BufferedImage img1 = ImageIO.read(new File("C:\\Users\\dhanashree.sonawane\\Desktop\\logo.jpg"));
		JLabel pic = new JLabel(new ImageIcon(img1));
		panel.add(pic);*/
 
        name1 = new JLabel("Element Name");
        name1.setFont(new Font("Arial", Font.PLAIN, 15));
        name1.setSize(100, 20);
        name1.setLocation(100, 100);
        c.add(name1);
 
        tname2 = new JTextField();
        tname2.setFont(new Font("Arial", Font.PLAIN, 15));
        tname2.setSize(190, 20);
        tname2.setLocation(200, 100);
        c.add(tname2);
 
        mno2 = new JLabel("Time Period");
        mno2.setFont(new Font("Arial", Font.PLAIN, 15));
        mno2.setSize(100, 20);
        mno2.setLocation(100, 150);
        c.add(mno2);
 
        tmno2 = new JTextField();
        tmno2.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno2.setSize(150, 20);
        tmno2.setLocation(200, 150);
        c.add(tmno2);
		
		/*img = new ImageIcon();
        Image icon = Toolkit.getDefaultToolkit().getImage("This PC\\Desktop\\rbi-company-logo.jpg"); 
		f1.setIconImage(icon);    
		f1.setLayout(null);     
		f1.setSize(400,400);     
		f1.setVisible(true);*/
 
        /*selectOne = new JLabel("selectOne");
        selectOne.setFont(new Font("Arial", Font.PLAIN, 20));
        selectOne.setSize(100, 20);
        selectOne.setLocation(100, 200);
        c.add(selectOne);
 
        mapping = new JRadioButton("Mapping");
        mapping.setFont(new Font("Arial", Font.PLAIN, 15));
        mapping.setSelected(true);
        mapping.setSize(75, 20);
        mapping.setLocation(200, 200);
        c.add(mapping);
 
        filSubmission = new JRadioButton("FileSubmission");
        filSubmission.setFont(new Font("Arial", Font.PLAIN, 15));
        filSubmission.setSelected(false);
        filSubmission.setSize(80, 20);
        filSubmission.setLocation(275, 200);
        c.add(filSubmission);
 
        gengp = new ButtonGroup();
        gengp.add(mapping);
        gengp.add(filSubmission);*/
		
       /* elementname1 = new JComboBox("Status");
        elementname1.setFont(new Font("Arial", Font.PLAIN, 15));
        elementname1.setSize(100, 20);
        elementname1.setLocation(100, 200);
        c.add(elementname1);*/
 
       /* Elementnm = new JComboBox(Elementnms);
        Elementnm.setFont(new Font("Arial", Font.PLAIN, 15));
        Elementnm.setSize(50, 20);
        Elementnm.setLocation(200, 250);
        c.add(Elementnm);*/
 
        version2 = new JComboBox(versions);
        version2.setFont(new Font("Arial", Font.PLAIN, 15));
        version2.setSize(60, 20);
        version2.setLocation(200, 200);
        c.add(version2);
 
        /*year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);*/
 
       /* add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);*/
 
        /*tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);*/
 
        /*term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);*/
 
        sub2 = new JButton("Download");
        sub2.setFont(new Font("Arial", Font.PLAIN, 15));
        sub2.setSize(100, 20);
        sub2.setLocation(150, 450);
        sub2.addActionListener(this);
        c.add(sub2);
 
        /*reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);*/
 
        /*tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);*/
 
        setVisible(true);
    }
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {	
	
	/*
	try (BufferedInputStream inputStream = new BufferedInputStream(new fil("C:/Users/dhanashree.sonawane\Desktop\copy.xlsx").openStream());
  FileOutputStream fileOS = new FileOutputStream("C:/Users/dhanashree.sonawane/Desktop/filename.xlsx")) {
    byte data[] = new byte[1024];
    int byteContent;
    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
        fileOS.write(data, 0, byteContent);
    }
} catch (IOException e) 
{
    // handles IO exceptions
}*/
		   //get user entered username from the textField1  
		   //JButton btSave = new JButton("Save");
//btSave.addActionListener(new ActionListener() 
//{
	//public void actionPerformed(ActionEvent e) 
	//{
		
		 /*JFileChooser chooser = new JFileChooser();
			if (JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(null)) {
			sub2.setIcon(new ImageIcon(chooser.getSelectedFile().getAbsolutePath()));*/
		
		
		/*JFileChooser chooser1 = new JFileChooser();
		chooser1.setSelectedFile(new File("report.png")); // user will see this name during download
		if (JFileChooser.APPROVE_OPTION == chooser1.showSaveDialog(null)) {
			RenderedImage rendered = createReportAsPng();
			io.write(rendered, "png", chooser1.getSelectedFile());			
		}*
		
	//}
//});
		   /*
		    JFileChooser chooser1 = new JFileChooser();
			if (JFileChooser.APPROVE_OPTION == chooser1.showOpenDialog(null)) {
			sub2.setIcon(new ImageIcon(chooser1.getSelectedFile().getAbsolutePath()));
		*/
			
       /* if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "ReturnName : "
                      + tname.getText() + "\n"
                      + "ReturnCode : "
                      + tmno.getText() + "\n";
                if (mapping.isSelected())
                    data1 = "selectOne : mapping"
                            + "\n";
                else
                    data1 = "selectOne : filSubmission"
                            + "\n";
                String data2
                    = "ElementName : "
                     // + (String)Elementnm.getSelectedItem()
                      + "/" + (String)version.getSelectedItem()
                     // + "/" + (String)year.getSelectedItem()
                      + "\n";
 
                /*String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");*/
            //}//
            /*else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }*/
        //}
 
        /*else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            //res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            //Elementnm.setSelectedIndex(0);
            version.setSelectedIndex(0);
            //year.setSelectedIndex(0);
            resadd.setText(def);
        }*/
    }
}
 
// Driver Code

/*class LastScreen {
 
    public static void main(String[] args) throws Exception
    {
        FourthPage f = new FourthPage();
		
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setVisible(true);
		//gui.pack();
		
    }
}*/