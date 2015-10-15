
package pathfinderapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Conor
 */
public class PathFinderGUI extends javax.swing.JFrame {

    String name;
    String race;
    String Class1;
    String eyecolour;
    String sex;
    int age;
    int co;
    float height;
    double strength;
    double charisma;
    double wisdom;
    double intellect;
    double constitution;
    double dexterity;
    int fortitude;
    int reflex;
    double armourclass;
    int baseAttack;
    int will;
    int hitpoints;
    int cmb;
    int cmd;
    int count;
    double gold;
    int HitDie;
    ArrayList<PathFinder> aList;

    /**
     * Creates new form Practice
     */
    public PathFinderGUI() {
        name = new String();
        race = new String();
        Class1 = new String();
        eyecolour = new String();
        sex = new String();
        age = 0;
        count = 0;
        height = 0;
        strength = Math.floor((Math.random() * 18) + 3);
        charisma = Math.floor((Math.random() * 18) + 3);
        wisdom = Math.floor((Math.random() * 18) + 3);
        intellect = Math.floor((Math.random() * 18) + 3);
        constitution = Math.floor((Math.random() * 18) + 3);
        dexterity = Math.floor((Math.random() * 18) + 3);
        armourclass = (dexterity / 4) + 10.0;
        hitpoints = 0;
        cmb = 0;
        cmd = 0;

        gold = charisma * 10.0;
        switch (Class1) {
            case "Barbarian":
                baseAttack = 1;
                will = 0;
                fortitude = 2;
                reflex = 0;
                HitDie = 12;
                break;
            case "Bard":
                baseAttack = 0;
                will = 2;
                fortitude = 0;
                reflex = 2;
                HitDie = 8;
                break;
        }
        aList = new ArrayList<>();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameTf = new javax.swing.JTextField();
        AgeTf = new javax.swing.JTextField();
        RaceTf = new javax.swing.JTextField();
        ClassTf = new javax.swing.JTextField();
        EyeColourTf = new javax.swing.JTextField();
        SexTf = new javax.swing.JTextField();
        NewCharacterBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        RandomBtn = new javax.swing.JButton();
        DisplayCharacterBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        LoadBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        RollDieBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        ZLabel = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(184, 153, 83));
        setResizable(false);

        jPanel1.setLayout(null);

        Panel3.setBackground(new java.awt.Color(102, 102, 102));
        Panel3.setForeground(new java.awt.Color(142, 230, 240));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("Welcome to my PathFinder App.");

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Enter!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        jPanel1.add(Panel3);
        Panel3.setBounds(0, 0, 400, 460);

        jLabel2.setText("Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1, 90, 70, 14);

        jLabel3.setText("Age:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(3, 120, 60, 14);

        jLabel1.setText("Race:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(8, 150, 60, 14);

        jLabel4.setText("Class:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(9, 180, 60, 14);

        jLabel5.setText("Eye Colour:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 210, 70, 14);

        jLabel6.setText("Sex:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(12, 240, 50, 10);

        NameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTfActionPerformed(evt);
            }
        });
        jPanel1.add(NameTf);
        NameTf.setBounds(100, 90, 220, 20);
        jPanel1.add(AgeTf);
        AgeTf.setBounds(100, 120, 60, 20);

        RaceTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaceTfActionPerformed(evt);
            }
        });
        jPanel1.add(RaceTf);
        RaceTf.setBounds(100, 150, 80, 20);
        jPanel1.add(ClassTf);
        ClassTf.setBounds(100, 180, 120, 20);

        EyeColourTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EyeColourTfActionPerformed(evt);
            }
        });
        jPanel1.add(EyeColourTf);
        EyeColourTf.setBounds(100, 210, 100, 20);

        SexTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexTfActionPerformed(evt);
            }
        });
        jPanel1.add(SexTf);
        SexTf.setBounds(100, 240, 80, 20);

        NewCharacterBtn.setText("Add");
        NewCharacterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCharacterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(NewCharacterBtn);
        NewCharacterBtn.setBounds(30, 290, 51, 23);

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn);
        DeleteBtn.setBounds(110, 290, 70, 23);

        RandomBtn.setText("Random");
        RandomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RandomBtn);
        RandomBtn.setBounds(210, 290, 80, 23);

        DisplayCharacterBtn.setText("Display");
        DisplayCharacterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCharacterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayCharacterBtn);
        DisplayCharacterBtn.setBounds(30, 330, 70, 23);

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBtn);
        SaveBtn.setBounds(120, 330, 57, 23);

        LoadBtn.setText("Load");
        LoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LoadBtn);
        LoadBtn.setBounds(210, 330, 60, 23);

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBtn);
        SearchBtn.setBounds(30, 370, 70, 23);

        RollDieBtn.setText("Roll Die");
        RollDieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollDieBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RollDieBtn);
        RollDieBtn.setBounds(120, 370, 67, 23);

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ExitBtn);
        ExitBtn.setBounds(210, 370, 51, 23);

        quitBtn.setText("Quit");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(quitBtn);
        quitBtn.setBounds(10, 420, 53, 23);

        ZLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pathfinderapplication1/PathfinderBackground.png"))); // NOI18N
        jPanel1.add(ZLabel);
        ZLabel.setBounds(0, 0, 400, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTfActionPerformed

    private void RaceTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaceTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RaceTfActionPerformed

    private void EyeColourTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EyeColourTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EyeColourTfActionPerformed

    private void SexTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexTfActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        String delete = JOptionPane.showInputDialog("Enter in the name of your character here!");
        if (delete.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter meter and RETRY");
        } else {

            for (int i = 0; i < aList.size(); i++) {
                if (aList.get(i).getName().equals(delete)) {
                    aList.remove(i);
                    count = count - 1;
                    //This will delete the meter point/number you input and remove it from the ArrayList

                    JOptionPane.showMessageDialog(null, "Character with name deleted: " + name);
                    break;
                    //Confirmation of deletion
                } else if (i == count - 1) {
                    JOptionPane.showMessageDialog(null, "Account Does Not Exists.");
                    //Self explanatory
                }
            }

        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void RandomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomBtnActionPerformed
        // TODO add your handling code here:
        String names[] = {"Tyrion The Great", "Satan", "Georg The Great", "Elrond Mumford", "Lucile The Great"};
        int ages[] = {18, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
        String eyecolours[] = {"Blue", "Green", "Red", "Brown", "Yellow"};
        String races[] = {"Human", "Orc", "Half-Orc", "Elven", "Dwarven", "Demon"};
        String Class[] = {"Bard", "Paladin", "Warrior", "Priest"};
        String sex[] = {"Male", "Female"};
        double rand = Math.floor((Math.random() * 5) + 1);
        for (int i = 0; i < names.length && i < aList.size(); i++) {
            if (rand == 1.0) {
                JOptionPane.showMessageDialog(null, "Character Name: " + names[i] + "\n Age: " + ages[i] + "\n Eye Colour: " + eyecolours[i] + "\n Race: " + races[i] + "\n Class: " + Class[i] + "\n Sex: " + sex[i] + "\n" + "\n Strength:" + aList.get(i).getStrength() + "\n Dexterity: " + aList.get(i).getDexterity() + "\n Constitution: " + aList.get(i).getConstitution() + "\n Intellect: " + aList.get(i).getIntellect() + "\n Wisdom: " + aList.get(i).getWisdom() + "\n Charisma: " + aList.get(i).getCharisma()
                    + "\n" + "\n Base Attack: " + baseAttack + "\n Fort Save: " + fortitude + "\n Reflex Save: " + aList.get(i).getReflex() + "\n Will Save: " + aList.get(i).getWill() + "\n Armour Class: " + aList.get(i).getArmourclass() + "\n" + "\nHit Die: " + aList.get(i).getHitDie() + "\n" + "\n Gold: " + aList.get(i).getGold());
            }
            if (rand == 2.0) {
                JOptionPane.showMessageDialog(null, "Character Name: " + names[i] + "\n Age: " + ages[i] + "\n Eye Colour: " + eyecolours[i] + "\n Race: " + races[i] + "\n Class: " + Class[i] + "\n Sex: " + sex[i] + "\n" + "\n Strength:" + aList.get(i).getStrength() + "\n Dexterity: " + aList.get(i).getDexterity() + "\n Constitution: " + aList.get(i).getConstitution() + "\n Intellect: " + aList.get(i).getIntellect() + "\n Wisdom: " + aList.get(i).getWisdom() + "\n Charisma: " + aList.get(i).getCharisma()
                    + "\n" + "\n Base Attack: " + baseAttack + "\n Fort Save: " + fortitude + "\n Reflex Save: " + aList.get(i).getReflex() + "\n Will Save: " + aList.get(i).getWill() + "\n Armour Class: " + aList.get(i).getArmourclass() + "\n" + "\nHit Die: " + aList.get(i).getHitDie() + "\n" + "\n Gold: " + aList.get(i).getGold());
            }

            if (rand == 3.0) {
                JOptionPane.showMessageDialog(null, "Character Name: " + names[i] + "\n Age: " + ages[i] + "\n Eye Colour: " + eyecolours[i] + "\n Race: " + races[i] + "\n Class: " + Class[i] + "\n Sex: " + sex[i] + "\n" + "\n Strength:" + aList.get(i).getStrength() + "\n Dexterity: " + aList.get(i).getDexterity() + "\n Constitution: " + aList.get(i).getConstitution() + "\n Intellect: " + aList.get(i).getIntellect() + "\n Wisdom: " + aList.get(i).getWisdom() + "\n Charisma: " + aList.get(i).getCharisma()
                    + "\n" + "\n Base Attack: " + baseAttack + "\n Fort Save: " + fortitude + "\n Reflex Save: " + aList.get(i).getReflex() + "\n Will Save: " + aList.get(i).getWill() + "\n Armour Class: " + aList.get(i).getArmourclass() + "\n" + "\nHit Die: " + aList.get(i).getHitDie() + "\n" + "\n Gold: " + aList.get(i).getGold());

            }
            if (rand == 4.0) {
                JOptionPane.showMessageDialog(null, "Character Name: " + names[i] + "\n Age: " + ages[i] + "\n Eye Colour: " + eyecolours[i] + "\n Race: " + races[i] + "\n Class: " + Class[i] + "\n Sex: " + sex[i] + "\n" + "\n Strength:" + aList.get(i).getStrength() + "\n Dexterity: " + aList.get(i).getDexterity() + "\n Constitution: " + aList.get(i).getConstitution() + "\n Intellect: " + aList.get(i).getIntellect() + "\n Wisdom: " + aList.get(i).getWisdom() + "\n Charisma: " + aList.get(i).getCharisma()
                    + "\n" + "\n Base Attack: " + baseAttack + "\n Fort Save: " + fortitude + "\n Reflex Save: " + aList.get(i).getReflex() + "\n Will Save: " + aList.get(i).getWill() + "\n Armour Class: " + aList.get(i).getArmourclass() + "\n" + "\nHit Die: " + aList.get(i).getHitDie() + "\n" + "\n Gold: " + aList.get(i).getGold());
            }
            if (rand == 5.0) {
                JOptionPane.showMessageDialog(null, "Character Name: " + names[i] + "\n Age: " + ages[i] + "\n Eye Colour: " + eyecolours[i] + "\n Race: " + races[i] + "\n Class: " + Class[i] + "\n Sex: " + sex[i] + "\n" + "\n Strength:" + aList.get(i).getStrength() + "\n Dexterity: " + aList.get(i).getDexterity() + "\n Constitution: " + aList.get(i).getConstitution() + "\n Intellect: " + aList.get(i).getIntellect() + "\n Wisdom: " + aList.get(i).getWisdom() + "\n Charisma: " + aList.get(i).getCharisma()
                    + "\n" + "\n Base Attack: " + baseAttack + "\n Fort Save: " + fortitude + "\n Reflex Save: " + aList.get(i).getReflex() + "\n Will Save: " + aList.get(i).getWill() + "\n Armour Class: " + aList.get(i).getArmourclass() + "\n" + "\nHit Die: " + aList.get(i).getHitDie() + "\n" + "\n Gold: " + aList.get(i).getGold());
            }

        }
    }//GEN-LAST:event_RandomBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        String search = JOptionPane.showInputDialog("Enter in the name of your character here bae.");

        for (PathFinder p : aList) {

            if (search.equals(p.getName())) {
                JOptionPane.showMessageDialog(null, "Character Name: " + p.getName() + "\n Age: " + p.getAge() + "\n Eye Colour: " + p.getEyecolour() + "\n Race: " + p.getRace() + "\n Class: " + p.getClass1() + "\n Sex: " + p.getSex() + "\n" + "\n Strength:" + p.getStrength() + "\n Dexterity: " + p.getDexterity() + "\n Constitution: " + p.getConstitution() + "\n Intellect: " + p.getIntellect() + "\n Wisdom: " + p.getWisdom() + "\n Charisma: " + p.getCharisma()
                    + "\n" + "\n Base Attack: " + p.getBaseAttack() + "\n Fort Save: " + p.getFortitude() + "\n Reflex Save: " + p.getReflex() + "\n Will Save: " + p.getWill() + "\n Armour Class: " + p.getArmourclass() + "\n" + "\nHit Die: " + p.getHitDie() + "\n" + "\n Gold: " + p.getGold());

            }

        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void RollDieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollDieBtnActionPerformed
        // TODO add your handling code here:
        String input1;
        String input2;
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        double result5 = 0;
        double result6 = 0;
        double sum;

        input1 = JOptionPane.showInputDialog("Enter in the amount of die you would like to roll:");
        input2 = JOptionPane.showInputDialog("Enter in the amount of sides on the die:");
        switch (input1) {
            case "1":
            switch (input2) {
                case "100":
                result1 = Math.floor((Math.random() * 100) + 1);
                break;
                case "2":
                result1 = Math.floor((Math.random() * 2) + 1);
                break;
                case "3":
                result1 = Math.floor((Math.random() * 3) + 1);
                break;
                case "4":
                result1 = Math.floor((Math.random() * 4) + 1);
                break;
                case "5":
                result1 = Math.floor((Math.random() * 5) + 1);
                break;
                case "6":
                result1 = Math.floor((Math.random() * 6) + 1);
                break;
                case "8":
                result1 = Math.floor((Math.random() * 8) + 1);
                break;
                case "10":
                result1 = Math.floor((Math.random() * 10) + 1);
                break;
                case "12":
                result1 = Math.floor((Math.random() * 12) + 1);
                break;
                case "20":
                result1 = Math.floor((Math.random() * 20) + 1);
                break;
            }
            break;
            case "2":
            switch (input2) {
                case "100":
                result1 = Math.floor((Math.random() * 100) + 1);
                result2 = Math.floor((Math.random() * 100) + 1);
                break;
                case "2":
                result1 = Math.floor((Math.random() * 2) + 1);
                result2 = Math.floor((Math.random() * 2) + 1);
                break;
                case "3":
                result1 = Math.floor((Math.random() * 3) + 1);
                result2 = Math.floor((Math.random() * 3) + 1);
                break;
                case "4":
                result1 = Math.floor((Math.random() * 4) + 1);
                result2 = Math.floor((Math.random() * 4) + 1);
                break;
                case "5":
                result1 = Math.floor((Math.random() * 5) + 1);
                result2 = Math.floor((Math.random() * 5) + 1);
                break;
                case "6":
                result1 = Math.floor((Math.random() * 6) + 1);
                result2 = Math.floor((Math.random() * 6) + 1);
                break;
                case "8":
                result1 = Math.floor((Math.random() * 8) + 1);
                result2 = Math.floor((Math.random() * 8) + 1);
                break;
                case "10":
                result1 = Math.floor((Math.random() * 10) + 1);
                result2 = Math.floor((Math.random() * 10) + 1);
                break;
                case "12":
                result1 = Math.floor((Math.random() * 12) + 1);
                result2 = Math.floor((Math.random() * 12) + 1);
                break;
                case "20":
                result1 = Math.floor((Math.random() * 20) + 1);
                result2 = Math.floor((Math.random() * 20) + 1);
                break;
            }
            break;
            case "3":
            switch (input2) {
                case "100":
                result1 = Math.floor((Math.random() * 100) + 1);
                result2 = Math.floor((Math.random() * 100) + 1);
                result3 = Math.floor((Math.random() * 100) + 1);
                break;
                case "2":
                result1 = Math.floor((Math.random() * 2) + 1);
                result2 = Math.floor((Math.random() * 2) + 1);
                result3 = Math.floor((Math.random() * 2) + 1);
                break;
                case "3":
                result1 = Math.floor((Math.random() * 3) + 1);
                result2 = Math.floor((Math.random() * 3) + 1);
                result3 = Math.floor((Math.random() * 3) + 1);
                break;
                case "4":
                result1 = Math.floor((Math.random() * 4) + 1);
                result2 = Math.floor((Math.random() * 4) + 1);
                result3 = Math.floor((Math.random() * 4) + 1);
                break;
                case "5":
                result1 = Math.floor((Math.random() * 5) + 1);
                result2 = Math.floor((Math.random() * 5) + 1);
                result3 = Math.floor((Math.random() * 5) + 1);
                break;
                case "6":
                result1 = Math.floor((Math.random() * 6) + 1);
                result2 = Math.floor((Math.random() * 6) + 1);
                result3 = Math.floor((Math.random() * 6) + 1);
                break;
                case "8":
                result1 = Math.floor((Math.random() * 8) + 1);
                result2 = Math.floor((Math.random() * 8) + 1);
                result3 = Math.floor((Math.random() * 8) + 1);
                break;
                case "10":
                result1 = Math.floor((Math.random() * 10) + 1);
                result2 = Math.floor((Math.random() * 10) + 1);
                result3 = Math.floor((Math.random() * 10) + 1);
                break;
                case "12":
                result1 = Math.floor((Math.random() * 12) + 1);
                result2 = Math.floor((Math.random() * 12) + 1);
                result3 = Math.floor((Math.random() * 12) + 1);
                break;
                case "20":
                result1 = Math.floor((Math.random() * 20) + 1);
                result2 = Math.floor((Math.random() * 20) + 1);
                result3 = Math.floor((Math.random() * 20) + 1);
                break;
            }
            case "4":
            switch (input2) {
                case "100":
                result1 = Math.floor((Math.random() * 100) + 1);
                result2 = Math.floor((Math.random() * 100) + 1);
                result3 = Math.floor((Math.random() * 100) + 1);
                result4 = Math.floor((Math.random() * 100) + 1);
                break;
                case "2":
                result1 = Math.floor((Math.random() * 2) + 1);
                result2 = Math.floor((Math.random() * 2) + 1);
                result3 = Math.floor((Math.random() * 2) + 1);
                result4 = Math.floor((Math.random() * 2) + 1);
                break;
                case "3":
                result1 = Math.floor((Math.random() * 3) + 1);
                result2 = Math.floor((Math.random() * 3) + 1);
                result3 = Math.floor((Math.random() * 3) + 1);
                result4 = Math.floor((Math.random() * 3) + 1);
                break;
                case "4":
                result1 = Math.floor((Math.random() * 4) + 1);
                result2 = Math.floor((Math.random() * 4) + 1);
                result3 = Math.floor((Math.random() * 4) + 1);
                result4 = Math.floor((Math.random() * 4) + 1);
                break;
                case "5":
                result1 = Math.floor((Math.random() * 5) + 1);
                result2 = Math.floor((Math.random() * 5) + 1);
                result3 = Math.floor((Math.random() * 5) + 1);
                result4 = Math.floor((Math.random() * 5) + 1);
                break;
                case "6":
                result1 = Math.floor((Math.random() * 6) + 1);
                result2 = Math.floor((Math.random() * 6) + 1);
                result3 = Math.floor((Math.random() * 6) + 1);
                result4 = Math.floor((Math.random() * 6) + 1);
                break;
                case "8":
                result1 = Math.floor((Math.random() * 8) + 1);
                result2 = Math.floor((Math.random() * 8) + 1);
                result3 = Math.floor((Math.random() * 8) + 1);
                result4 = Math.floor((Math.random() * 8) + 1);
                break;
                case "10":
                result1 = Math.floor((Math.random() * 10) + 1);
                result2 = Math.floor((Math.random() * 10) + 1);
                result3 = Math.floor((Math.random() * 10) + 1);
                result4 = Math.floor((Math.random() * 10) + 1);
                break;
                case "12":
                result1 = Math.floor((Math.random() * 12) + 1);
                result2 = Math.floor((Math.random() * 12) + 1);
                result3 = Math.floor((Math.random() * 12) + 1);
                result4 = Math.floor((Math.random() * 12) + 1);
                break;
                case "20":
                result1 = Math.floor((Math.random() * 20) + 1);
                result2 = Math.floor((Math.random() * 20) + 1);
                result3 = Math.floor((Math.random() * 20) + 1);
                result4 = Math.floor((Math.random() * 20) + 1);
                break;
            }
            case "5":
            switch (input2) {
                case "100":
                result1 = Math.floor((Math.random() * 100) + 1);
                result2 = Math.floor((Math.random() * 100) + 1);
                result3 = Math.floor((Math.random() * 100) + 1);
                result4 = Math.floor((Math.random() * 100) + 1);
                result5 = Math.floor((Math.random() * 100) + 1);

                break;
                case "2":
                result1 = Math.floor((Math.random() * 2) + 1);
                result2 = Math.floor((Math.random() * 2) + 1);
                result3 = Math.floor((Math.random() * 2) + 1);
                result4 = Math.floor((Math.random() * 2) + 1);
                result5 = Math.floor((Math.random() * 2) + 1);

                break;
                case "3":
                result1 = Math.floor((Math.random() * 3) + 1);
                result2 = Math.floor((Math.random() * 3) + 1);
                result3 = Math.floor((Math.random() * 3) + 1);
                result4 = Math.floor((Math.random() * 3) + 1);
                result5 = Math.floor((Math.random() * 3) + 1);

                break;
                case "4":
                result1 = Math.floor((Math.random() * 4) + 1);
                result2 = Math.floor((Math.random() * 4) + 1);
                result3 = Math.floor((Math.random() * 4) + 1);
                result4 = Math.floor((Math.random() * 4) + 1);
                result5 = Math.floor((Math.random() * 4) + 1);

                break;
                case "5":
                result1 = Math.floor((Math.random() * 5) + 1);
                result2 = Math.floor((Math.random() * 5) + 1);
                result3 = Math.floor((Math.random() * 5) + 1);
                result4 = Math.floor((Math.random() * 5) + 1);
                result5 = Math.floor((Math.random() * 5) + 1);

                break;
                case "6":
                result1 = Math.floor((Math.random() * 6) + 1);
                result2 = Math.floor((Math.random() * 6) + 1);
                result3 = Math.floor((Math.random() * 6) + 1);
                result4 = Math.floor((Math.random() * 6) + 1);
                result5 = Math.floor((Math.random() * 6) + 1);

                break;
                case "8":
                result1 = Math.floor((Math.random() * 8) + 1);
                result2 = Math.floor((Math.random() * 8) + 1);
                result3 = Math.floor((Math.random() * 8) + 1);
                result4 = Math.floor((Math.random() * 8) + 1);
                result5 = Math.floor((Math.random() * 8) + 1);

                break;
                case "10":
                result1 = Math.floor((Math.random() * 10) + 1);
                result2 = Math.floor((Math.random() * 10) + 1);
                result3 = Math.floor((Math.random() * 10) + 1);
                result4 = Math.floor((Math.random() * 10) + 1);
                result5 = Math.floor((Math.random() * 10) + 1);

                break;
                case "12":
                result1 = Math.floor((Math.random() * 12) + 1);
                result2 = Math.floor((Math.random() * 12) + 1);
                result3 = Math.floor((Math.random() * 12) + 1);
                result4 = Math.floor((Math.random() * 12) + 1);
                result5 = Math.floor((Math.random() * 12) + 1);

                break;
                case "20":
                result1 = Math.floor((Math.random() * 20) + 1);
                result2 = Math.floor((Math.random() * 20) + 1);
                result3 = Math.floor((Math.random() * 20) + 1);
                result4 = Math.floor((Math.random() * 20) + 1);
                result5 = Math.floor((Math.random() * 20) + 1);
                break;
            }
            case "6":
            switch (input2) {
                case "100":
                result1 = Math.floor((Math.random() * 100) + 1);
                result2 = Math.floor((Math.random() * 100) + 1);
                result3 = Math.floor((Math.random() * 100) + 1);
                result4 = Math.floor((Math.random() * 100) + 1);
                result5 = Math.floor((Math.random() * 100) + 1);
                result6 = Math.floor((Math.random() * 100) + 1);

                break;
                case "2":
                result1 = Math.floor((Math.random() * 2) + 1);
                result2 = Math.floor((Math.random() * 2) + 1);
                result3 = Math.floor((Math.random() * 2) + 1);
                result4 = Math.floor((Math.random() * 2) + 1);
                result5 = Math.floor((Math.random() * 2) + 1);
                result6 = Math.floor((Math.random() * 2) + 1);

                break;
                case "3":
                result1 = Math.floor((Math.random() * 3) + 1);
                result2 = Math.floor((Math.random() * 3) + 1);
                result3 = Math.floor((Math.random() * 3) + 1);
                result4 = Math.floor((Math.random() * 3) + 1);
                result5 = Math.floor((Math.random() * 3) + 1);
                result6 = Math.floor((Math.random() * 3) + 1);

                break;
                case "4":
                result1 = Math.floor((Math.random() * 4) + 1);
                result2 = Math.floor((Math.random() * 4) + 1);
                result3 = Math.floor((Math.random() * 4) + 1);
                result4 = Math.floor((Math.random() * 4) + 1);
                result5 = Math.floor((Math.random() * 4) + 1);
                result6 = Math.floor((Math.random() * 4) + 1);

                break;
                case "5":
                result1 = Math.floor((Math.random() * 5) + 1);
                result2 = Math.floor((Math.random() * 5) + 1);
                result3 = Math.floor((Math.random() * 5) + 1);
                result4 = Math.floor((Math.random() * 5) + 1);
                result5 = Math.floor((Math.random() * 5) + 1);
                result6 = Math.floor((Math.random() * 5) + 1);

                break;
                case "6":
                result1 = Math.floor((Math.random() * 6) + 1);
                result2 = Math.floor((Math.random() * 6) + 1);
                result3 = Math.floor((Math.random() * 6) + 1);
                result4 = Math.floor((Math.random() * 6) + 1);
                result5 = Math.floor((Math.random() * 6) + 1);
                result6 = Math.floor((Math.random() * 6) + 1);

                break;
                case "8":
                result1 = Math.floor((Math.random() * 8) + 1);
                result2 = Math.floor((Math.random() * 8) + 1);
                result3 = Math.floor((Math.random() * 8) + 1);
                result4 = Math.floor((Math.random() * 8) + 1);
                result5 = Math.floor((Math.random() * 8) + 1);
                result6 = Math.floor((Math.random() * 8) + 1);

                break;
                case "10":
                result1 = Math.floor((Math.random() * 10) + 1);
                result2 = Math.floor((Math.random() * 10) + 1);
                result3 = Math.floor((Math.random() * 10) + 1);
                result4 = Math.floor((Math.random() * 10) + 1);
                result5 = Math.floor((Math.random() * 10) + 1);
                result6 = Math.floor((Math.random() * 10) + 1);

                break;
                case "12":
                result1 = Math.floor((Math.random() * 12) + 1);
                result2 = Math.floor((Math.random() * 12) + 1);
                result3 = Math.floor((Math.random() * 12) + 1);
                result4 = Math.floor((Math.random() * 12) + 1);
                result5 = Math.floor((Math.random() * 12) + 1);
                result6 = Math.floor((Math.random() * 12) + 1);

                break;
                case "20":
                result1 = Math.floor((Math.random() * 20) + 1);
                result2 = Math.floor((Math.random() * 20) + 1);
                result3 = Math.floor((Math.random() * 20) + 1);
                result4 = Math.floor((Math.random() * 20) + 1);
                result5 = Math.floor((Math.random() * 20) + 1);
                result6 = Math.floor((Math.random() * 20) + 1);
                break;
            }
        }
        switch (input1) {
            case "1":
            JOptionPane.showMessageDialog(null, "You rolled a " + result1);
            break;
            case "2":
            sum = result1 + result2;
            JOptionPane.showMessageDialog(null, "You rolled a " + result1 + "\n and a " + result2 + "\n\n Total: " + sum);
            break;
            case "3":
            sum = result1 + result2 + result3;
            JOptionPane.showMessageDialog(null, "You rolled a " + result1 + "\n and a " + result2 + "\n and a " + result3 + "\n\n Total: " + sum);
            break;
            case "4":
            sum = result1 + result2 + result3 + result4;
            JOptionPane.showMessageDialog(null, "You rolled a " + result1 + "\n and a " + result2 + "\n and a " + result3 + "\n and a " + result4 + "\n\n Total: " + sum);
            break;
            case "5":
            sum = result1 + result2 + result3 + result4 + result5;
            JOptionPane.showMessageDialog(null, "You rolled a " + result1 + "\n and a " + result2 + "\n and a " + result3 + "\n and a " + result4 + "\n and a " + result5 + "\n\n Total: " + sum);
            break;
            case "6":
            sum = result1 + result2 + result3 + result4 + result5 + result6;
            JOptionPane.showMessageDialog(null, "You rolled a " + result1 + "\n and a " + result2 + "\n and a " + result3 + "\n and a " + result4 + "\n and a " + result5 + "\n and a " + result6 + "\n\n Total: " + sum);
            break;
        }
    }//GEN-LAST:event_RollDieBtnActionPerformed

    private void NewCharacterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCharacterBtnActionPerformed
        // TODO add your handling code here:
         PathFinder p = new PathFinder();

        name = NameTf.getText();
        race = RaceTf.getText();
        sex = SexTf.getText();
        eyecolour = EyeColourTf.getText();
        Class1 = ClassTf.getText();
        String agee = AgeTf.getText();
        age = Integer.parseInt(agee);

        p.setName(name);
        p.setAge(age);
        p.setRace(race);
        p.setClass1(Class1);
        p.setSex(sex);
        p.setEyecolour(eyecolour);

        aList.add(p);
        JOptionPane.showMessageDialog(null, name + " your Character has been Created.");
        count++;

        NameTf.setText("");
        AgeTf.setText("");
        RaceTf.setText("");
        ClassTf.setText("");
        SexTf.setText("");
        EyeColourTf.setText("");
    }//GEN-LAST:event_NewCharacterBtnActionPerformed

    private void DisplayCharacterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayCharacterBtnActionPerformed
        // TODO add your handling code here:
        switch (Class1) {
            case "Barbarian":
            baseAttack = 1;
            will = 0;
            fortitude = 2;
            reflex = 0;
            HitDie = 12;
            break;
            case "Bard":
            baseAttack = 0;
            will = 2;
            fortitude = 0;
            reflex = 2;
            HitDie = 8;
            break;
        }

        for (int i = 0; i < aList.size(); i++) {
            JOptionPane.showMessageDialog(null, "Character Name: " + aList.get(i).getName() + "\n Age: " + aList.get(i).getAge() + "\n Eye Colour: " + aList.get(i).getEyecolour() + "\n Race: " + aList.get(i).getRace() + "\n Class: " + aList.get(i).getClass1() + "\n Sex: " + aList.get(i).getSex() + "\n" + "\n Strength:" + aList.get(i).getStrength() + "\n Dexterity: " + aList.get(i).getDexterity() + "\n Constitution: " + aList.get(i).getConstitution() + "\n Intellect: " + aList.get(i).getIntellect() + "\n Wis...(line truncated)...
                + "\n" + "\n Base Attack: " + baseAttack + "\n Fort Save: " + fortitude + "\n Reflex Save: " + aList.get(i).getReflex() + "\n Will Save: " + aList.get(i).getWill() + "\n Armour Class: " + aList.get(i).getArmourclass() + "\n" + "\nHit Die: " + aList.get(i).getHitDie() + "\n" + "\n Gold: " + aList.get(i).getGold());
        }
    }//GEN-LAST:event_DisplayCharacterBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("C:\\Users\\Conor\\Documents\\NetBeansProjects\\PathFinderApplication1\\output\\output.txt");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(aList);

            JOptionPane.showMessageDialog(null, "File written successfully");

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void LoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtnActionPerformed
        // TODO add your handling code here:
         File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("C:\\Users\\Conor\\Documents\\NetBeansProjects\\PathFinderApplication1\\output\\output.txt");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            aList = (ArrayList<PathFinder>) oStream.readObject();
            oStream.close();

            JOptionPane.showMessageDialog(this, "Character Details loaded Sucessfully from file");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_LoadBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        if(co == 1){
            Panel3.setVisible(true);
        }
        co = 0;
    }//GEN-LAST:event_quitBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Panel3.setVisible(false);
        co = 1;
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the  line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PathFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PathFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PathFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PathFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PathFinderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTf;
    private javax.swing.JTextField ClassTf;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DisplayCharacterBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JTextField EyeColourTf;
    private javax.swing.JButton LoadBtn;
    private javax.swing.JTextField NameTf;
    private javax.swing.JButton NewCharacterBtn;
    private javax.swing.JPanel Panel3;
    private javax.swing.JTextField RaceTf;
    private javax.swing.JButton RandomBtn;
    private javax.swing.JButton RollDieBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SexTf;
    private javax.swing.JLabel ZLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton quitBtn;
    // End of variables declaration//GEN-END:variables
}
