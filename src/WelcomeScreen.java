import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

public class WelcomeScreen extends JFrame {

    private JComboBox InitialBox;
    private JComboBox DestinationBox;
    private JButton createRouteButton;
    private JPanel Panel2;
    private JButton exitButton;
    private JPanel MapPanel;

    Graphics g;

    public WelcomeScreen() {
        setContentPane(Panel2);
        Image background = Toolkit.getDefaultToolkit().createImage("images/background.jpg");

        InitialBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (InitialBox.getSelectedIndex() == 1) {


                }

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == exitButton) {
                    System.exit(0);
                }
            }
        });

        createRouteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graph CityBindings = new Graph(true, false);
                Vertex Istanbul = CityBindings.addVertex("Istanbul");
                Vertex London = CityBindings.addVertex("London");
                Vertex Jerusalem = CityBindings.addVertex("Jerusalem");
                Vertex Amsterdam = CityBindings.addVertex("Amsterdam");
                Vertex NewYork = CityBindings.addVertex("New York");
                Vertex Tokyo = CityBindings.addVertex("Tokyo");
                Vertex Wuhan = CityBindings.addVertex("Wuhan");
                Vertex Mumbai = CityBindings.addVertex("Mumbai");
                Vertex Sofia = CityBindings.addVertex("Sofia");
                Vertex Budepeste = CityBindings.addVertex("Budepeste");
                Vertex Rio = CityBindings.addVertex("Rio De Jenario");
                CityBindings.addEdge(Tokyo, Wuhan, 4000);
                CityBindings.addEdge(Mumbai, Wuhan, 1000);
                CityBindings.addEdge(Sofia, Budepeste, 800);
                CityBindings.addEdge(Mumbai, Budepeste, 10000);
                CityBindings.addEdge(Tokyo, Rio, 9000);
                CityBindings.addEdge(Istanbul, Budepeste, 1000);
                CityBindings.addEdge(Amsterdam, Budepeste, 1150);
                CityBindings.addEdge(Amsterdam, NewYork, 5730);
                CityBindings.addEdge(NewYork, Rio, 8000);
                CityBindings.addEdge(Rio, Jerusalem, 10000);
                CityBindings.addEdge(Jerusalem, Istanbul, 1130);
                CityBindings.addEdge(Budepeste, London, 1394);
                Dijkstra dijkstra = new Dijkstra();
                Dijkstra.shortestPathBetween(CityBindings,NewYork,Istanbul);
                String City1 = CityBindings.
                System.out.println(City1);
            }
        });
    }


}