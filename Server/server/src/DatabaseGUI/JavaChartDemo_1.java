package DatabaseGUI;


import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.io.*;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class JavaChartDemo_1
{
    
    // parameters for deciding the arguments for drawing the bar graph
    int totalNumberOfQuestions;         // total number of questions received by the student
    int correctlyAnswered;              // number of questions correctly answered by the student
    int incorrectlyAnswered;            // number of questions incorrectly answered by the student
    
    
    JButton backButton;
    
    
   
   
    // the method for drawing the bar graph
    public void draw(String rollNumber,String standard,String subject) throws SQLException 
    {
        
        Statement start=(Statement)Essentials.databaseConnection.createStatement();
        String query=new String("SELECT SUM(questions_attempted)AS total,sum(correct_answers) as correct,sum(questions_attempted-correct_answers) as incorrect FROM student_performance WHERE standard LIKE '"+standard+"'");
        
        
        // checking for roll number 
        if(!rollNumber.equals(""))
        {
            query=query.concat(" AND roll_number LIKE '"+rollNumber+"'");
           
        }
        
        
        // checking if name is present
        
        
        // checking if subject has been entered
        if(!subject.equals(""))
        {
          
            query=query.concat(" AND subject LIKE '"+subject+"'");   
            
        }
        
        
        // executing the query that has been formed
        ResultSet res=(ResultSet) start.executeQuery(query);
        
        // entering the values into the parameters for graph
        if(res.next())
        {
            System.out.println("Query is successful");
            totalNumberOfQuestions=Integer.parseInt(new String(res.getString("total")));
            correctlyAnswered=Integer.parseInt(new String(res.getString("correct")));
            incorrectlyAnswered=Integer.parseInt(new String(res.getString("incorrect")));
                   // System.out.println(totalNumberOfQuestions+correctlyAnswered+incorrectlyAnswered);

        }
        
        //System.out.println(totalNumberOfQuestions+correctlyAnswered+incorrectlyAnswered);
        
        
        // Create a simple Bar chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(totalNumberOfQuestions , "Number of Questions", "Total");
        dataset.setValue(correctlyAnswered, "Number of Questions", "Correct");
        dataset.setValue(incorrectlyAnswered,"Number of Questions", "Incorrect");
    
        
        // Insert 'Performance of <student name>' for better effect
        // The labelling of the bar graph
        JFreeChart chart = ChartFactory.createBarChart("Performance Analysis",
        "Performance", "Number of Questions", dataset, PlotOrientation.VERTICAL,
        false, true, false);
        
        // displaying the graph using the java
        try 
        {
            
            String path="/users/extusr/animesh14/testNew.jpeg";
            OutputStream stream=System.out;
            ChartUtilities.saveChartAsJPEG(new File("/users/extusr/animesh14/testNew.jpeg"), chart, 500,300); 
            JFrame editorFrame = new JFrame("Image Demo");
           
            /*URL url = new File(path).toURI().toURL();
            BufferedImage img = ImageIO.read(url);
            img = ImageIO.read(new File(path));
            */
            // URL url = new URL(getCodeBase(), "examples/strawberry.jpg");
             BufferedImage image = null;
             image = ImageIO.read(new File(path));
            
             ImageIcon imageIcon = new ImageIcon(image);
             JLabel jLabel = new JLabel();
             jLabel.setIcon(imageIcon);
             editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

             editorFrame.pack();
             editorFrame.setLocationRelativeTo(null);
             editorFrame.setVisible(true);
           
             
             
            
             
        }
        catch (IOException e) 
        {
            System.err.println("Problem occurred creating chart.");
        } 
        

    }
   
       
}
