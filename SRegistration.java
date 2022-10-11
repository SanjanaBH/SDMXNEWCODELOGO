import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FirstPage
    extends JFrame
    implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel add;
    private JTextField tadd;
    private JCheckBox term1;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
	//private Graphics g;
	//private Image i;
	
	/*public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit(); 
		//Image i = new Image();
        Image i=t.getImage("C:\\Users\\dhanashree.sonawane\\Desktop\\logo1.png");  
		g.drawImage(i,25,35,this);
		//g.setBounds(900,30,30,40);
    }  */

   
    // constructor, to initialize the components
    // with default values.
    public FirstPage()
    {
        setTitle("SDMX CONVERTER");
        setBounds(50, 50, 1200, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
		ImageIcon img = new ImageIcon("C:\\Users\\dhanashree.sonawane\\Desktop\\pastedImage.jpg");
		this.setIconImage(img.getImage());
		

        c = getContentPane();
        c.setLayout(null);
		
		 
        title = new JLabel("DATABASE CONNECTION");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(600, 80);
        title.setLocation(500, 70);
        c.add(title);

        name = new JLabel("User Name");
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(170, 20);
        tname.setLocation(900, 200);
        c.add(tname);

        mno = new JLabel("Password");
        mno.setFont(new Font("Arial", Font.PLAIN, 12));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(170, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        
        add = new JLabel("IP Address");
        add.setFont(new Font("Arial", Font.PLAIN, 12));
        add.setSize(100, 20);
        add.setLocation(100, 200);
        c.add(add);

        tadd = new JTextField();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(170,20);
        tadd.setLocation(200, 200);
        //tadd.setLineWrap(true);
        c.add(tadd);

        
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Proceed");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

       
        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
		 String userValue = tname.getText();        //get user entered username from the textField1  
        String passValue = tmno.getText();  		//get user entered pasword from the textField2  
		 String IPValue = add.getText();
        //JPanel newPanel1; 
       
       /* if (e.getSource() == sub) {
            if (sub.isSelected()) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n";
                /*if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";

                String data3 = "IP Address : " + tadd.getText();
                tout.setText(data + data3);
                tout.setEditable(false);
                res.setText("Connection Established..");
				//this.setVisible(false);
				//new Registration13().setVisible(true);
				String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
        JPanel newPanel1;*/ 
        //check whether the credentials are authentic or not  
        if (userValue.equals("abc") && passValue.equals("123"))   //if authentic, navigate user to a new page  
        {
				SecondPage s = new SecondPage();
				s.setVisible(true);
				
				
			JComboBox version;
			String versions[]
			= { "version1", "version2", "version3", "version4",};
			version = new JComboBox(versions);
			version.setFont(new Font("Arial", Font.PLAIN, 15));
			version.setSize(30, 10);
			version.setLocation(150, 150);
			s.add(version);
			
			JComboBox Element;
			String Elements[]
			= { "Element1", "Element2", "Element3", "Element4"};
			Element = new JComboBox(Elements);
			Element.setFont(new Font("Arial", Font.PLAIN, 15));
			Element.setSize(10, 40);
			Element.setLocation(180, 190);
			s.add(Element);
			
			ButtonGroup gengp;
			JRadioButton mapping;
			mapping = new JRadioButton("Mapping");
			mapping.setFont(new Font("Arial", Font.PLAIN, 10));
			mapping.setSelected(true);
			mapping.setSize(90, 40);
			mapping.setLocation(200, 185);
			s.add(mapping);
			
			JRadioButton filSubmission;
			filSubmission = new JRadioButton("FileSubmission");
			filSubmission.setFont(new Font("Arial", Font.PLAIN, 10));
			filSubmission.setSelected(false);
			filSubmission.setSize(90, 40);
			filSubmission.setLocation(280, 185);
			s.add(filSubmission);
			
			gengp = new ButtonGroup();
			gengp.add(mapping);
			gengp.add(filSubmission);
			//JPanel newPanel1;  
			//page.add(newPanel1);
			//JButton b2;
			//b2 = new JButton("SUBMIT");
			//newPanel1.add(b2);
			//r1.add(b2);
			}
		
	
	
			 else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
         }

        /*else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            //tout.setText(def);
           // term.setSelected(false);
           // date.setSelectedIndex(0);
           // month.setSelectedIndex(0);
           // year.setSelectedIndex(0);
            resadd.setText(def);
        }*/
		
    
	

	   }
// Driver Code
class SRegistration {

    public static void main(String[] args) throws Exception
    {
        FirstPage f = new FirstPage();
		//FourthPage p= new FourthPage();
    }
}