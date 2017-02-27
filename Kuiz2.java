import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class Kuiz2 extends JFrame {

	private JPanel panel;
	Color Background = new Color(13, 190, 230);
	Container cp = getContentPane();
	GridBagConstraints gbc = new GridBagConstraints();
	private JTextField tfInput[], tfOutput;
	private String str;
	private int Rez;

	public Kuiz2() {
		setTitle("Kuiz2 GUI");
		setSize(1200, 800);
		String[] pyetja = new String[20];
		pyetja[0] = "Kryeqyteti";// prishtina
		pyetja[1] = "Kontinenti ";// evropa
		pyetja[2] = "Rajoni";// ballkan
		pyetja[3] = "Siperfaqja"; // 10,908km²
		pyetja[4] = "Popullsia";// ~2000000
		pyetja[5] = "Qyteti me popullsi me te madhe";// prishtina
		pyetja[6] = "Pika me e lart ndodhet ne";// Gjeravica
		pyetja[7] = "Lartesia e pikes me te lart ";// 2,656 m
		pyetja[8] = "Pika me e ulet ndodhet ne ";// Vermice
		pyetja[9] = "Lartesia e pikes me te ulet";// 275 m
		pyetja[10] = "Sipërfaqja më e madhe ujore eshte liqeni i ";// Gazivodës
		pyetja[11] = "Ka klimë të ndyshueshme ";// kontinentale
		pyetja[12] = "Kufijnt ne km";// 700.7 km
		pyetja[13] = "Territori i Kosovës në kohën e ilirëve quhej ";// Dardani
		pyetja[14] = "Kosova ne jugperëndim  kufizohet me  ";// Shqiprine
		pyetja[15] = "Kosova kufizohet në perendim me ";// Mali i zi
		pyetja[16] = "Kosova kufizohet në juglindje me ";// Maqedonine
		pyetja[17] = "Kosova kufizohet në veri me ";// serbin
		pyetja[18] = "Lumi me i gjate eshte";// Drini i Bardhë
		pyetja[19] = "Pavarsia e kosoves u shpall ne vitin";// 2008

		JLabel[] P = new JLabel[20];
		tfInput = new JTextField[20];
		for (int i = 0; i < pyetja.length; i++) {
			P[i] = new JLabel(i + 1 + " - " + pyetja[i]);
			tfInput[i] = new JTextField(20);
		}
		JPanel left = new JPanel();
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setLayout(new GridBagLayout());

		for (int i = 1; i <= pyetja.length; i++) {
			gbc.gridy = i;
			gbc.gridx = 0;
			panel.add(P[i - 1], gbc);
			tfInput[i - 1].setBackground(Background);
			gbc.gridy = i;
			gbc.gridx = 1;
			panel.add(tfInput[i - 1], gbc);

		}
		tfOutput = new JTextField(20);
		tfOutput.setEditable(false);
		tfOutput.setBackground(Background);
		gbc.gridy = 21;
		gbc.gridx = 1;
		gbc.ipadx = 30;
		panel.add(tfOutput, gbc);
		JLabel pershkrimi = new JLabel(
				"Pytje nga lenda e gjeografis.Pergjigjet shkruhen ne katrorine zbrazet dhe shtypet ENTER per rezultat");
		gbc.gridy = 0;
		gbc.gridx = 1;
		gbc.ipadx = 300;
		panel.add(pershkrimi, gbc);

		// Action performed
		tfInput[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[0].getText();
				if (strin.toLowerCase().equals("prishtina") || strin.toLowerCase().equals("prishtine")
						|| strin.toLowerCase().equals("prishtin")) {
					tfInput[0].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[0].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[1].getText();
				if (strin.toLowerCase().equals("evropa") || strin.toLowerCase().equals("evrope")) {
					tfOutput.setText("Pergjigja e juaj eshte e SAKT!");
					tfInput[1].setText("SAKT!");
				} else {
					tfOutput.setText("Pergjigja e juaj eshte e PASAKT!");
					tfInput[1].setText(""); // clear input TextField
				}
			}
		});

		tfInput[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[2].getText();

				if (strin.toLowerCase().equals("ballkan") || strin.toLowerCase().trim().equals("gadishulli ballkanik")
						|| strin.toLowerCase().equals("ballkani")) {
					tfInput[2].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e SAKT!");
				} else {
					tfInput[2].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e PASAKT!");
				}
			}
		});

		tfInput[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[3].getText();

				if (strin.toLowerCase().equals("10908km2") || strin.toLowerCase().equals("10908km^2")||strin.toLowerCase().equals("~10000km^2")||strin.toLowerCase().equals("10000km2")) {
					tfInput[3].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[3].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[4].getText();

				if (strin.toLowerCase().equals("~2000000") || strin.toLowerCase().equals("~2milion")
						|| strin.toLowerCase().equals("~2 milion")) {
					tfInput[4].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[4].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[5].getText();

				if (strin.toLowerCase().equals("prishtina")) {
					tfInput[5].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[5].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[6].getText();
				if (strin.toLowerCase().equals("gjeravica") || strin.toLowerCase().equals("gjeravice")
						|| strin.toLowerCase().equals("gjeravic")) {
					tfInput[6].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[6].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[7].getText();

				if (strin.toLowerCase().equals("2656 m") || strin.toLowerCase().equals("2656m")
						|| strin.toLowerCase().equals("2656")) {
					tfInput[7].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[7].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[8].getText();

				if (strin.toLowerCase().equals("vermice") || strin.toLowerCase().equals("vermica")) {
					tfInput[8].setText("SAKT"); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[8].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[9].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[9].getText();

				if (strin.toLowerCase().equals("275 m") || strin.toLowerCase().equals("275m")
						|| strin.toLowerCase().equals("275")) {
					tfInput[9].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[9].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[10].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[10].getText();

				if (strin.toLowerCase().equals("gazivodes")) {
					tfInput[10].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[10].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[11].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[11].getText();

				if (strin.toLowerCase().equals("kontinentale")) {
					tfInput[11].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[11].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[12].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[12].getText();

				if (strin.toLowerCase().equals("700.7 km") || strin.toLowerCase().equals("700.7km")
						|| strin.toLowerCase().equals("~700 km")) {
					tfInput[12].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[12].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[13].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[13].getText();

				if (strin.toLowerCase().equals("dardani")) {
					tfInput[13].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[13].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[14].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[14].getText();

				if (strin.toLowerCase().equals("shqiperine") || strin.toLowerCase().equals("shqiperin")
						|| strin.toLowerCase().equals("shqiprine")) {
					tfInput[14].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[14].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[15].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[15].getText();

				if (strin.toLowerCase().equals("malizi") || strin.toLowerCase().equals("mal i zi")) {
					tfInput[15].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[15].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[16].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[16].getText();

				if (strin.toLowerCase().equals("macedonine") || strin.toLowerCase().equals("macedonin")) {
					tfInput[16].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[16].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[17].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[17].getText();

				if (strin.toLowerCase().equals("serbine") || strin.toLowerCase().equals("serbin")) {
					tfInput[17].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[17].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[18].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[18].getText();

				if (strin.toLowerCase().equals("drini i bardh") || strin.toLowerCase().equals("driniibardh")
						|| strin.toLowerCase().equals("drinibardh")) {
					tfInput[18].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[18].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		tfInput[19].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String strin = tfInput[19].getText();

				if (strin.toLowerCase().equals("2008")) {
					tfInput[19].setText("SAKT!");
					tfOutput.setText("Pergjigja e juaj eshte e Sakt");
				} else {
					tfInput[19].setText(""); // clear input TextField
					tfOutput.setText("Pergjigja e juaj eshte e pasakt");
				}
			}
		});

		cp.add(panel);
		cp.setBackground(Background);
		setVisible(true);
	}

	public static void main(String[] a) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Kuiz2(); // Let the constructor do the job
			}
		});
	}
}
